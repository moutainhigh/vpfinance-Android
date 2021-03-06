package cn.vpfinance.vpjr.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "LOAN_RECORD".
 */
public class LoanRecord {

    private Long id;
    private long lid;
    private long pid;
    private long page;
    private long pageSize;
    private long totalPage;
    private String username;
    private double rate;
    private double tendMoney;
    private String payStatus;
    private String paytime;
    private Integer isBook;
    private String voucherMoney;
    private String type;
    private String preProfit;//预计收益

    public String getPreProfit() {
        return preProfit;
    }
    public void setPreProfit(String preProfit) {
        this.preProfit = preProfit;
    }
    public LoanRecord() {
    }

    public LoanRecord(Long id) {
        this.id = id;
    }

    public LoanRecord(Long id, long lid, long pid, long page, long pageSize, long totalPage, String username, double rate, double tendMoney, String payStatus, String paytime, Integer isBook, String voucherMoney, String type) {
        this.id = id;
        this.lid = lid;
        this.pid = pid;
        this.page = page;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.username = username;
        this.rate = rate;
        this.tendMoney = tendMoney;
        this.payStatus = payStatus;
        this.paytime = paytime;
        this.isBook = isBook;
        this.voucherMoney = voucherMoney;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getLid() {
        return lid;
    }

    public void setLid(long lid) {
        this.lid = lid;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTendMoney() {
        return tendMoney;
    }

    public void setTendMoney(double tendMoney) {
        this.tendMoney = tendMoney;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public Integer getIsBook() {
        return isBook;
    }

    public void setIsBook(Integer isBook) {
        this.isBook = isBook;
    }

    public String getVoucherMoney() {
        return voucherMoney;
    }

    public void setVoucherMoney(String voucherMoney) {
        this.voucherMoney = voucherMoney;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
