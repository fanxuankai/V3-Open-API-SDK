package com.okcoin.commons.okex.open.api.bean.open.result;

/**
 * @author fanxuankai
 */
public class FundingRateHistoryVo {

    /**
     * instType : SWAP
     * instId : BTC-USDT-SWAP
     * fundingRate : 0.018
     * realizedRate : 0.017
     * fundingTime : 1597026383085
     */

    private String instType;
    private String instId;
    private String fundingRate;
    private String realizedRate;
    private String fundingTime;

    public String getInstType() {
        return instType;
    }

    public void setInstType(String instType) {
        this.instType = instType;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getFundingRate() {
        return fundingRate;
    }

    public void setFundingRate(String fundingRate) {
        this.fundingRate = fundingRate;
    }

    public String getRealizedRate() {
        return realizedRate;
    }

    public void setRealizedRate(String realizedRate) {
        this.realizedRate = realizedRate;
    }

    public String getFundingTime() {
        return fundingTime;
    }

    public void setFundingTime(String fundingTime) {
        this.fundingTime = fundingTime;
    }
}
