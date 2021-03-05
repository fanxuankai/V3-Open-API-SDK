package com.okcoin.commons.okex.open.api.bean.account.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class InterestAccruedDto {
    private String instId;
    private String ccy;
    private String mgnMode;
    private String after;
    private String before;
    private String limit;
}
