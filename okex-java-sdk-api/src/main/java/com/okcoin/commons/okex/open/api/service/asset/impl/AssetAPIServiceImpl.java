package com.okcoin.commons.okex.open.api.service.asset.impl;

import com.okcoin.commons.okex.open.api.bean.asset.param.TransferDto;
import com.okcoin.commons.okex.open.api.bean.asset.param.WithdrawalDto;
import com.okcoin.commons.okex.open.api.bean.asset.result.*;
import com.okcoin.commons.okex.open.api.client.APIClient;
import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.service.asset.AssetAPIService;

import java.util.List;

public class AssetAPIServiceImpl implements AssetAPIService {

    private final APIClient client;
    private final AssetAPI api;

    public AssetAPIServiceImpl(APIConfiguration config) {
        this.client = new APIClient(config);
        this.api = client.createService(AssetAPI.class);
    }

    @Override
    public List<DepositAddressVo> depositAddress(String ccy) {
        return client.executeSyncWithResult(api.depositAddress(ccy));
    }

    @Override
    public List<BalancesVo> balances(String ccy) {
        return client.executeSyncWithResult(api.balances(ccy));
    }

    @Override
    public List<TransferVo> transfer(TransferDto dto) {
        return client.executeSyncWithResult(api.transfer(dto));
    }

    @Override
    public List<WithdrawalVo> withdrawal(WithdrawalDto dto) {
        return client.executeSyncWithResult(api.withdrawal(dto));
    }

    @Override
    public List<DepositHistoryVo> depositHistory(String ccy, String state, String after, String before, String limit) {
        return client.executeSyncWithResult(api.depositHistory(ccy, state, after, before, limit));
    }

    @Override
    public List<WithdrawalHistoryVo> withdrawalHistory(String ccy, String state, String after, String before,
                                                       String limit) {
        return client.executeSyncWithResult(api.withdrawalHistory(ccy, state, after, before, limit));
    }

    @Override
    public List<CurrencyVo> currencies() {
        return client.executeSyncWithResult(api.currencies());
    }

    @Override
    public List<PurchaseRedemptVo> purchaseRedempt(String ccy, String amt, String side) {
        return client.executeSyncWithResult(api.purchaseRedempt(ccy, amt, side));
    }

    @Override
    public List<BillVo> bills(String ccy, String type, String after, String before, String limit) {
        return client.executeSyncWithResult(api.bills(ccy, type, after, before, limit));
    }
}
