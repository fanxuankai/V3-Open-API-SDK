package com.okcoin.commons.okex.open.api.service.account.impl;

import com.okcoin.commons.okex.open.api.bean.account.param.*;
import com.okcoin.commons.okex.open.api.bean.account.result.*;
import com.okcoin.commons.okex.open.api.client.APIClient;
import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.service.account.AccountAPIService;
import com.okcoin.commons.okex.open.api.utils.BeanUtil;

import java.util.List;

public class AccountAPIServiceImpl implements AccountAPIService {

    private final APIClient client;
    private final AccountAPI api;

    public AccountAPIServiceImpl(APIConfiguration config) {
        this.client = new APIClient(config);
        this.api = client.createService(AccountAPI.class);
    }

    @Override
    public List<Balance> getBalance(String ccy) {
        return client.executeSyncWithResult(api.getBalance(ccy));
    }

    @Override
    public List<Position> getPositions(String instType, String instId, String posId) {
        return client.executeSyncWithResult(api.getPositions(instType, instId, posId));
    }

    @Override
    public List<BillVo> getBills(BillDto dto) {
        return client.executeSyncWithResult(api.getBills(BeanUtil.toMap(dto)));
    }

    @Override
    public List<BillVo> getBillsArchive(BillDto dto) {
        return client.executeSyncWithResult(api.getBillsArchive(BeanUtil.toMap(dto)));
    }

    @Override
    public List<ConfigVo> getConfig(ConfigDto dto) {
        return client.executeSyncWithResult(api.getConfig(BeanUtil.toMap(dto)));
    }

    @Override
    public List<PositionModeVo> setPositionMode(PositionModeDto dto) {
        return client.executeSyncWithResult(api.setPositionMode(dto));
    }

    @Override
    public List<LeverageVo> setLeverage(LeverageDto dto) {
        return client.executeSyncWithResult(api.setLeverage(dto));
    }

    @Override
    public List<MaxSizeVo> getMaxSize(MaxSizeDto dto) {
        return client.executeSyncWithResult(api.getMaxSize(BeanUtil.toMap(dto)));
    }

    @Override
    public List<MaxAvailSizeVo> getMaxAvailSize(MaxAvailSizeDto dto) {
        return client.executeSyncWithResult(api.getMaxAvailSize(BeanUtil.toMap(dto)));
    }

    @Override
    public List<PositionMarginBalanceVo> setPositionMarginBalance(PositionMarginBalanceDto dto) {
        return client.executeSyncWithResult(api.setPositionMarginBalance(dto));
    }

    @Override
    public List<LeverageVo> getLeverageInfo(String instId, String mgnMode) {
        return client.executeSyncWithResult(api.getLeverageInfo(instId, mgnMode));
    }

    @Override
    public List<MaxLoanVo> getMaxLoan(String instId, String mgnMode, String mgnCcy) {
        return client.executeSyncWithResult(api.getMaxLoan(instId, mgnMode, mgnCcy));
    }

    @Override
    public List<TradeFeeVo> getTradeFee(String instType, String instId, String uly, String category) {
        return client.executeSyncWithResult(api.getTradeFee(instType, instId, uly, category));
    }

    @Override
    public List<InterestAccruedVo> getInterestAccrued(InterestAccruedDto dto) {
        return client.executeSyncWithResult(api.getInterestAccrued(BeanUtil.toMap(dto)));
    }

    @Override
    public List<GreeksTypeVo> setGreeks(GreeksTypeDto dto) {
        return client.executeSyncWithResult(api.setGreeks(dto));
    }

    @Override
    public List<MaxWithDrawalVo> getMaxWithdrawal(String ccy) {
        return client.executeSyncWithResult(api.getMaxWithdrawal(ccy));
    }

}
