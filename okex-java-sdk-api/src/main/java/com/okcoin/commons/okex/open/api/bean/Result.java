package com.okcoin.commons.okex.open.api.bean;

import lombok.Data;

/**
 * @author fanxuankai
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
}
