package com.okcoin.commons.okex.open.api.bean.open.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class LiquidationOrdersDto {
    private String instType;
    private String mgnMode;
    private String instId;
    private String ccy;
    private String uly;
    private String alias;
    private String state;
    private String before;
    private String after;
    private String limit;
}
