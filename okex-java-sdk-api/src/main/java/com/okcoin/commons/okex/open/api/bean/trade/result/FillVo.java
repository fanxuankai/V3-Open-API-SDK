package com.okcoin.commons.okex.open.api.bean.trade.result;

/**
 * @author fanxuankai
 */
public class FillVo {

    /**
     * instType : FUTURES
     * instId : BTC-USD-200329
     * tradeId : 123
     * ordId : 123445
     * billId : 1111
     * tag :
     * fillPx : 999
     * fillSz : 3
     * side : buy
     * posSide : long
     * execType : M
     * feeCcy :
     * fee :
     * ts : 1597026383085
     */

    private String instType;
    private String instId;
    private String tradeId;
    private String ordId;
    private String billId;
    private String tag;
    private String fillPx;
    private String fillSz;
    private String side;
    private String posSide;
    private String execType;
    private String feeCcy;
    private String fee;
    private String ts;

    public String getInstType() {
        return instType;
    }

    public void setInstType(String instType) {
        this.instType = instType;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getFillPx() {
        return fillPx;
    }

    public void setFillPx(String fillPx) {
        this.fillPx = fillPx;
    }

    public String getFillSz() {
        return fillSz;
    }

    public void setFillSz(String fillSz) {
        this.fillSz = fillSz;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getPosSide() {
        return posSide;
    }

    public void setPosSide(String posSide) {
        this.posSide = posSide;
    }

    public String getExecType() {
        return execType;
    }

    public void setExecType(String execType) {
        this.execType = execType;
    }

    public String getFeeCcy() {
        return feeCcy;
    }

    public void setFeeCcy(String feeCcy) {
        this.feeCcy = feeCcy;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
