package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class MaxSizeVo {
    /**
     * instId : BTC-USDT-200802
     * maxBuy : 1
     * maxSell : 1
     */
    private String instId;
    private String maxBuy;
    private String maxSell;
}
