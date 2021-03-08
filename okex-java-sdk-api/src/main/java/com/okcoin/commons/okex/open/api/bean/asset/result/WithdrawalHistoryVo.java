package com.okcoin.commons.okex.open.api.bean.asset.result;

/**
 * @author fanxuankai
 */
public class WithdrawalHistoryVo {

    /**
     * amt : 0.094
     * wdId : 4703879
     * fee : 0.01000000eth
     * txId : 0x62477bac6509a04512819bb1455e923a60dea5966c7caeaa0b24eb8fb0432b85
     * ccy : ETH
     * from : 13426335357
     * to : 0xA41446125D0B5b6785f6898c9D67874D763A1519
     * ts : 1597026383085
     * state : 2
     */

    private String amt;
    private String wdId;
    private String fee;
    private String txId;
    private String ccy;
    private String from;
    private String to;
    private String ts;
    private String state;

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

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
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
}
