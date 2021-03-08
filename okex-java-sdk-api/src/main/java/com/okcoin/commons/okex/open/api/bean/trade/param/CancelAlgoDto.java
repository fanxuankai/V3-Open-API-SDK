package com.okcoin.commons.okex.open.api.bean.trade.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class CancelAlgoDto {
    private String algoId;
    private String instId;
}
