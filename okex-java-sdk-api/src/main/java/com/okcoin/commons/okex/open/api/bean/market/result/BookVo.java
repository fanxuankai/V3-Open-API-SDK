package com.okcoin.commons.okex.open.api.bean.market.result;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fanxuankai
 */
@Data
@Accessors(chain = true)
public class BookVo {

    /**
     * asks : [["411.8","10","0","8"],["1","2","3","6"]]
     * bids : [["1","2","3","6"],["1","2","3","6"]]
     * ts : 1597026383085
     */

    private String ts;
    private List<Deep> asks;
    private List<Deep> bids;

    public static List<BookVo> toVoList(JSONArray jsonArray) {
        List<BookVo> list = new ArrayList<>(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            list.add(toVo(jsonArray.getJSONObject(i)));
        }
        return list;
    }

    public static BookVo toVo(JSONObject jsonObject) {
        return new BookVo().setTs(jsonObject.getString("ts"))
                .setAsks(convert(jsonObject.getJSONArray("asks")))
                .setBids(convert(jsonObject.getJSONArray("bids")));
    }

    private static List<Deep> convert(JSONArray jsonArray) {
        List<Deep> deeps = new ArrayList<>(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONArray asJsonArray = jsonArray.getJSONArray(i);
            int j = 0;
            deeps.add(new Deep()
                    .setPx(asJsonArray.getString(j++))
                    .setCtSz(asJsonArray.getString(j++))
                    .setLiqSz(asJsonArray.getString(j++))
                    .setSz(asJsonArray.getString(j)));
        }
        return deeps;
    }
}
