package com.okcoin.commons.okex.open.api.bean.trade.param;

/**
 * @author fanxuankai
 */
public class AmendOrderDto {

    /**
     * ordId : 2510789768709120
     * newSz : 2
     * instId : BTC-USDT
     */

    private String ordId;
    private String newSz;
    private String instId;

    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public String getNewSz() {
        return newSz;
    }

    public void setNewSz(String newSz) {
        this.newSz = newSz;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }
}
