package com.jewelcredit.util;

public class ServiceCmd {

    static public enum CmdId {
        CMD_PROTOCAL,
        CMD_PROTOCAL_EDBT,//《债权转让及受让协议》范本
        CMD_getVerifyCode,
        CMD_userRegister,
        CMD_userLogin,
        CMD_enterpriseUserLogin,//企业用户登录
        CMD_forgetLoginPassword,//找回密码
        CMD_resetLoginPassword,
        CMD_modifyLoginPassword,
        CMD_resetTradePassword,
        CMD_modifyTradePassword,
        CMD_authenQuery,//实名认证
        CMD_realnameAuth,
        CMD_HOME_INFO,//首页最新标的信息获取
        CMD_getAutomaticProductList,//智存列表，详情
        CMD_BOND_PRODUCT_LIST,//获取债权转让标列表
        CMD_AUTOMATIC,//智存
        CMD_BUYTRANSFER,//购买智存
        CMD_getBidList,//产品列表
        CMD_loanSignInfo,//定期产品详情
        CMD_PLANK,//
        CMD_addCard,//银行卡绑定,更改
        CMD_getBankCard,//获取银行卡信息接口
        CMD_delBankCard,
        CMD_GET_PAY_INFO,//生成充值信息
        CMD_GET_PAY_INFO_NEW,//生成充值信息新版本
        CMD_WITHDRAW,
        CMD_member_center,//个人帐户信息
        CMD_getLoanInfo,
        CMD_getLoanBidList,//出借记录分页
        CMD_getLoanBidListForDeposit,//出借记录分页(定存宝)
        CMD_doBid,
        CMD_getWithDrawalListFirst,
        CMD_querySessionStatus,//会话维持，检查
        CMD_query_page,
        CMD_INVEST_RECORD,//个人中心出借记录
        CMD_BANNER,
        CMD_APPUPDATE,//
        CMD_LOGOUT,//退出登录
        CMD_LOAN_SING_DESC,
        CMD_LOAN_SING_ATTR,
        CMD_activeLiteAccount,
        CMD_drawEarnings,
        CMD_liteMoneyInfo,//获取用户体验金信息
        CMD_liteJoinList,
        CMD_VOUCHERLIST,
        CMD_VOUCHERLIST_V2, //新的代金券，分页接口
        CMD_VOUCHERLIST_TAB, //新的代金券TAB
        CMD_voucherExchange,//代金券兑换码
        CMD_getPromoteLinks,
        CMD_isExistPhone,
        CMD_rateComb,
        CMD_Mofang_remoteCtrl,//控制路演活动标展示
        CMD_baoliLoansignDesc,//保理资料接口
        CMD_FundOverView,//资金总览
        CMD_FundFlow,//资金流水
        CMD_FundRecord,  //出借记录
        CMD_TradeFlowRecord, //回款记录
        CMD_InviteGiftShowInfo,  //邀请有礼显示信息
        CMD_InvestAwardRecord,  //出借奖励记录
        CMD_RegistAwardRecord,  //注册奖励记录
        CMD_GETUI_loginSendMess,
        CMD_ResetPayPassword,  //找回交易密码
        CMD_BIND_EMAIL,
        CMD_updateUserBasicInfo,
        CMD_withdrawCharge,  //提现费用
        CMD_GONGGAO,//平台公告
        CMD_NEWS,
        CMD_HELP,
        CMD_GUIDE_PAGE,
        CMD_CancelWithdraw,  //取消提现
        CMD_GET_SHARE_URL,
        CMD_PredictMoney,    //预计收益
        CMD_NewAct,  //最新活动
        CMD_GetVpUrl,  //获取服务器地址
        CMD_commonLoanDesc,
        CMD_REGISTER_USERAGREEMENT,
        CMD_loanVoucherIsUse,
        CMD_RedPactetInfo,    //分享红包信息
        CMD_HomePresellProduct,    //获取首页沈阳标
        CMD_PresellProductInfo,    //获取沈阳标基本信息
        CMD_PresellProductH5,    //获取沈阳标H5
        CMD_Presell_protocol, //沈阳合同范本
        CMD_Message_Notice, //我的账户消息通知
        CMD_XiaoWei_NoticeList, //小微头条
        CMD_Transfer_Assign_List, //个人中心债权
        CMD_Transfer_Assign_Detail, //债权详情
        CMD_Transfer_Assign_Refund, //债权详情-回款计划
        CMD_Invest_Record_Refund, //出借记录详情-还款计划
        CMD_Transfer_Assign_Now, //转让债权
        CMD_Home_Product_Info, //首页轮转标请求
        CMD_Bank_Type_List, //银行类型列表
        CMD_resetTradePasswordNew,//设置交易密码不用验证码
        CMD_bankLimitAmount,//银行卡限额
        CMD_RandomUserName,//随机返回用户名
        CMD_User_HeadImage,//用户头像上传
        CMD_voucherRate,//代金券比率
        CMD_OneYear,//周年庆活动
        CMD_OneYear_GetVoucher,//周年庆活动是否领取过代金券
        CMD_AssetStatistics,//出借统计资产总额
        CMD_TenderPromit,//出借统计收益总额
        CMD_Invest_Top,//财富收益榜排名
        CMD_ProductInvestDistribution,//产品出借分布
        CMD_LookAllMedals,//查看所有勋章
        CMD_Personal_Card,//个人名片
        CMD_Upload_BackGround,//背景上传
        CMD_My_Describe,//修改个性签名
        CMD_LookPrivateSetting,//查看隐式设置
        CMD_ChangePrivateSetting,//设置隐式设置
        CMD_Car_Product_Protocol,//车贷协议一
        CMD_Car_Product_Protocol_2,//车贷协议二
        CMD_Voice_Captcha, //语音验证码
        CMD_Addrate_Ticket_Tab, //获取加息券(分不同类型)
        CMD_Addrate_Ticket_invest, //出借可用加息券
        CMD_Addrate_Income, //计算加息抵扣金额
        CMD_Home_Event,//奥运推广页
        CMD_Webview_Share_Content,//获取webview分享内容
        CMD_Webview_Share_Success,//获取webview分享成功后传递数据给后台
        CMD_Transfer_cost,//转让手续费
        CMD_Invest_Give_Iphone,//出借送iphone页面文案
        CMD_Loan_Sign_List_New,//新的定期界面
        CMD_loanSignInfo_New,//新的定期产品详情
        CMD_Regular_Tab,//通用请求tab接口
        CMD_Tab_Permission,//tab查看权限控制
        CMD_Transfer_Product_Info,//债权转让基本信息
        CMD_VERSION_CHECK,//版本更新检查
        CMD_LOAN_PROTOCOL,//出借协议
        CMD_IMAGE_CODE,//图形验证码
        CMD_VERIFY_IMAGE_CODE,//图形验证码校验
        CMD_Record_Detail_info,//出借记录详情
        CMD_Record_Deposit_Detail_info,//出借记录详情(定存宝)
        CMD_Return_Calendar_Time,//查询指定月份有回款事件的天数
        CMD_Get_Event_ByDay, //查询指定天的回款事件
        CMD_APPMEMBER_INDEX,//首页3.0.0
        CMD_Loan_Sign_Pool,//定存宝列表
        CMD_Loan_Sign_Pool_Info,//定存宝产品详情
        CMD_Loan_Sign_Pool_Invest,//定存宝购买
        CMD_Loan_Sign_Info,//定存宝债权详情
        CMD_SERVICE_TIME,//获取服务器时间
        CMD_Deposit_Is_Show,//列表定存宝是否显示
        CMD_E_Account,//我的e账户
        CMD_Bank_Transfer_Verify,//转让规则匹配
        CMD_Bank_Real_Tender_Money,//查询华兴标当前锁定金额
        CMD_Auto_Plan_Setting,//自动投标设置
        CMD_Auto_Plan_Setting_Get,//自动投标设置(获取)
        CMD_Loan_Sign_Type,//列表tab
        CMD_SHARE_RED_PACKET_LIST,//红包分享列表
        CMD_VERIFY_LOD_PHONE,//验证原手机号
        CMD_VERIFY_NEW_PHONE,//验证新手机号
        CMD_AGREE_AUTO_TENDER_PROTOCOL,//是否同意自动投标
        CMD_IS_GET_WELFARE,//是否已领取福利
        CMD_COUPON_LIST,//获取所有优惠券列表
        CMD_QUERY_POP_UP,//APP查询弹窗内容
        CMD_QUERY_AUTO_PLANK_STATUS,//启动APP查询用户投标状态
        CMD_unAuthAutoBid,//撤销自动投标授权
        CMD_HX_SEND_SMS,//发送华兴短信验证码
        CMD_HX_IS_UPDATE,//华兴接口是否已经更新
        CMD_CREATE_ACCOUNT_TIME,//判断用户hx存管账户开户时间
        CMD_REGISTER_CAPTCHA_IMAGE,//注册图形验证码
        CMD_REGISTER_CHECK_CAPTCHA_IMAGE,//注册验证图形验证码
        CMD_REGISTER_CAPTCHA_SMS,//注册短信验证码
        CMD_REGISTER_CAPTCHA_VOICE,//注册语音验证码
        CMD_REGISTER_CHECK_CAPTCHA_SMS_VOICE,//注册验证短信或语音验证码
        CMD_REPAY_PLAN_FLOAT,//还款计划:浮动计息
        CMD_IS_BIND_WEIXIN,//是否已经绑定微信
        CMD_CHANGE_EMAIL_PERSON,//更改个人邮箱
        CMD_CHANGE_EMAIL_COMPANY,//更改企业邮箱
        CMD_UNBIND_EMAIL,//邮箱解绑
        CMD_CHECK_SMS_CODE,//校验短信验证码(企业校验,包括修改手机号/注册)
        CMD_WEIXIN_REGISTER,//微信登录时注册
        CMD_WEIXIN_BIND,//绑定用户微信
        CMD_RESPONSIBLE_PHONE,//获取经办人手机号
        CMD_RESET_PWD_PERSON,//(个人)(忘记密码)重置密码
        CMD_RESET_PWD_COMPANY,//(企业)(忘记密码)重置密码
        CMD_CHANGE_COMPANY_PHONE,//修改经办人手机号
        CMD_WEIXIN_UNBIND,//解绑微信
        CMD_COMPANY_REGISTER,//企业注册
        CMD_WEIXIN_ACCESS_TOKEN,//微信access_token,不取这的url
        CMD_ASSIGNMENT_OF_DEBT_COMMIT//债权转让(提交)
        ,CMD_MSG_LIST//消息中心列表
        ,CMD_IS_READ_MSG//是否有未读消息
        ,CMD_ALL_READ//设为全部已读
    }

    public static String[] methods = {
            "loaninfo/loan_protocol",//
            "loaninfo/debt_protocol",//《债权转让及受让协议》范本
            "Appregister/sendSms",//短息验证
            "Appregister/register",//注册
            "Appregister/Applogin",//登录
            "Appregister/AppCompanyLogin", //企业用户登录
            "appupdate_info/reset_pwd",        //找回密码
            "appupdate_info/update_pwd",
            "appupdate_info/update_pwd",
            "appupdate_info/update_trans_pwd",
            "appupdate_info/update_trans_pwd",//修改交易密码
            "Appmember/identityValidate",//实名认证
            "Appmember/identityValidate",
            "Appmember/lastestLoanSign",//首页最新标的信息获取
            "AppDcb/dcblist",//智存列表，详情
            "AppLoan/loanCirList",//获取债权转让标列表
            "AppDcb/dcbinfo",//智存
            "AppDcb/buyTransfer",//购买智存
            "AppLoan/loanSignList",//产品列表
            "AppLoan/loanSignInfo",//定期产品详情
            "AppPlank/plank",//
            "AppBankcard/addCard.json",//银行卡绑定,更改
            "AppBankcard/getBankCard",//获取银行卡信息
            "AppBankcard/delBankCard.json",        //删除银行卡
            "llpay/toAppPay",//生成充值信息
            "AppRecharge/toAppPay",//生成充值信息新版本
            "AppWithdraw/withdrawApply",
            "Appmember_index/member_center.json",//个人帐户信息
            "loan/loanDetails",
            "AppLoan/loanRecordList",//出借记录分页
            "AppLoanPool/dcbLoanRecordList",//出借记录分页(定存宝)
            "MemCent/memInvestment",
            "withdrawCash/selWithdrawCashRecord",
            "appupdate_info/querySessionStatus",//会话维持，检查
            "Appcontract/query_page.json",//回款查询
            "Appdepositshistory/record.json",//个人中心出借记录
            "Appmember/banner",
            "appupdate_info/queryLastAppVersion",
            "Appregister/safety_exit",//退出登录
            "AppLoan/loanSignDesc",
            "AppLoan/loanSignAttr",
            "AppLiteMomey/activeLiteAccount",
            "AppLiteMomey/drawEarnings",
            "AppLiteMomey/liteMoneyInfo",//获取用户体验金信息
            "AppLiteMomey/liteJoinList",
            "AppVoucher/voucherlist",
            "AppVoucher/voucherlistpage",//新的代金券，分页接口
            "AppVoucher/voucherlisttab",//新的代金券TAB
            "AppVoucher/voucherExchange",//代金券兑换码
            "AppGeneralize/getPromoteLinks",
            "Appregister/isExistPhone",
            "AppLoan/rateComb",
            "AppMofang/remoteCtrl",//控制路演活动标展示
            "AppLoan/baoliLoansignDesc",//保理资料接口
            "MyCount/assetView",//资金总览
            "moneyFlow/rechargeWithdrawFlow",//资金流水
            "MyCount/tenderRecord",//出借记录
            "MyCount/returnMoney",//回款记录
            "generalizeApp/generMainPage", //邀请有礼显示信息
            "generalizeApp/generTenderRecord",//出借奖励记录
            "generalizeApp/invitePerRecord",//注册奖励记录
            "GeTui/saveClientId",
            "appupdate_info/reset_trans_pwd",//找回交易密码
            "Appmember_index/bindingEmail",
            "appupdate_info/updateUserBasicInfo",
            "AppWithdraw/withdrawCharge", //提现费用
            "AppContent/news?type=4",//平台公告
            "AppContent/news?type=2",
            "AppContent/news?type=3",
            "Appmember/guidePage",
            "AppWithdraw/cancelWithdraw",  //取消提现
            "generalizeApp/getShareUrl",
            "AppLoan/caculateTenderIncome",  //预计收益
            "AppContent/news?type=1",    //最新活动
            "Appmember/getVpUrl",    //获取服务器地址
            "AppLoan/commonLoanDesc",
            "registration/useragreement",
            "AppVoucher/loanVoucherIsUse",
            "AppVoucher/redVoucherInfo", //分享红包信息
            "Appmember/lastestLoanSignCrowd", //获取首页沈阳标
            "AppLoan/loanSignInfoCrowd", //获取沈阳标基本信息
            "AppLoan/projectDetailCrowd", //获取沈阳标H5
            "loaninfo/loan_protocol_shenyang", //沈阳合同范本
            "AppContent/messageNotice", //我的账户消息通知
            "AppContent/noticeList", //小微头条
            "apploanManage/myAssignmentList", // 个人中心债权
            "apploanManage/myAssignmentDetail", // 债权详情
            "MyCount/getReturnMoneyRecordById", // 债权详情-回款计划
            "MyCount/getReturnMoneyRecordByRecordId", // 出借记录详情-还款计划
            "AppAssignment/assignmentPost", // 转让债权
            "apploanManage/getSaleingLoan", // 首页轮转标请求
            "AppBankcard/getBankTypeList",//银行类型列表
            "appupdate_info/update_trans_pwd_new",    //设置交易密码不用验证码
            "AppContent/tosupportbank",    //银行卡限额
            "AppUtil/generalizeUserName",//随机返回用户名
            "AppUtil/picupload",    //头像上传
            "AppVoucher/voucherrate",    //代金券比率
            "apponeyear/showBox",    //周年庆活动
            "apponeyear/getVoucher",    //周年庆活动是否领取代金券
            "appmedal/assetStatistics",    //出借统计资产总额
            "appmedal/tenderPromit",//出借统计收益总额
            "appmedal/promitRank",    //财富收益榜排名
            "appmedal/productTenderDistri",    //产品出借分布
            "appmedal/selectUserMedals",    //查看所有勋章
            "appmedal/mySocialCenter",    //个人名片
            "AppUtil/backgroundImageload",    //背景上传接口
            "appmedal/updateSignature",    //修改个性签名
            "appmedal/selectUserSettings",    //查看隐式设置
            "appmedal/updateUserSettings",    //设置隐式设置
            "loaninfo/loan_protocol_2",    //车贷协议一
            "loaninfo/loan_protocol_carloan",    //车贷协议二
            "Appregister/sendYuyinMess",//语音验证码
            "AppCoupon/couponlisttab",//获取加息券(分不同类型)
            "AppCoupon/couponlistCanUse",//出借可用加息券
            "AppCoupon/caculateAddIncome",//计算加息抵扣金额
            "AppCoupon/olympicsPage",//奥运推广页
            "activity/getShareContent",//获取webview分享内容
            "newyear/shareAddDrawNum.htm",//获取webview分享成功后传递数据给后台
            "AppLoan/getDebtFee",//转让手续费
            "AppLoan/investPage",//出借送iphone页面文案
            "AppLoan/loanSignListNew",//新的定期界面
            "AppLoan/loanSignInfoNew",//新的定期产品详情
            "cmd_regular_tab",//通用请求tab接口
            "AppLoan/getAccessType",//tab查看权限控制
            "AppLoan/showTabContent",//债权转让基本信息
            "appupdate_info/queryAppVersionStatus",//版本更新检查
            "AppLoan/getProtocol",//出借协议
            "Appregister/sendImageCode",//图形验证码
            "Appregister/verifyImageCode",//图形验证码校验
            "AppLoan/getTenderRecordDetail",//出借记录详情
            "AppLoanPool/tenderRecordDetail",//出借记录详情(定存宝)
            "MyCount/getReturnCalendarTime",//查询指定月份有回款事件的天数
            "MyCount/getEventByDay",//查询指定天的回款事件`
            "Appmember/index",//首页3.0.0
            "AppLoanPool/loanSignPool",//定存宝列表
            "AppLoanPool/loanSignPoolInfo",//定存宝产品详情
            "AppPlank/dcbPlank",//定存宝购买
            "AppLoanPool/loanSignInfo",//定存宝债权详情
            "AppLoan/getServerTime",//获取服务器时间
            "AppLoanPool/isShowDcb",//列表定存宝是否显示
            "Appmember_index/eAccountInfo",//我的存管账户
            "AppAssignment/transfeVerify",//转让规则匹配
            "AppLoan/hxRealTenderMoney",//查询华兴标当前锁定金额
            "AppAutoPlankSetting/saveSetting",//自动投标设置
            "AppAutoPlankSetting/getSetting",//自动投标设置(获取)
            "AppLoan/getLoansignType",//列表tab
            "MyCount/shareRedPacketList",//红包分享列表
            "Appregister/verifySmsCode",//验证原手机号
            "Appmember/validatePhone",//验证新手机号
            "Appmember_index/agreeAutoTenderProtocol",//是否同意自动投标
            "Appmember/queryIsSend",//是否已领取福利
            "AppCoupon/couponList",//获取所有优惠券列表
            "Appmember/queryPopUp",//APP查询弹窗内容
            "Appmember/queryAutoPlankStatus",//启动APP查询用户投标状态
            "hx/loansign/unAuthAutoBid",//撤销自动投标授权
            "hx/loansign/sendsms",//发送华兴短信验证码
            "Appmember/isUpdate",//华兴接口是否已经更新
            "Appmember/createAccountTime",//判断用户hx存管账户开户时间
            "/user/register/sendImageCode",//注册图形验证码
            "Appregister/registerVerifyImageCode",//注册验证图形验证码
            "Appregister/sendSms",//注册短信验证码
            "Appregister/sendYuyinMess",//注册语音验证码
            "register/verifySmsCode",//注册验证短信或语音验证码
            "AppLoan/getFloatInvestTypeReturnPlans",//还款计划:浮动计息
            "AppWx/isBindWx",//是否已经绑定微信
            "Appmember_index/bindingEmail" ,//更改个人邮箱
            "appupdate_info/changeCompanyEmail", ////更改企业邮箱
            "appupdate_info/unbindEmail", ////邮箱解绑
            "Appregister/ckeckCode", ////校验短信验证码
            "AppWx/wxRegister" ,//微信登录时注册
            "AppWx/bindWx" ,//绑定用户微信
            "appupdate_info/queryManagerPhone",//查询经办人手机号
            "appupdate_info/reset_pwd",//(个人)(忘记密码)重置密码
            "appupdate_info/companyResetPwd",//(企业)(忘记密码)重置密码
            "appupdate_info/changeManagerPhone",//修改经办人手机号
            "AppWx/unbindWx",//解绑微信
            "Appregister/companyRegist",//企业注册
            "https://api.weixin.qq.com/sns/oauth2/access_token?",//微信access_token不取这的url
            "/AppAssignment/nowTransfer"//债权转让(提交)
            ,"Appmember/messageCenter"//消息中心列表
            ,"Appmember/queryUnRead"//是否有未读消息
            ,"Appmember/allRead"//设为全部已读
    };

    public static String getMethodName(CmdId methodId) {
        int ordinal = methodId.ordinal();
        if (ordinal < 0 || ordinal >= methods.length)
            return "";

        return methods[ordinal];
    }

}
