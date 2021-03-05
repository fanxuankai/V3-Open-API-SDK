package com.okcoin.commons.okex.open.api.bean.account.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class ConfigDto {
    private String uid;
    private String acctLv;
    private String posMode;
    private String autoLoan;
    private String greeksType;
}
