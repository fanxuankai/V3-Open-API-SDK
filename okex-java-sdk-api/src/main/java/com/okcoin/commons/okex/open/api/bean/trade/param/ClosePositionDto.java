package com.okcoin.commons.okex.open.api.bean.trade.param;

/**
 * @author fanxuankai
 */
public class ClosePositionDto {

    /**
     * instId : BTC-USDT-SWAP
     * mgnMode : cross
     */

    private String instId;
    private String mgnMode;

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getMgnMode() {
        return mgnMode;
    }

    public void setMgnMode(String mgnMode) {
        this.mgnMode = mgnMode;
    }
}
