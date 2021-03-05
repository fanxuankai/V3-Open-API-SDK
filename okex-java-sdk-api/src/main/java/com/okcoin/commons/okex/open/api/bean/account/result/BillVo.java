package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class BillVo {
    /**
     * instType : FUTURES
     * instId : BTC-USD-180216
     * billId : 1234
     * type : 1
     * subType : 1
     * balChg : 0.2
     * bal : 0.3
     * sz : 0.23
     * ccy : BTC
     * mgnMode : isolated
     * pnl : 1
     * fee : 0.01
     * ts : 1597026383085
     * ordId : 332233
     * from :
     * to :
     * notes :
     */
    private String instType;
    private String instId;
    private String billId;
    private String type;
    private String subType;
    private String balChg;
    private String bal;
    private String sz;
    private String ccy;
    private String mgnMode;
    private String pnl;
    private String fee;
    private String ts;
    private String ordId;
    private String from;
    private String to;
    private String notes;
}
