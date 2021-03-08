package com.okcoin.commons.okex.open.api.bean.trade.result;

/**
 * @author fanxuankai
 */
public class OrdersAlgoVo {

    /**
     * instType : FUTURES
     * instId : BTC-USD-200329
     * ordId : 123445
     * ccy : BTC
     * algoId : 1234
     * sz : 999
     * ordType : oco
     * side : buy
     * posSide : long
     * tdMode : cross
     * state : 1
     * lever : 20
     * tpTriggerPx :
     * tpOrdPx :
     * slTriggerPx :
     * triggerPx : 99
     * ordPx : 12
     * actualSz :
     * actualPx :
     * actualSide :
     * triggerTime : 1597026383085
     * cTime : 1597026383000
     */

    private String instType;
    private String instId;
    private String ordId;
    private String ccy;
    private String algoId;
    private String sz;
    private String ordType;
    private String side;
    private String posSide;
    private String tdMode;
    private String state;
    private String lever;
    private String tpTriggerPx;
    private String tpOrdPx;
    private String slTriggerPx;
    private String triggerPx;
    private String ordPx;
    private String actualSz;
    private String actualPx;
    private String actualSide;
    private String triggerTime;
    private String cTime;

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

    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getAlgoId() {
        return algoId;
    }

    public void setAlgoId(String algoId) {
        this.algoId = algoId;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    public String getOrdType() {
        return ordType;
    }

    public void setOrdType(String ordType) {
        this.ordType = ordType;
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

    public String getTdMode() {
        return tdMode;
    }

    public void setTdMode(String tdMode) {
        this.tdMode = tdMode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getTpTriggerPx() {
        return tpTriggerPx;
    }

    public void setTpTriggerPx(String tpTriggerPx) {
        this.tpTriggerPx = tpTriggerPx;
    }

    public String getTpOrdPx() {
        return tpOrdPx;
    }

    public void setTpOrdPx(String tpOrdPx) {
        this.tpOrdPx = tpOrdPx;
    }

    public String getSlTriggerPx() {
        return slTriggerPx;
    }

    public void setSlTriggerPx(String slTriggerPx) {
        this.slTriggerPx = slTriggerPx;
    }

    public String getTriggerPx() {
        return triggerPx;
    }

    public void setTriggerPx(String triggerPx) {
        this.triggerPx = triggerPx;
    }

    public String getOrdPx() {
        return ordPx;
    }

    public void setOrdPx(String ordPx) {
        this.ordPx = ordPx;
    }

    public String getActualSz() {
        return actualSz;
    }

    public void setActualSz(String actualSz) {
        this.actualSz = actualSz;
    }

    public String getActualPx() {
        return actualPx;
    }

    public void setActualPx(String actualPx) {
        this.actualPx = actualPx;
    }

    public String getActualSide() {
        return actualSide;
    }

    public void setActualSide(String actualSide) {
        this.actualSide = actualSide;
    }

    public String getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }

    public String getCTime() {
        return cTime;
    }

    public void setCTime(String cTime) {
        this.cTime = cTime;
    }
}
