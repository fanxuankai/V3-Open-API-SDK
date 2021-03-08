package com.okcoin.commons.okex.open.api.service.open.impl;

import com.okcoin.commons.okex.open.api.bean.Result;
import com.okcoin.commons.okex.open.api.bean.account.result.Balance;
import com.okcoin.commons.okex.open.api.bean.open.result.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * Account api
 *
 * @author hucj
 * @version 1.0.0
 * @date 2018/07/04 20:51
 */
public interface OpenAPI {

    //获取交易产品基础信息
    @GET("/api/v5/public/instruments")
    Call<Result<List<Balance>>> instruments(@Query("instType") String instType,
                                            @Query("uly") String uly,
                                            @Query("instId") String instId);

    //获取交割和行权记录
    @GET("/api/v5/public/delivery-exercise-history")
    Call<Result<List<DeliveryExerciseHistoryVo>>> deliveryExerciseHistory(@Query("instType") String instType,
                                                                          @Query("uly") String uly,
                                                                          @Query("after") String after,
                                                                          @Query("before") String before,
                                                                          @Query("limit") String limit);

    //获取持仓总量
    @GET("/api/v5/public/open-interest")
    Call<Result<List<OpenInterestVo>>> openInterest(@Query("instType") String instType,
                                                    @Query("uly") String uly,
                                                    @Query("instId") String instId);

    //获取永续合约当前资金费率
    @GET("/api/v5/public/funding-rate")
    Call<Result<List<FundingRateVo>>> fundingRate(@Query("instId") String instId);

    //获取永续合约历史资金费率
    @GET("/api/v5/public/funding-rate-history")
    Call<Result<List<FundingRateHistoryVo>>> fundingRateHistory(@Query("instId") String instId,
                                                                @Query("after") String after,
                                                                @Query("before") String before,
                                                                @Query("limit") String limit);

    //获取限价
    @GET("/api/v5/public/price-limit")
    Call<Result<List<PriceLimitVo>>> priceLimit(@Query("instId") String instId);

    //获取期权定价
    @GET("/api/v5/public/opt-summary")
    Call<Result<List<OptSummaryVo>>> optSummary(@Query("uly") String uly,
                                                @Query("expTime") String expTime);

    //获取预估交割/行权价格
    @GET("/api/v5/public/estimated-price")
    Call<Result<List<EstimatedPriceVo>>> estimatedPrice(@Query("instId") String instId);

    //获取免息额度和币种折算率等级
    @GET("/api/v5/public/discount-rate-interest-free-quota")
    Call<Result<List<DiscountRateInterestFreeQuotaVo>>> discountRateInterestFreeQuota(@Query("ccy") String ccy);

    //获取系统时间
    @GET("/api/v5/public/time")
    Call<Result<List<List<String>>>> time();

    //获取平台公共爆仓单信息
    @GET("/api/v5/public/liquidation-orders")
    Call<Result<List<LiquidationOrdersVo>>> liquidationOrders(@QueryMap Map<String, String> params);

    //获取标记价格
    @GET("/api/v5/public/mark-price")
    Call<Result<List<MarkPriceVo>>> markPrice(@Query("instType") String instType,
                                              @Query("uly") String uly,
                                              @Query("instId") String instId);

}
