package com.okcoin.commons.okex.open.api.service.market.impl;

import com.okcoin.commons.okex.open.api.bean.market.result.*;
import com.okcoin.commons.okex.open.api.client.APIClient;
import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.service.market.MarketAPIService;

import java.util.List;

public class MarketAPIServiceImpl implements MarketAPIService {

    private final APIClient client;
    private final MarketAPI api;

    public MarketAPIServiceImpl(APIConfiguration config) {
        this.client = new APIClient(config, true);
        this.api = client.createService(MarketAPI.class);
    }

    @Override
    public List<TickerVo> tickers(String instType, String uly) {
        return client.executeSyncWithResult(api.tickers(instType, uly));
    }

    @Override
    public List<TickerVo> ticker(String instId) {
        return client.executeSyncWithResult(api.ticker(instId));
    }

    @Override
    public List<IndexTickerVo> indexTickers(String quoteCcy, String instId) {
        return client.executeSyncWithResult(api.indexTickers(quoteCcy, instId));
    }

    @Override
    public List<BookVo> books(String instId, String sz) {
        return BookVo.toVoList(client.executeSyncWithResult(api.books(instId, sz)));
    }

    @Override
    public List<CandleVo> candles(String instId,
                                  String after,
                                  String before,
                                  String bar,
                                  String limit) {
        return CandleVo.toVoList(client.executeSyncWithResult(api.candles(instId, after, before, bar, limit)));
    }

    @Override
    public List<CandleVo> historyCandles(String instId,
                                         String after,
                                         String before,
                                         String bar,
                                         String limit) {
        return CandleVo.toVoList(client.executeSyncWithResult(api.historyCandles(instId, after, before, bar, limit)));
    }

    @Override
    public List<UlyCandleVo> indexCandles(String instId,
                                          String after,
                                          String before,
                                          String bar,
                                          String limit) {
        return UlyCandleVo.toVoList(client.executeSyncWithResult(api.indexCandles(instId, after, before, bar, limit)));
    }

    @Override
    public List<UlyCandleVo> markPriceCandles(String instId,
                                              String after,
                                              String before,
                                              String bar,
                                              String limit) {
        return UlyCandleVo.toVoList(client.executeSyncWithResult(api.markPriceCandles(instId, after, before, bar,
                limit)));
    }

    @Override
    public List<TradeVo> trades(String instId, String limit) {
        return client.executeSyncWithResult(api.trades(instId, limit));
    }
}
