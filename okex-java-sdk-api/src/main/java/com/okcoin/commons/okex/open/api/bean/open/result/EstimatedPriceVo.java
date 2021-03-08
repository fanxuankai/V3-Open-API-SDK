package com.okcoin.commons.okex.open.api.bean.open.result;

/**
 * @author fanxuankai
 */
public class EstimatedPriceVo {

    /**
     * instType : SWAP
     * instId : BTC-USDT-201227
     * settlePx : 200
     * ts : 1597026383085
     */

    private String instType;
    private String instId;
    private String settlePx;
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

    public String getSettlePx() {
        return settlePx;
    }

    public void setSettlePx(String settlePx) {
        this.settlePx = settlePx;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
