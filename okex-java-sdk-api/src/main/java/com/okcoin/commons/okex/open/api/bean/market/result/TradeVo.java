package com.okcoin.commons.okex.open.api.bean.market.result;

/**
 * @author fanxuankai
 */
public class TradeVo {

    /**
     * instId : BTC-USDT
     * tradeId : 9
     * px : 0.016
     * sz : 50
     * side : buy
     * ts : 1597026383085
     */

    private String instId;
    private String tradeId;
    private String px;
    private String sz;
    private String side;
    private String ts;

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

    public String getPx() {
        return px;
    }

    public void setPx(String px) {
        this.px = px;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
