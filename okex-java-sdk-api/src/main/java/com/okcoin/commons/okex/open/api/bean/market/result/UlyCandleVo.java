package com.okcoin.commons.okex.open.api.bean.market.result;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class UlyCandleVo {
    private String ts;
    private String o;
    private String h;
    private String l;
    private String c;

    public static List<UlyCandleVo> toVoList(JSONArray jsonArray) {
        List<UlyCandleVo> list = new ArrayList<>(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            list.add(toVo(jsonArray.getJSONArray(i)));
        }
        return list;
    }

    public static UlyCandleVo toVo(JSONArray jsonArray) {
        int i = 0;
        return new UlyCandleVo().setTs(jsonArray.getString(i++))
                .setO(jsonArray.getString(i++))
                .setH(jsonArray.getString(i++))
                .setL(jsonArray.getString(i++))
                .setC(jsonArray.getString(i))
                ;
    }
}
