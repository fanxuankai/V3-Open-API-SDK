package com.okcoin.commons.okex.open.api.bean.trade.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class OrdersAlgoDto {
    private String algoId;
    private String instType;
    private String instId;
    private String ordType;
    private String after;
    private String before;
    private String limit;
}
