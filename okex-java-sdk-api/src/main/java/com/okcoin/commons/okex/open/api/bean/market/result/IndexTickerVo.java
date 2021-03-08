package com.okcoin.commons.okex.open.api.bean.market.result;

/**
 * @author fanxuankai
 */
public class IndexTickerVo {

    /**
     * instId : BTC-USDT
     * idxPx : 0.1
     * high24h : 0.5
     * low24h : 0.1
     * open24h : 0.1
     * sodUtc0 : 0.1
     * sodUtc8 : 0.1
     * ts : 1597026383085
     */

    private String instId;
    private String idxPx;
    private String high24h;
    private String low24h;
    private String open24h;
    private String sodUtc0;
    private String sodUtc8;
    private String ts;

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getIdxPx() {
        return idxPx;
    }

    public void setIdxPx(String idxPx) {
        this.idxPx = idxPx;
    }

    public String getHigh24h() {
        return high24h;
    }

    public void setHigh24h(String high24h) {
        this.high24h = high24h;
    }

    public String getLow24h() {
        return low24h;
    }

    public void setLow24h(String low24h) {
        this.low24h = low24h;
    }

    public String getOpen24h() {
        return open24h;
    }

    public void setOpen24h(String open24h) {
        this.open24h = open24h;
    }

    public String getSodUtc0() {
        return sodUtc0;
    }

    public void setSodUtc0(String sodUtc0) {
        this.sodUtc0 = sodUtc0;
    }

    public String getSodUtc8() {
        return sodUtc8;
    }

    public void setSodUtc8(String sodUtc8) {
        this.sodUtc8 = sodUtc8;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
