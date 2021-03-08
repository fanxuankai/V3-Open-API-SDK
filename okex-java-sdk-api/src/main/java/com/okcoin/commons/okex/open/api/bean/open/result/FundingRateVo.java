package com.okcoin.commons.okex.open.api.bean.open.result;

/**
 * @author fanxuankai
 */
public class FundingRateVo {

    /**
     * instType : SWAP
     * instId : BTC-USDT-SWAP
     * fundingRate : 0.018
     * nextFundingRate : 0.017
     * fundingTime : 1597026383085
     */

    private String instType;
    private String instId;
    private String fundingRate;
    private String nextFundingRate;
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

    public String getNextFundingRate() {
        return nextFundingRate;
    }

    public void setNextFundingRate(String nextFundingRate) {
        this.nextFundingRate = nextFundingRate;
    }

    public String getFundingTime() {
        return fundingTime;
    }

    public void setFundingTime(String fundingTime) {
        this.fundingTime = fundingTime;
    }
}
