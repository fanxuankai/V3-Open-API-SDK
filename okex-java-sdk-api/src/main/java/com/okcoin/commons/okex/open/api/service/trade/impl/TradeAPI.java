package com.okcoin.commons.okex.open.api.service.trade.impl;

import com.okcoin.commons.okex.open.api.bean.Result;
import com.okcoin.commons.okex.open.api.bean.market.result.TradeVo;
import com.okcoin.commons.okex.open.api.bean.trade.param.*;
import com.okcoin.commons.okex.open.api.bean.trade.result.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * Trade api
 *
 * @author hucj
 * @version 1.0.0
 * @date 2018/07/04 20:51
 */
public interface TradeAPI {

    //下单
    @POST("/api/v5/trade/order")
    Call<Result<List<TradeVo>>> order(@Body TradeDto dto);

    //批量下单
    @POST("/api/v5/trade/batch-orders")
    Call<Result<List<TradeVo>>> batchOrders(@Body List<TradeDto> dtoList);

    //撤单
    @POST("/api/v5/trade/cancel-order")
    Call<Result<List<CancelOrderVo>>> cancelOrder(@Body CancelOrderDto dto);

    //批量撤单
    @POST("/api/v5/trade/cancel-batch-orders")
    Call<Result<List<CancelOrderVo>>> cancelBatchOrders(@Body List<CancelOrderDto> dtoList);

    //修改订单
    @POST("/api/v5/trade/amend-order")
    Call<Result<List<AmendOrderVo>>> amendOrder(@Body AmendOrderDto dto);

    //批量修改订单
    @POST("/api/v5/trade/amend-batch-orders")
    Call<Result<List<AmendOrderVo>>> amendBatchOrders(@Body List<AmendOrderDto> dtoList);

    //市价仓位全平
    @POST("/api/v5/trade/close-position")
    Call<Result<List<ClosePositionVo>>> closePosition(@Body ClosePositionDto dto);

    //获取订单信息
    @GET("/api/v5/trade/order")
    Call<Result<List<OrderVo>>> order(@Query("instId") String instId,
                                      @Query("ordId") String ordId,
                                      @Query("clOrdId") String clOrdId);

    //获取未成交订单列表
    @GET("/api/v5/trade/orders-pending")
    Call<Result<List<OrderVo>>> ordersPending(@QueryMap Map<String, String> params);

    //获取历史订单记录（近七天）
    @GET("/api/v5/trade/orders-history")
    Call<Result<List<OrderVo>>> ordersHistory(@QueryMap Map<String, String> params);

    //获取历史订单记录（近三个月）
    @GET("/api/v5/trade/orders-history-archive")
    Call<Result<List<OrderVo>>> ordersHistoryArchive(@QueryMap Map<String, String> params);

    //获取成交明细
    @GET("/api/v5/trade/fills")
    Call<Result<List<FillVo>>> fills(@QueryMap Map<String, String> params);

    //策略委托下单
    @POST("/api/v5/trade/order-algo")
    Call<Result<List<OrderAlgoVo>>> orderAlgo(@Body OrderAlgoDto dto);

    //撤销策略委托订单
    @POST("/api/v5/trade/cancel-algos")
    Call<Result<List<CancelAlgoVo>>> cancelAlgos(@Body List<CancelAlgoDto> dtoList);

    //获取未完成策略委托单列表
    @GET("/api/v5/trade/orders-algo-pending")
    Call<Result<List<OrdersAlgoVo>>> ordersAlgoPending(@QueryMap Map<String, String> params);

    //获取历史策略委托单列表
    @GET("/api/v5/trade/orders-algo-history")
    Call<Result<List<OrdersAlgoVo>>> ordersAlgoHistory(@QueryMap Map<String, String> params);

}
