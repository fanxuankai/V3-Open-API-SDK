package com.okcoin.commons.okex.open.api.bean.asset.param;

/**
 * @author fanxuankai
 */
public class WithdrawalDto {

    /**
     * amt : 1
     * fee : 0.0005
     * pwd : 123456
     * dest : 4
     * ccy : BTC
     * toAddr : 17DKe3kkkkiiiiTvAKKi2vMPbm1Bz3CMKw
     */

    private String amt;
    private String fee;
    private String pwd;
    private String dest;
    private String ccy;
    private String toAddr;

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getToAddr() {
        return toAddr;
    }

    public void setToAddr(String toAddr) {
        this.toAddr = toAddr;
    }
}
