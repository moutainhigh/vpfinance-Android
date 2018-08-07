package cn.vpfinance.vpjr.module.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import com.jewelcredit.ui.widget.ActionBarWhiteLayout;
import com.jewelcredit.util.HttpService;
import com.jewelcredit.util.ServiceCmd;
import com.jewelcredit.util.Utils;

import org.json.JSONObject;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.vpfinance.android.R;
import cn.vpfinance.vpjr.base.BaseActivity;
import cn.vpfinance.vpjr.util.FormatUtils;
import cn.vpfinance.vpjr.view.CodeVerifyView;
import cn.vpfinance.vpjr.view.VerificationCodeDialog;

public class BindPhoneByAbleCodeActivity extends BaseActivity {

    @Bind(R.id.mActionBar)
    ActionBarWhiteLayout mActionBar;
    @Bind(R.id.vCodeVerifyView)
    CodeVerifyView vCodeVerifyView;
    @Bind(R.id.tvErrorInfo)
    TextView tvErrorInfo;
    @Bind(R.id.tvCodeHint)
    TextView tvCodeHint;
    @Bind(R.id.tvCountDownInfo)
    TextView tvCountDownInfo;

    public static final int VERIFY_OLD_PHONE = 100;
    public static final int VERIFY_NEW_PHONE = 101;
    private int type = VERIFY_OLD_PHONE;
    private int mDelaySeconds = 120;
    private String phone = "";

    private Handler mSmsHandler = new Handler();
    private HttpService mHttpService;

    public static void goThis(Context context, int type, String phone) {
        Intent intent = new Intent(context, BindPhoneByAbleCodeActivity.class);
        intent.putExtra("type", type);
        intent.putExtra("phone", phone);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind_phone_by_able);
        ButterKnife.bind(this);
        mHttpService = new HttpService(this, this);

        Intent intent = getIntent();
        type = intent.getIntExtra("type", VERIFY_OLD_PHONE);
        phone = intent.getStringExtra("phone");

        mActionBar.reset().setHeadBackVisible(View.VISIBLE).setTitle("验证手机号");

        vCodeVerifyView.setOnFullCodeListener(new CodeVerifyView.OnFullCodeListener() {
            @Override
            public void fullCodeListener() {
                String code = vCodeVerifyView.getText().toString();
                if (type == VERIFY_OLD_PHONE) {
                    mHttpService.getVerifyOldPhone(phone, code);
                } else if (type == VERIFY_NEW_PHONE) {
                    mHttpService.getVerifyNewPhone(phone, code);
                }
            }

            @Override
            public void restoreListener() {
                tvErrorInfo.setVisibility(View.INVISIBLE);
            }
        });

        if (type == VERIFY_OLD_PHONE) {
            mHttpService.getVerifyCode(null, null, null, phone, null, "0");
            mSmsHandler.postDelayed(mSmsCallback, 1000);
            tvCodeHint.setText("已向手机号" + FormatUtils.hidePhone(phone) + "发送了验证码");
        } else if (type == VERIFY_NEW_PHONE) {
            mHttpService.getVerifyCode(null, null, null, phone, null, "1");
            tvCodeHint.setText("请输入手机尾号" + (phone.substring(phone.length() - 4)) + "的手机验证码");
        }

        tvCountDownInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (type == VERIFY_OLD_PHONE) {
                    mHttpService.getVerifyCode(null, null, null, phone, null, "0");
                } else if (type == VERIFY_NEW_PHONE) {//注意这里type也是传1
                    mHttpService.getVerifyCode(null, null, null, phone, null, "1");
                }
                mSmsHandler.postDelayed(mSmsCallback, 1000);
            }
        });
    }

    @Override
    public void onHttpSuccess(int reqId, JSONObject json) {
        if (!isHttpHandle(json)) return;
        if (reqId == ServiceCmd.CmdId.CMD_getVerifyCode.ordinal()) {
            String errmsg = mHttpService.onGetVerifyCode(json);
            int msg = json.optInt("msg", -1);
            if (5 == msg) {
                //状态为5,弹出验证码
                smsFinish();
                showDialog();
            } else if (6 == msg) {
                smsFinish();
            }
            Utils.Toast(errmsg);
        } else if (reqId == ServiceCmd.CmdId.CMD_VERIFY_LOD_PHONE.ordinal()) {
            String msg = json.optString("msg");
            if ("1".equals(msg)) {
                BindPhoneInputPhoneActivity.goThis(BindPhoneByAbleCodeActivity.this);
                finish();
            } else if ("2".equals(msg)) {
                vCodeVerifyView.error();
                tvErrorInfo.setVisibility(View.VISIBLE);
            }
        } else if (reqId == ServiceCmd.CmdId.CMD_VERIFY_NEW_PHONE.ordinal()) {
            //0.验证码有误1.正确2.手机号已经存在
            String msg = json.optString("msg");
            if ("1".equals(msg)) {
                BindPhoneSuccessActivity.goThis(BindPhoneByAbleCodeActivity.this);
                finish();
            } else if ("0".equals(msg)) {
                vCodeVerifyView.error();
                tvErrorInfo.setVisibility(View.VISIBLE);
            } else if ("2".equals(msg)) {
                Utils.Toast("手机号已经存在");
            }
        }
    }

    @Override
    public void onHttpError(int reqId, String errmsg) {
        if (reqId == ServiceCmd.CmdId.CMD_getVerifyCode.ordinal()) {
            smsFinish();
        }
    }

    private Runnable mSmsCallback = new Runnable() {
        @Override
        public void run() {
            mDelaySeconds--;
            if (mDelaySeconds <= 0) {
                smsFinish();
                return;
            }
            tvCountDownInfo.setEnabled(false);
            tvCountDownInfo.setText(mDelaySeconds + "s后重新发送");
            mSmsHandler.postDelayed(this, 1000);
        }
    };

    private void smsFinish() {
        tvCountDownInfo.setText("重新发送");
        tvCountDownInfo.setTextColor(ContextCompat.getColor(BindPhoneByAbleCodeActivity.this, R.color.text_4985ff));
        tvCountDownInfo.setEnabled(true);
        mSmsHandler.removeCallbacks(mSmsCallback);
    }

    public void showDialog() {
        VerificationCodeDialog codeDialog = VerificationCodeDialog.newInstance(phone, 1);
        codeDialog.setSmsListener(new VerificationCodeDialog.SmsListener() {
            @Override
            public void smsStart(int type) {
//                mHttpService.getVerifyCode(null, null, null, phone, null,"0");
                mSmsHandler.postDelayed(mSmsCallback, 1000);
            }
        });
        codeDialog.show(getSupportFragmentManager(), "VerificationCodeDialog");
    }

    @Override
    protected void onDestroy() {
        smsFinish();
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}