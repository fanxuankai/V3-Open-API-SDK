package com.okcoin.commons.okex.open.api.bean.asset.result;

/**
 * @author fanxuankai
 */
public class TransferVo {

    /**
     * transId : 754147
     * ccy : USDT
     * from : 6
     * amt : 0.1
     * to : 18
     */

    private String transId;
    private String ccy;
    private String from;
    private String amt;
    private String to;

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
