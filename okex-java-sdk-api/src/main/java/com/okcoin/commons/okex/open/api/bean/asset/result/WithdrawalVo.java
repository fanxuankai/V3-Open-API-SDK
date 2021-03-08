package com.okcoin.commons.okex.open.api.bean.asset.result;

/**
 * @author fanxuankai
 */
public class WithdrawalVo {

    /**
     * amt : 0.1
     * wdId : 67485
     * ccy : BTC
     */

    private String amt;
    private String wdId;
    private String ccy;

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getWdId() {
        return wdId;
    }

    public void setWdId(String wdId) {
        this.wdId = wdId;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }
}
