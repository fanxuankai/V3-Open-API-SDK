package com.okcoin.commons.okex.open.api.service.open.impl;

import com.okcoin.commons.okex.open.api.bean.account.result.Balance;
import com.okcoin.commons.okex.open.api.bean.open.param.LiquidationOrdersDto;
import com.okcoin.commons.okex.open.api.bean.open.result.*;
import com.okcoin.commons.okex.open.api.client.APIClient;
import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.service.open.OpenAPIService;
import com.okcoin.commons.okex.open.api.utils.BeanUtil;

import java.util.List;

public class OpenAPIServiceImpl implements OpenAPIService {

    private final APIClient client;
    private final OpenAPI api;

    public OpenAPIServiceImpl(APIConfiguration config) {
        this.client = new APIClient(config);
        this.api = client.createService(OpenAPI.class);
    }

    @Override
    public List<Balance> instruments(String instType, String uly, String instId) {
        return client.executeSyncWithResult(api.instruments(instType, uly, instId));
    }

    @Override
    public List<DeliveryExerciseHistoryVo> deliveryExerciseHistory(String instType, String uly, String after,
                                                                   String before, String limit) {
        return client.executeSyncWithResult(api.deliveryExerciseHistory(instType, uly, after, before, limit));
    }

    @Override
    public List<OpenInterestVo> openInterest(String instType, String uly, String instId) {
        return client.executeSyncWithResult(api.openInterest(instType, uly, instId));
    }

    @Override
    public List<FundingRateVo> fundingRate(String instId) {
        return client.executeSyncWithResult(api.fundingRate(instId));
    }

    @Override
    public List<FundingRateHistoryVo> fundingRateHistory(String instId, String after, String before, String limit) {
        return client.executeSyncWithResult(api.fundingRateHistory(instId, after, before, limit));
    }

    @Override
    public List<PriceLimitVo> priceLimit(String instId) {
        return client.executeSyncWithResult(api.priceLimit(instId));
    }

    @Override
    public List<OptSummaryVo> optSummary(String uly, String expTime) {
        return client.executeSyncWithResult(api.optSummary(uly, expTime));
    }

    @Override
    public List<EstimatedPriceVo> estimatedPrice(String instId) {
        return client.executeSyncWithResult(api.estimatedPrice(instId));
    }

    @Override
    public List<DiscountRateInterestFreeQuotaVo> discountRateInterestFreeQuota(String ccy) {
        return client.executeSyncWithResult(api.discountRateInterestFreeQuota(ccy));
    }

    @Override
    public List<List<String>> time() {
        return client.executeSyncWithResult(api.time());
    }

    @Override
    public List<LiquidationOrdersVo> liquidationOrders(LiquidationOrdersDto dto) {
        return client.executeSyncWithResult(api.liquidationOrders(BeanUtil.toMap(dto)));
    }

    @Override
    public List<MarkPriceVo> markPrice(String instType, String uly, String instId) {
        return client.executeSyncWithResult(api.markPrice(instType, uly, instId));
    }
}
