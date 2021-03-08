package com.okcoin.commons.okex.open.api.service.market;

import com.okcoin.commons.okex.open.api.bean.market.result.*;

import java.util.List;


public interface MarketAPIService {
    //获取所有产品行情信息
    List<TickerVo> tickers(String instType,
                           String uly);

    //获取单个产品行情信息
    List<TickerVo> ticker(String instId);

    //获取指数行情
    List<IndexTickerVo> indexTickers(String quoteCcy,
                                     String instId);

    //获取产品深度
    List<BookVo> books(String instId,
                       String sz);

    //获取所有交易产品K线数据
    List<CandleVo> candles(String instId,
                           String after,
                           String before,
                           String bar,
                           String limit);

    //获取交易产品历史K线数据（仅主流币）
    List<CandleVo> historyCandles(String instId,
                                  String after,
                                  String before,
                                  String bar,
                                  String limit);

    //获取指数K线数据
    List<UlyCandleVo> indexCandles(String instId,
                                String after,
                                String before,
                                String bar,
                                String limit);


    //获取标记价格K线数据
    List<UlyCandleVo> markPriceCandles(String instId,
                                    String after,
                                    String before,
                                    String bar,
                                    String limit);

    //获取交易产品公共成交数据
    List<TradeVo> trades(String instId,
                         String limit);

}
