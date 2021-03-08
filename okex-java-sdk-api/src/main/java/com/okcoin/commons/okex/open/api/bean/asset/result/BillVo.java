package com.okcoin.commons.okex.open.api.bean.asset.result;

/**
 * @author fanxuankai
 */
public class BillVo {

    /**
     * billId : 12344
     * ccy : BTC
     * balChg : 2
     * bal : 12
     * type : 1
     * ts : 1597026383085
     */

    private String billId;
    private String ccy;
    private String balChg;
    private String bal;
    private String type;
    private String ts;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getBalChg() {
        return balChg;
    }

    public void setBalChg(String balChg) {
        this.balChg = balChg;
    }

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
