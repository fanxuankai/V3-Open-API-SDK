package com.okcoin.commons.okex.open.api.bean.market.result;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class Deep {
    private String px;
    private String ctSz;
    private String liqSz;
    private String sz;
}
