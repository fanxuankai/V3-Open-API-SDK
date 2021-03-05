package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class MaxWithDrawalVo {
    /**
     * ccy : BTC
     * maxWd : 124
     */
    private String ccy;
    private String maxWd;
}
