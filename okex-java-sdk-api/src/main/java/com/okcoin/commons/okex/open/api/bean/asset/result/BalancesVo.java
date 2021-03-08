package com.okcoin.commons.okex.open.api.bean.asset.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class BalancesVo {

    /**
     * availBal : 37.11827078
     * bal : 37.11827078
     * ccy : ETH
     * frozenBal : 0
     */
    private String availBal;
    private String bal;
    private String ccy;
    private String frozenBal;
}
