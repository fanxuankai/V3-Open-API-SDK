package com.okcoin.commons.okex.open.api.service.trade;

import com.okcoin.commons.okex.open.api.bean.market.result.TradeVo;
import com.okcoin.commons.okex.open.api.bean.trade.param.*;
import com.okcoin.commons.okex.open.api.bean.trade.result.*;

import java.util.List;

public interface TradeAPIService {
    //下单
    List<TradeVo> order(TradeDto dto);

    //批量下单
    List<TradeVo> batchOrders(List<TradeDto> dtoList);

    //撤单
    List<CancelOrderVo> cancelOrder(CancelOrderDto dto);

    //批量撤单
    List<CancelOrderVo> cancelBatchOrders(List<CancelOrderDto> dtoList);

    //修改订单
    List<AmendOrderVo> amendOrder(AmendOrderDto dto);

    //批量修改订单
    List<AmendOrderVo> amendBatchOrders(List<AmendOrderDto> dtoList);

    //市价仓位全平
    List<ClosePositionVo> closePosition(ClosePositionDto dto);

    //获取订单信息
    List<OrderVo> order(String instId,
                        String ordId,
                        String clOrdId);

    //获取未成交订单列表
    List<OrderVo> ordersPending(OrderDto dto);

    //获取历史订单记录（近七天）
    List<OrderVo> ordersHistory(OrderDto dto);

    //获取历史订单记录（近三个月）
    List<OrderVo> ordersHistoryArchive(OrderDto dto);

    //获取成交明细
    List<FillVo> fills(FillDto dto);

    //策略委托下单
    List<OrderAlgoVo> orderAlgo(OrderAlgoDto dto);

    //撤销策略委托订单
    List<CancelAlgoVo> cancelAlgos(List<CancelAlgoDto> dtoList);

    //获取未完成策略委托单列表
    List<OrdersAlgoVo> ordersAlgoPending(OrdersAlgoDto dto);

    //获取历史策略委托单列表
    List<OrdersAlgoVo> ordersAlgoHistory(OrdersAlgoDto dto);

}
