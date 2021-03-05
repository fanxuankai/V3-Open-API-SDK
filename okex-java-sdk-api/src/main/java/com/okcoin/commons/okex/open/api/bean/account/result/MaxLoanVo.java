package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class MaxLoanVo {
    /**
     * instId : BTC-USDT
     * mgnMode : isolated
     * mgnCcy :
     * maxLoan : 0.1
     * ccy : BTC
     * side : sell
     */
    private String instId;
    private String mgnMode;
    private String mgnCcy;
    private String maxLoan;
    private String ccy;
    private String side;
}
