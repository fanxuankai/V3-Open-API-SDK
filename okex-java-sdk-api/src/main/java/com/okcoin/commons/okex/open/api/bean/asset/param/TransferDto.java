package com.okcoin.commons.okex.open.api.bean.asset.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class TransferDto {
    private String ccy;
    private String amt;
    private String type;
    private String from;
    private String to;
    private String subAcct;
    private String instId;
    private String toInstId;
}
