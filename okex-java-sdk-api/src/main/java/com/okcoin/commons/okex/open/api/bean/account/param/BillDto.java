package com.okcoin.commons.okex.open.api.bean.account.param;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class BillDto {
    private String instType;
    private String ccy;
    private String mgnMode;
    private String ctType;
    private String type;
    private String subType;
    private String after;
    private String before;
    private String limit;
}
