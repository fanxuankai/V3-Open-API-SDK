package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class Position {
    /**
     * instId : BTC-USDT
     * instType : MARGIN
     * mgnMode : cross
     * posId : 111111222
     * posSide : net
     * pos : 10
     * ccy : BTC
     * posCcy : BTC
     * availPos : 2
     * avgPx : 3320
     * upl : 0.00020928
     * uplRatio : 0.00020928
     * lever : 2
     * liqPx : 0.00020928
     * imr : 2
     * margin :
     * mgnRatio :
     * mmr : 2
     * liab : 0.00020928
     * liabCcy : USDT
     * interest : 2
     * tradeId : 2
     * optVal :
     * adl : 2
     * last : 12353.5
     * cTime : 1597026383085
     * uTime : 1597026383085
     */
    private String instId;
    private String instType;
    private String mgnMode;
    private String posId;
    private String posSide;
    private String pos;
    private String ccy;
    private String posCcy;
    private String availPos;
    private String avgPx;
    private String upl;
    private String uplRatio;
    private String lever;
    private String liqPx;
    private String imr;
    private String margin;
    private String mgnRatio;
    private String mmr;
    private String liab;
    private String liabCcy;
    private String interest;
    private String tradeId;
    private String optVal;
    private String adl;
    private String last;
    private String cTime;
    private String uTime;
}
