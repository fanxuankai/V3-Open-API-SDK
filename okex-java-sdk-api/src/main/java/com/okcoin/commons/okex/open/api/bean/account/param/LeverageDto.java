package com.okcoin.commons.okex.open.api.bean.account.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class LeverageDto {
    private String instId;
    private String lever;
    private String posSide;
    private String mgnMode;
}
