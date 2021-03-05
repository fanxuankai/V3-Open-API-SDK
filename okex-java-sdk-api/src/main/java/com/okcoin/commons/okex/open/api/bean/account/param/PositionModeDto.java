package com.okcoin.commons.okex.open.api.bean.account.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class PositionModeDto {
    /**
     * posMode : long_short_mode
     */
    private String posMode;
}
