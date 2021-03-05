package com.okcoin.commons.okex.open.api.service.account.impl;

import com.okcoin.commons.okex.open.api.bean.Result;
import com.okcoin.commons.okex.open.api.bean.account.param.GreeksTypeDto;
import com.okcoin.commons.okex.open.api.bean.account.param.LeverageDto;
import com.okcoin.commons.okex.open.api.bean.account.param.PositionMarginBalanceDto;
import com.okcoin.commons.okex.open.api.bean.account.param.PositionModeDto;
import com.okcoin.commons.okex.open.api.bean.account.result.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * Account api
 *
 * @author hucj
 * @version 1.0.0
 * @date 2018/07/04 20:51
 */
public interface AccountAPI {

    //查看账户余额
    @GET("/api/v5/account/balance")
    Call<Result<List<Balance>>> getBalance(@Query("ccy") String ccy);

    //查看持仓信息
    @GET("/api/v5/account/positions")
    Call<Result<List<Position>>> getPositions(@Query("instType") String instType,
                                              @Query("instId") String instId,
                                              @Query("posId") String posId);

    //账单流水查询（近七天）
    @GET("/api/v5/account/bills")
    Call<Result<List<BillVo>>> getBills(@QueryMap Map<String, String> params);

    //账单流水查询（近三个月）
    @GET("/api/v5/account/bills-archive")
    Call<Result<List<BillVo>>> getBillsArchive(@QueryMap Map<String, String> params);

    //查看账户配置
    @GET("/api/v5/account/config")
    Call<Result<List<ConfigVo>>> getConfig(@QueryMap Map<String, String> params);

    //设置持仓模式
    @POST("/api/v5/account/set-position-mode")
    Call<Result<List<PositionModeVo>>> setPositionMode(@Body PositionModeDto dto);

    //设置杠杆倍数
    @POST("/api/v5/account/set-leverage")
    Call<Result<List<LeverageVo>>> setLeverage(@Body LeverageDto dto);

    //获取最大可买卖/开仓数量
    @GET("/api/v5/account/max-size")
    Call<Result<List<MaxSizeVo>>> getMaxSize(@QueryMap Map<String, String> params);

    //获取最大可用数量
    @GET("/api/v5/account/max-avail-size")
    Call<Result<List<MaxAvailSizeVo>>> getMaxAvailSize(@QueryMap Map<String, String> params);

    //调整保证金
    @POST("/api/v5/account/position/margin-balance")
    Call<Result<List<PositionMarginBalanceVo>>> setPositionMarginBalance(@Body PositionMarginBalanceDto dto);

    //获取杠杆倍数
    @GET("/api/v5/account/leverage-info")
    Call<Result<List<LeverageVo>>> getLeverageInfo(@Query("instId") String instId,
                                                   @Query("mgnMode") String mgnMode);

    //获取交易产品最大可借
    @GET("/api/v5/account/max-loan")
    Call<Result<List<MaxLoanVo>>> getMaxLoan(@Query("instId") String instId,
                                             @Query("mgnMode") String mgnMode,
                                             @Query("mgnCcy") String mgnCcy);

    //获取当前账户交易手续费费率
    @GET("/api/v5/account/trade-fee")
    Call<Result<List<TradeFeeVo>>> getTradeFee(@Query("instType") String instType,
                                               @Query("instId") String instId,
                                               @Query("uly") String uly,
                                               @Query("category") String category);

    //获取计息记录
    @GET("/api/v5/account/interest-accrued")
    Call<Result<List<InterestAccruedVo>>> getInterestAccrued(@QueryMap Map<String, String> params);

    //期权希腊字母PA/BS切换
    @POST("/api/v5/account/set-greeks")
    Call<Result<List<GreeksTypeVo>>> setGreeks(@Body GreeksTypeDto dto);

    //查看账户最大可转余额
    @GET("/api/v5/account/max-withdrawal")
    Call<Result<List<MaxWithDrawalVo>>> getMaxWithdrawal(@Query("ccy") String ccy);

}
