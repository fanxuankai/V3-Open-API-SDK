package com.okcoin.commons.okex.open.api.bean.trade.result;

/**
 * @author fanxuankai
 */
public class ClosePositionVo {

    /**
     * instId : BTC-USDT-SWAP
     * posSide : long
     */

    private String instId;
    private String posSide;

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getPosSide() {
        return posSide;
    }

    public void setPosSide(String posSide) {
        this.posSide = posSide;
    }
}
