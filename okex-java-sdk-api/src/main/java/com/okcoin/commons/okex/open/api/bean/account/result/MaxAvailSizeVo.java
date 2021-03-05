package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class MaxAvailSizeVo {
    /**
     * instId : BTC-USDT-200802
     * availBuy : 1
     * availSell : 1
     */
    private String instId;
    private String availBuy;
    private String availSell;
}
