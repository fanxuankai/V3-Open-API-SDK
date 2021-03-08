package com.okcoin.commons.okex.open.api.bean.open.result;

/**
 * @author fanxuankai
 */
public class PriceLimitVo {

    /**
     * instType : SWAP
     * instId : BTC-USDT-SWAP
     * buyLmt : 200
     * sellLmt : 300
     * ts : 1597026383085
     */

    private String instType;
    private String instId;
    private String buyLmt;
    private String sellLmt;
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

    public String getBuyLmt() {
        return buyLmt;
    }

    public void setBuyLmt(String buyLmt) {
        this.buyLmt = buyLmt;
    }

    public String getSellLmt() {
        return sellLmt;
    }

    public void setSellLmt(String sellLmt) {
        this.sellLmt = sellLmt;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
