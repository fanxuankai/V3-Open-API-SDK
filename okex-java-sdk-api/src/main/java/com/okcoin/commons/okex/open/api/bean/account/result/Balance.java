package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

import java.util.List;

/**
 * @author fanxuankai
 */
@Data
public class Balance {

    /**
     * uTime : 1597026383085
     * totalEq : 41624.32
     * isoEq : 3624.32
     * adjEq : 41624.32
     * imr : 4162.33
     * mmr : 4
     * mgnRatio : 41624.32
     * details : [{"ccy":"BTC","eq":"123","isoEq":"","availEq":"1234","disEq":"234","availBal":"","frozenBal":"14",
     * "ordFrozen":"1","upl":"124","uplLiab":"0","mgnRatio":"","interest":"12","liab":"1"},{"ccy":"ETH","eq":"223",
     * "isoEq":"","availEq":"2234","disEq":"234","availBal":"","frozenBal":"141","ordFrozen":"12","upl":"124",
     * "uplLiab":"0","mgnRatio":"","interest":"0","liab":"0"}]
     */
    private String uTime;
    private String totalEq;
    private String isoEq;
    private String adjEq;
    private String imr;
    private String mmr;
    private String mgnRatio;
    private List<DetailsBean> details;

    @Data
    public static class DetailsBean {
        /**
         * ccy : BTC
         * eq : 123
         * isoEq :
         * availEq : 1234
         * disEq : 234
         * availBal :
         * frozenBal : 14
         * ordFrozen : 1
         * upl : 124
         * uplLiab : 0
         * mgnRatio :
         * interest : 12
         * liab : 1
         */
        private String ccy;
        private String eq;
        private String isoEq;
        private String availEq;
        private String disEq;
        private String availBal;
        private String frozenBal;
        private String ordFrozen;
        private String upl;
        private String uplLiab;
        private String mgnRatio;
        private String interest;
        private String liab;
    }
}
