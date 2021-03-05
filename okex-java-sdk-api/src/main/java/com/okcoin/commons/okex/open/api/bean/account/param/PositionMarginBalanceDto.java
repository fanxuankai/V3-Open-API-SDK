package com.okcoin.commons.okex.open.api.bean.account.param;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class PositionMarginBalanceDto {
    /**
     * instId : BTC-USDT-200626
     * posSide : short
     * type : add
     * amt : 1
     */
    private String instId;
    private String posSide;
    private String type;
    private String amt;
}
