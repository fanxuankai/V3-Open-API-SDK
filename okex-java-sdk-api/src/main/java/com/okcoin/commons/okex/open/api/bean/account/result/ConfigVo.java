package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class ConfigVo {
    /**
     * uid : 43812
     * acctLv : 2
     * posMode : long_short_mode
     * autoLoan : true
     * greeksType : BS
     */
    private String uid;
    private String acctLv;
    private String posMode;
    private boolean autoLoan;
    private String greeksType;
}
