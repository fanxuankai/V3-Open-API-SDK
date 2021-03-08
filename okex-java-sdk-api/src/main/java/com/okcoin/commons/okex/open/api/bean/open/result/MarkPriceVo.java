package com.okcoin.commons.okex.open.api.bean.open.result;

/**
 * @author fanxuankai
 */
public class MarkPriceVo {

    /**
     * instType : SWAP
     * instId : BTC-USDT-SWAP
     * markPx : 200
     * ts : 1597026383085
     */

    private String instType;
    private String instId;
    private String markPx;
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

    public String getMarkPx() {
        return markPx;
    }

    public void setMarkPx(String markPx) {
        this.markPx = markPx;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
