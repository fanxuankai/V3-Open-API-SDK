package com.okcoin.commons.okex.open.api.bean.trade.param;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class CancelOrderDto {
    /**
     * instId : BTC-USDT
     * ordId : 12312
     */
    private String instId;
    private String ordId;
    private String clOrdId;
}
