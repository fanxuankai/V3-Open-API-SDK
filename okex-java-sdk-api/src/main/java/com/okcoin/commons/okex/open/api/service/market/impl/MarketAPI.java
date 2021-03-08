package com.okcoin.commons.okex.open.api.service.market.impl;

import com.alibaba.fastjson.JSONArray;
import com.okcoin.commons.okex.open.api.bean.Result;
import com.okcoin.commons.okex.open.api.bean.market.result.IndexTickerVo;
import com.okcoin.commons.okex.open.api.bean.market.result.TickerVo;
import com.okcoin.commons.okex.open.api.bean.market.result.TradeVo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/**
 * 行情数据
 * Asset api
 *
 * @author hucj
 * @version 1.0.0
 * @date 2018/07/04 20:51
 */
public interface MarketAPI {

    //获取所有产品行情信息
    @GET("/api/v5/market/tickers")
    Call<Result<List<TickerVo>>> tickers(@Query("instType") String instType,
                                         @Query("uly") String uly);

    //获取单个产品行情信息
    @GET("/api/v5/market/ticker")
    Call<Result<List<TickerVo>>> ticker(@Query("instId") String instId);

    //获取指数行情
    @GET("/api/v5/market/index-tickers")
    Call<Result<List<IndexTickerVo>>> indexTickers(@Query("quoteCcy") String quoteCcy,
                                                   @Query("instId") String instId);

    //获取产品深度
    @GET("/api/v5/market/books")
    Call<Result<JSONArray>> books(@Query("instId") String instId,
                                  @Query("sz") String sz);

    //获取所有交易产品K线数据
    @GET("/api/v5/market/candles")
    Call<Result<JSONArray>> candles(@Query("instId") String instId,
                                    @Query("after") String after,
                                    @Query("before") String before,
                                    @Query("bar") String bar,
                                    @Query("limit") String limit);

    //获取交易产品历史K线数据（仅主流币）
    @GET("/api/v5/market/history-candles")
    Call<Result<JSONArray>> historyCandles(@Query("instId") String instId,
                                           @Query("after") String after,
                                           @Query("before") String before,
                                           @Query("bar") String bar,
                                           @Query("limit") String limit);

    //获取指数K线数据
    @GET("/api/v5/market/index-candles")
    Call<Result<JSONArray>> indexCandles(@Query("instId") String instId,
                                         @Query("after") String after,
                                         @Query("before") String before,
                                         @Query("bar") String bar,
                                         @Query("limit") String limit);


    //获取标记价格K线数据
    @GET("/api/v5/market/mark-price-candles")
    Call<Result<JSONArray>> markPriceCandles(@Query("instId") String instId,
                                             @Query("after") String after,
                                             @Query("before") String before,
                                             @Query("bar") String bar,
                                             @Query("limit") String limit);

    //获取交易产品公共成交数据
    @GET("/api/v5/market/trades")
    Call<Result<List<TradeVo>>> trades(@Query("instId") String instId,
                                       @Query("limit") String limit);

}
