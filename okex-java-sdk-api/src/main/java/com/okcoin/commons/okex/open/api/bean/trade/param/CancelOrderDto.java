package com.okcoin.commons.okex.open.api.bean.trade.param;

/**
 * @author fanxuankai
 */
public class CancelOrderDto {

    /**
     * instId : BTC-USDT
     * ordId : 12312
     */

    private String instId;
    private String ordId;

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
}
