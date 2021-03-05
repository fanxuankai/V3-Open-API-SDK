package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class InterestAccruedVo {
    /**
     * instId : BTC-USDT
     * ccy : USDT
     * mgnMode : cross
     * interest : 0.02
     * ts : 1597026383085
     */
    private String instId;
    private String ccy;
    private String mgnMode;
    private String interest;
    private String ts;
}
