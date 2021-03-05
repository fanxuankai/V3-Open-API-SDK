package com.okcoin.commons.okex.open.api.service.ett.impl;

import com.okcoin.commons.okex.open.api.bean.ett.param.EttCreateOrderParam;
import com.okcoin.commons.okex.open.api.bean.ett.result.EttCancelOrderResult;
import com.okcoin.commons.okex.open.api.bean.ett.result.EttCreateOrderResult;
import com.okcoin.commons.okex.open.api.bean.ett.result.EttOrder;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * @author chuping.cui
 * @date 2018/7/5
 */
interface EttOrderAPI {

    @POST("/api/v5/ett/orders")
    Call<EttCreateOrderResult> createOrder(@Body EttCreateOrderParam param);

    @DELETE("/api/v5/ett/orders/{order_id}")
    Call<EttCancelOrderResult> cancelOrder(@Path("order_id") String order_id);

    @GET("/api/v5/ett/orders")
    Call<List<EttOrder>> getOrder(@Query("ett") String ett, @Query("type") Integer type, @Query("status") Integer status, @Query("before") String before, @Query("after") String after,
                                  @Query("limit") int limit);

    @GET("/api/v5/ett/orders/{order_id}")
    Call<EttOrder> getOrder(@Path("order_id") String order_id);

}
