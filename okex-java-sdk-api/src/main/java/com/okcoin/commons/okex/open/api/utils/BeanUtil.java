package com.okcoin.commons.okex.open.api.utils;

import cn.hutool.core.bean.copier.CopyOptions;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author fanxuankai
 */
public class BeanUtil extends cn.hutool.core.bean.BeanUtil {
    public static Map<String, String> toMap(Object object) {
        Map<String, String> map = Maps.newHashMap();
        copyProperties(object, map, CopyOptions.create().ignoreNullValue());
        return map;
    }
}
