package com.okcoin.commons.okex.open.api.bean.account.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class MaxAvailSizeDto {
    private String instId;
    private String tdMode;
    private String ccy;
    private String reduceOnly;
}
