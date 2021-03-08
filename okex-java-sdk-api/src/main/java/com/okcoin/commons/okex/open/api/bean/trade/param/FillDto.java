package com.okcoin.commons.okex.open.api.bean.trade.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class FillDto {
    private String instType;
    private String uly;
    private String instId;
    private String ordId;
    private String after;
    private String before;
    private String limit;
}
