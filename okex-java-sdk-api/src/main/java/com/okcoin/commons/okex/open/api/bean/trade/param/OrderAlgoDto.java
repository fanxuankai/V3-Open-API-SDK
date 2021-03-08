package com.okcoin.commons.okex.open.api.bean.trade.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class OrderAlgoDto {
    private String instId;
    private String tdMode;
    private String ccy;
    private String side;
    private String posSide;
    private String ordType;
    private String sz;
    private String reduceOnly;

    // 止盈止损

    private String tpTriggerPx;
    private String tpOrdPx;
    private String slTriggerPx;
    private String slOrdPx;

    // 计划委托

    private String triggerPx;
    private String orderPx;

}
