package com.okcoin.commons.okex.open.api.bean.asset.result;

/**
 * @author fanxuankai
 */
public class PurchaseRedemptVo {

    /**
     * ccy : BTC
     * amt : 1
     * side : purchase
     */

    private String ccy;
    private String amt;
    private String side;

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
