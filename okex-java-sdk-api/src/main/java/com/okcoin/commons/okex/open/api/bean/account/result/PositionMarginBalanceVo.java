package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class PositionMarginBalanceVo {
    /**
     * instId : BTC-USDT-200626
     * posSide : short
     * amt : 1
     * type : add
     */
    private String instId;
    private String posSide;
    private String amt;
    private String type;
}
