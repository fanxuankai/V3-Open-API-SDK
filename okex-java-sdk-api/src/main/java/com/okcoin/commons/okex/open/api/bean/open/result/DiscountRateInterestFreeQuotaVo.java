package com.okcoin.commons.okex.open.api.bean.open.result;

/**
 * @author fanxuankai
 */
public class DiscountRateInterestFreeQuotaVo {

    /**
     * ccy : BTC
     * amt : 2
     * discountLv : 1
     */

    private String ccy;
    private String amt;
    private String discountLv;

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

    public String getDiscountLv() {
        return discountLv;
    }

    public void setDiscountLv(String discountLv) {
        this.discountLv = discountLv;
    }
}
