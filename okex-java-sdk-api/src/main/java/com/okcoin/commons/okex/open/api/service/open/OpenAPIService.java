package com.okcoin.commons.okex.open.api.service.open;

import com.okcoin.commons.okex.open.api.bean.account.result.Balance;
import com.okcoin.commons.okex.open.api.bean.open.param.LiquidationOrdersDto;
import com.okcoin.commons.okex.open.api.bean.open.result.*;

import java.util.List;

public interface OpenAPIService {
    //获取交易产品基础信息
    List<Balance> instruments(String instType,
                              String uly,
                              String instId);

    //获取交割和行权记录
    List<DeliveryExerciseHistoryVo> deliveryExerciseHistory(String instType,
                                                            String uly,
                                                            String after,
                                                            String before,
                                                            String limit);

    //获取持仓总量
    List<OpenInterestVo> openInterest(String instType,
                                      String uly,
                                      String instId);

    //获取永续合约当前资金费率
    List<FundingRateVo> fundingRate(String instId);

    //获取永续合约历史资金费率
    List<FundingRateHistoryVo> fundingRateHistory(String instId,
                                                  String after,
                                                  String before,
                                                  String limit);

    //获取限价
    List<PriceLimitVo> priceLimit(String instId);

    //获取期权定价
    List<OptSummaryVo> optSummary(String uly,
                                  String expTime);

    //获取预估交割/行权价格
    List<EstimatedPriceVo> estimatedPrice(String instId);

    //获取免息额度和币种折算率等级
    List<DiscountRateInterestFreeQuotaVo> discountRateInterestFreeQuota(String ccy);

    //获取系统时间
    List<TimeVo> time();

    //获取平台公共爆仓单信息
    List<LiquidationOrdersVo> liquidationOrders(LiquidationOrdersDto dto);

    //获取标记价格
    List<MarkPriceVo> markPrice(String instType,
                                String uly,
                                String instId);

}
