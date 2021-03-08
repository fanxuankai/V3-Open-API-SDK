package com.okcoin.commons.okex.open.api.bean.open.result;

/**
 * @author fanxuankai
 */
public class OpenInterestVo {

    /**
     * instType : SWAP
     * instId : BTC-USDT-SWAP
     * oi : 5000
     * oiCcy : 555.55
     * ts : 1597026383085
     */

    private String instType;
    private String instId;
    private String oi;
    private String oiCcy;
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

    public String getOi() {
        return oi;
    }

    public void setOi(String oi) {
        this.oi = oi;
    }

    public String getOiCcy() {
        return oiCcy;
    }

    public void setOiCcy(String oiCcy) {
        this.oiCcy = oiCcy;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
