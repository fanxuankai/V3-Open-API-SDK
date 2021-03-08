package com.okcoin.commons.okex.open.api.bean.trade.result;

/**
 * @author fanxuankai
 */
public class CancelOrderVo {

    /**
     * clOrdId : oktswap6
     * ordId : 12345689
     * sCode : 0
     * sMsg :
     */

    private String clOrdId;
    private String ordId;
    private String sCode;
    private String sMsg;

    public String getClOrdId() {
        return clOrdId;
    }

    public void setClOrdId(String clOrdId) {
        this.clOrdId = clOrdId;
    }

    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public String getSCode() {
        return sCode;
    }

    public void setSCode(String sCode) {
        this.sCode = sCode;
    }

    public String getSMsg() {
        return sMsg;
    }

    public void setSMsg(String sMsg) {
        this.sMsg = sMsg;
    }
}
