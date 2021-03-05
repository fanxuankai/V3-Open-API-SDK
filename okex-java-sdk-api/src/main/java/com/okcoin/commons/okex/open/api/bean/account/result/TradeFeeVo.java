package com.okcoin.commons.okex.open.api.bean.account.result;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class TradeFeeVo {
    /**
     * category : 1
     * delivery :
     * exercise :
     * instType : SPOT
     * level : 101
     * maker : -0.001
     * taker : -0.0015
     * ts : 1608623351857
     */
    private String category;
    private String delivery;
    private String exercise;
    private String instType;
    private String level;
    private String maker;
    private String taker;
    private String ts;
}
