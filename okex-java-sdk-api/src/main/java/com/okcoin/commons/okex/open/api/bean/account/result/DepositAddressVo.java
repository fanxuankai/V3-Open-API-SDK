package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class DepositAddressVo {
    /**
     * addr : okbtothemoon
     * memo : 971668
     * ccy : BTC
     * to : 6
     */
    private String addr;
    private String memo;
    private String ccy;
    private String to;
}
