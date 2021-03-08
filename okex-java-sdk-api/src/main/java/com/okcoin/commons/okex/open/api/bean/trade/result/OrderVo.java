package com.okcoin.commons.okex.open.api.bean.trade.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class OrderVo {

    /**
     * instType : FUTURES
     * instId : BTC-USD-200329
     * ccy :
     * ordId : 123445
     * clOrdId : b1
     * tag :
     * px : 999
     * sz : 3
     * pnl : 5
     * ordType : limit
     * side : buy
     * posSide : long
     * tdMode : isolated
     * accFillSz : isolated
     * fillPx : 0
     * tradeId : 0
     * fillSz : 0
     * fillTime : 0
     * state : live
     * avgPx : 0
     * lever : 20
     * tpTriggerPx :
     * tpOrdPx :
     * slTriggerPx :
     * slOrdPx :
     * feeCcy :
     * fee :
     * rebateCcy :
     * rebate :
     * category :
     * uTime : 1597026383085
     * cTime : 1597026383085
     */

    private String instType;
    private String instId;
    private String ccy;
    private String ordId;
    private String clOrdId;
    private String tag;
    private String px;
    private String sz;
    private String pnl;
    private String ordType;
    private String side;
    private String posSide;
    private String tdMode;
    private String accFillSz;
    private String fillPx;
    private String tradeId;
    private String fillSz;
    private String fillTime;
    private String state;
    private String avgPx;
    private String lever;
    private String tpTriggerPx;
    private String tpOrdPx;
    private String slTriggerPx;
    private String slOrdPx;
    private String feeCcy;
    private String fee;
    private String rebateCcy;
    private String rebate;
    private String category;
    private String uTime;
    private String cTime;
}
