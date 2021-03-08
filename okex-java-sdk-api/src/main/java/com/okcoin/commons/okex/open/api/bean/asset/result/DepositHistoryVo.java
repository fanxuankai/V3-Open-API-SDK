package com.okcoin.commons.okex.open.api.bean.asset.result;

/**
 * @author fanxuankai
 */
public class DepositHistoryVo {

    /**
     * amt : 223.18782496
     * txId : 6d892c669225b1092c780bf0da0c6f912fc7dc8f6b8cc53b003288624c
     * ccy : USDT
     * from :
     * to : 39kK4XvgEuM7rX9frgyHoZkWqx4iKu1spD
     * ts : 1597026383085
     * state : 2
     * depId : 4703779
     */

    private String amt;
    private String txId;
    private String ccy;
    private String from;
    private String to;
    private String ts;
    private String state;
    private String depId;

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
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

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }
}
