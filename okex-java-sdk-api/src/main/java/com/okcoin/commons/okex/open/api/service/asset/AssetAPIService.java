package com.okcoin.commons.okex.open.api.service.asset;

import com.okcoin.commons.okex.open.api.bean.asset.param.TransferDto;
import com.okcoin.commons.okex.open.api.bean.asset.param.WithdrawalDto;
import com.okcoin.commons.okex.open.api.bean.asset.result.*;

import java.util.List;

public interface AssetAPIService {
    //获取充值地址信息
    List<DepositAddressVo> depositAddress(String ccy);

    //获取资金账户余额信息
    List<BalancesVo> balances(String ccy);

    //资金划转
    List<TransferVo> transfer(TransferDto dto);

    //提币
    List<WithdrawalVo> withdrawal(WithdrawalDto dto);

    //充值记录
    List<DepositHistoryVo> depositHistory(String ccy,
                                          String state,
                                          String after,
                                          String before,
                                          String limit);

    //提币记录
    List<WithdrawalHistoryVo> withdrawalHistory(String ccy,
                                                String state,
                                                String after,
                                                String before,
                                                String limit);

    //获取币种列表
    List<CurrencyVo> currencies();

    //余币宝申购/赎回
    List<PurchaseRedemptVo> purchaseRedempt(String ccy,
                                            String amt,
                                            String side);

    //资金流水查询
    List<BillVo> bills(String ccy,
                       String type,
                       String after,
                       String before,
                       String limit);
}
