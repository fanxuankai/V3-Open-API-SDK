package com.okcoin.commons.okex.open.api.service.spot.impl;

import com.alibaba.fastjson.JSONObject;
import com.okcoin.commons.okex.open.api.bean.spot.param.OrderParamDto;
import com.okcoin.commons.okex.open.api.bean.spot.param.PlaceOrderParam;
import com.okcoin.commons.okex.open.api.bean.spot.result.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface MarginOrderAPI {

    //下单
    @POST("api/margin/orders")
    Call<OrderResult> addOrder(@Body PlaceOrderParam param);

    //批量下单
    @POST("api/margin/batch_orders")
    Call<Map<String, List<OrderResult>>> batchOrders(@Body List<PlaceOrderParam> param);


    //撤销指定订单(通过order_id)
    @HTTP(method = "POST", path = "api/margin/cancel_orders/{order_id}", hasBody = true)
    Call<OrderResult> cancleOrdersByOrderId(@Path("order_id") String order_id,
                                            @Body PlaceOrderParam order);

    //撤销指定订单(通过client_oid)
    @HTTP(method = "POST", path = "api/margin/cancel_orders/{client_oid}", hasBody = true)
    Call<OrderResult> cancleOrdersByClientOid(@Path("client_oid") String client_oid,
                                              @Body PlaceOrderParam order);

    //批量撤销订单(通过order_id)
    @HTTP(method = "POST", path = "api/margin/cancel_batch_orders", hasBody = true)
    Call<Map<String, Object>> batchCancleOrdersByOrderId(@Body List<OrderParamDto> cancleOrders);

    //批量撤销订单(通过client_oid)
    @HTTP(method = "POST", path = "api/margin/cancel_batch_orders", hasBody = true)
    Call<Map<String, Object>> batchCancleOrdersByClientOid(@Body List<OrderParamDto> cancleOrders);

    //查询订单列表
    @GET("api/margin/orders")
    Call<List<OrderInfo>> getOrders(@Query("instrument_id") String instrument_id,
                                    @Query("state") String state,
                                    @Query("after") String after,
                                    @Query("before") String before,
                                    @Query("limit") String limit);

    //获取订单信息(通过order_id)
    @GET("api/margin/orders/{order_id}")
    Call<OrderInfo> getOrderByOrderId(@Path("order_id") String order_id,
                                                  @Query("instrument_id") String instrument_id);

    //获取订单信息(通过client_oid)
    @GET("api/margin/orders/{client_oid}")
    Call<OrderInfo> getOrderByClientOid(@Path("client_oid") String client_oid,
                                        @Query("instrument_id") String instrument_id);

    //获取所有未成交订单
    @GET("api/margin/orders_pending")
    Call<List<PendingOrdersInfo>> getPendingOrders(@Query("instrument_id") String instrument_id,
                                                   @Query("after") String after,
                                                   @Query("before") String before,
                                                   @Query("limit") String limit);

    //获取成交明细
    @GET("api/margin/fills")
    Call<List<MarginFills>> getFills(@Query("order_id") String order_id,
                                     @Query("instrument_id") String instrument_id,
                                     @Query("after") String after,
                                     @Query("before") String before,
                                     @Query("limit") String limit);

}
