package com.okcoin.commons.okex.open.api.bean.trade.param;

/**
 * @author fanxuankai
 */
public class TradeDto {

    /**
     * instId : BTC-USDT
     * tdMode : cash
     * clOrdId : b15
     * side : buy
     * ordType : limit
     * px : 2.15
     * sz : 2
     */

    private String instId;
    private String tdMode;
    private String clOrdId;
    private String side;
    private String ordType;
    private String px;
    private String sz;

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getTdMode() {
        return tdMode;
    }

    public void setTdMode(String tdMode) {
        this.tdMode = tdMode;
    }

    public String getClOrdId() {
        return clOrdId;
    }

    public void setClOrdId(String clOrdId) {
        this.clOrdId = clOrdId;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getOrdType() {
        return ordType;
    }

    public void setOrdType(String ordType) {
        this.ordType = ordType;
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
}
