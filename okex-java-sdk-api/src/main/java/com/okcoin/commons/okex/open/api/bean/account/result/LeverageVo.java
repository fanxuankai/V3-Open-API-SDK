package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class LeverageVo {
    /**
     * lever : 30
     * mgnMode : isolated
     * instId : BTC-USDT-SWAP
     * posSide : long
     */
    private String lever;
    private String mgnMode;
    private String instId;
    private String posSide;
}
