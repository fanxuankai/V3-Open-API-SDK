package com.okcoin.commons.okex.open.api.service.account;

import com.okcoin.commons.okex.open.api.bean.account.param.*;
import com.okcoin.commons.okex.open.api.bean.account.result.*;

import java.util.List;


public interface AccountAPIService {
    //查看账户余额
    List<Balance> getBalance(String ccy);

    //查看持仓信息
    List<Position> getPositions(String instType, String instId, String posId);

    //账单流水查询（近七天）
    List<BillVo> getBills(BillDto dto);

    //账单流水查询（近三个月）
    List<BillVo> getBillsArchive(BillDto dto);

    //查看账户配置
    List<ConfigVo> getConfig(ConfigDto dto);

    //设置持仓模式
    List<PositionModeVo> setPositionMode(PositionModeDto dto);

    //设置杠杆倍数
    List<LeverageVo> setLeverage(LeverageDto dto);

    //获取最大可买卖/开仓数量
    List<MaxSizeVo> getMaxSize(MaxSizeDto dto);

    //获取最大可用数量
    List<MaxAvailSizeVo> getMaxAvailSize(MaxAvailSizeDto dto);

    //调整保证金
    List<PositionMarginBalanceVo> setPositionMarginBalance(PositionMarginBalanceDto dto);

    //获取杠杆倍数
    List<LeverageVo> getLeverageInfo(String instId, String mgnMode);

    //获取交易产品最大可借
    List<MaxLoanVo> getMaxLoan(String instId, String mgnMode, String mgnCcy);

    //获取当前账户交易手续费费率
    List<TradeFeeVo> getTradeFee(String instType, String instId, String uly, String category);

    //获取计息记录
    List<InterestAccruedVo> getInterestAccrued(InterestAccruedDto dto);

    //期权希腊字母PA/BS切换
    List<GreeksTypeVo> setGreeks(GreeksTypeDto dto);

    //查看账户最大可转余额
    List<MaxWithDrawalVo> getMaxWithdrawal(String ccy);

}
