package com.okcoin.commons.okex.open.api.service.trade.impl;

import com.okcoin.commons.okex.open.api.bean.market.result.TradeVo;
import com.okcoin.commons.okex.open.api.bean.trade.param.*;
import com.okcoin.commons.okex.open.api.bean.trade.result.*;
import com.okcoin.commons.okex.open.api.client.APIClient;
import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.service.trade.TradeAPIService;
import com.okcoin.commons.okex.open.api.utils.BeanUtil;

import java.util.List;

public class TradeAPIServiceImpl implements TradeAPIService {

    private final APIClient client;
    private final TradeAPI api;

    public TradeAPIServiceImpl(APIConfiguration config) {
        this.client = new APIClient(config);
        this.api = client.createService(TradeAPI.class);
    }

    @Override
    public List<TradeVo> order(TradeDto dto) {
        return client.executeSyncWithResult(api.order(dto));
    }

    @Override
    public List<TradeVo> batchOrders(List<TradeDto> dtoList) {
        return client.executeSyncWithResult(api.batchOrders(dtoList));
    }

    @Override
    public List<CancelOrderVo> cancelOrder(CancelOrderDto dto) {
        return client.executeSyncWithResult(api.cancelOrder(dto));
    }

    @Override
    public List<CancelOrderVo> cancelBatchOrders(List<CancelOrderDto> dtoList) {
        return client.executeSyncWithResult(api.cancelBatchOrders(dtoList));
    }

    @Override
    public List<AmendOrderVo> amendOrder(AmendOrderDto dto) {
        return client.executeSyncWithResult(api.amendOrder(dto));
    }

    @Override
    public List<AmendOrderVo> amendBatchOrders(List<AmendOrderDto> dtoList) {
        return client.executeSyncWithResult(api.amendBatchOrders(dtoList));
    }

    @Override
    public List<ClosePositionVo> closePosition(ClosePositionDto dto) {
        return client.executeSyncWithResult(api.closePosition(dto));
    }

    @Override
    public List<OrderVo> order(String instId, String ordId, String clOrdId) {
        return client.executeSyncWithResult(api.order(instId, ordId, clOrdId));
    }

    @Override
    public List<OrderVo> ordersPending(OrderDto dto) {
        return client.executeSyncWithResult(api.ordersPending(BeanUtil.toMap(dto)));
    }

    @Override
    public List<OrderVo> ordersHistory(OrderDto dto) {
        return client.executeSyncWithResult(api.ordersHistory(BeanUtil.toMap(dto)));
    }

    @Override
    public List<OrderVo> ordersHistoryArchive(OrderDto dto) {
        return client.executeSyncWithResult(api.ordersHistoryArchive(BeanUtil.toMap(dto)));
    }

    @Override
    public List<FillVo> fills(FillDto dto) {
        return client.executeSyncWithResult(api.fills(BeanUtil.toMap(dto)));
    }

    @Override
    public List<OrderAlgoVo> orderAlgo(OrderAlgoDto dto) {
        return client.executeSyncWithResult(api.orderAlgo(dto));
    }

    @Override
    public List<CancelAlgoVo> cancelAlgos(List<CancelAlgoDto> dtoList) {
        return client.executeSyncWithResult(api.cancelAlgos(dtoList));
    }

    @Override
    public List<OrdersAlgoVo> ordersAlgoPending(OrdersAlgoDto dto) {
        return client.executeSyncWithResult(api.ordersAlgoPending(BeanUtil.toMap(dto)));
    }

    @Override
    public List<OrdersAlgoVo> ordersAlgoHistory(OrdersAlgoDto dto) {
        return client.executeSyncWithResult(api.ordersAlgoHistory(BeanUtil.toMap(dto)));
    }
}
