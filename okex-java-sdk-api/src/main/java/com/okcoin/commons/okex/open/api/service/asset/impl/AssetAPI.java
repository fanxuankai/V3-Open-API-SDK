package com.okcoin.commons.okex.open.api.service.asset.impl;

import com.okcoin.commons.okex.open.api.bean.Result;
import com.okcoin.commons.okex.open.api.bean.asset.param.TransferDto;
import com.okcoin.commons.okex.open.api.bean.asset.param.WithdrawalDto;
import com.okcoin.commons.okex.open.api.bean.asset.result.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

/**
 * Asset api
 *
 * @author hucj
 * @version 1.0.0
 * @date 2018/07/04 20:51
 */
public interface AssetAPI {

    //获取充值地址信息
    @GET("/api/v5/asset/deposit-address")
    Call<Result<List<DepositAddressVo>>> depositAddress(@Query("ccy") String ccy);

    //获取资金账户余额信息
    @GET("/api/v5/asset/balances")
    Call<Result<List<BalancesVo>>> balances(@Query("ccy") String ccy);

    //资金划转
    @POST("/api/v5/asset/transfer")
    Call<Result<List<TransferVo>>> transfer(@Body TransferDto dto);

    //提币
    @POST("/api/v5/asset/withdrawal")
    Call<Result<List<WithdrawalVo>>> withdrawal(@Body WithdrawalDto dto);

    //充值记录
    @GET("/api/v5/asset/deposit-history")
    Call<Result<List<DepositHistoryVo>>> depositHistory(@Query("ccy") String ccy,
                                                        @Query("state") String state,
                                                        @Query("after") String after,
                                                        @Query("before") String before,
                                                        @Query("limit") String limit);

    //提币记录
    @GET("/api/v5/asset/withdrawal-history")
    Call<Result<List<WithdrawalHistoryVo>>> withdrawalHistory(@Query("ccy") String ccy,
                                                              @Query("state") String state,
                                                              @Query("after") String after,
                                                              @Query("before") String before,
                                                              @Query("limit") String limit);

    //获取币种列表
    @GET("/api/v5/asset/currencies")
    Call<Result<List<CurrencyVo>>> currencies();

    //余币宝申购/赎回
    @GET("/api/v5/asset/purchase_redempt")
    Call<Result<List<PurchaseRedemptVo>>> purchaseRedempt(@Query("ccy") String ccy,
                                                          @Query("amt") String amt,
                                                          @Query("side") String side);

    //资金流水查询
    @GET("/api/v5/asset/bills")
    Call<Result<List<BillVo>>> bills(@Query("ccy") String ccy,
                                     @Query("type") String type,
                                     @Query("after") String after,
                                     @Query("before") String before,
                                     @Query("limit") String limit);

}
