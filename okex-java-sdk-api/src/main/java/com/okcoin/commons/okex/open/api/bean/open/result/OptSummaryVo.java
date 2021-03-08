package com.okcoin.commons.okex.open.api.bean.open.result;

/**
 * @author fanxuankai
 */
public class OptSummaryVo {

    /**
     * instType : OPTION
     * instId : BTC-USD-200103-5500-C
     * uly : BTC-USD
     * delta : 0.7494223636
     * gamma : -0.6765419039
     * theta : -0.0000809873
     * vega : 0.0000077307
     * deltaBS : 0.7494223636
     * gammaBS : -0.6765419039
     * thetaBS : -0.0000809873
     * vegaBS : 0.0000077307
     * realVol : 0
     * bidVol :
     * askVol : 1.5625
     * markVol : 0.9987
     * lever : 4.0342
     * ts : 1597026383085
     */

    private String instType;
    private String instId;
    private String uly;
    private String delta;
    private String gamma;
    private String theta;
    private String vega;
    private String deltaBS;
    private String gammaBS;
    private String thetaBS;
    private String vegaBS;
    private String realVol;
    private String bidVol;
    private String askVol;
    private String markVol;
    private String lever;
    private String ts;

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

    public String getUly() {
        return uly;
    }

    public void setUly(String uly) {
        this.uly = uly;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public String getGamma() {
        return gamma;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public String getTheta() {
        return theta;
    }

    public void setTheta(String theta) {
        this.theta = theta;
    }

    public String getVega() {
        return vega;
    }

    public void setVega(String vega) {
        this.vega = vega;
    }

    public String getDeltaBS() {
        return deltaBS;
    }

    public void setDeltaBS(String deltaBS) {
        this.deltaBS = deltaBS;
    }

    public String getGammaBS() {
        return gammaBS;
    }

    public void setGammaBS(String gammaBS) {
        this.gammaBS = gammaBS;
    }

    public String getThetaBS() {
        return thetaBS;
    }

    public void setThetaBS(String thetaBS) {
        this.thetaBS = thetaBS;
    }

    public String getVegaBS() {
        return vegaBS;
    }

    public void setVegaBS(String vegaBS) {
        this.vegaBS = vegaBS;
    }

    public String getRealVol() {
        return realVol;
    }

    public void setRealVol(String realVol) {
        this.realVol = realVol;
    }

    public String getBidVol() {
        return bidVol;
    }

    public void setBidVol(String bidVol) {
        this.bidVol = bidVol;
    }

    public String getAskVol() {
        return askVol;
    }

    public void setAskVol(String askVol) {
        this.askVol = askVol;
    }

    public String getMarkVol() {
        return markVol;
    }

    public void setMarkVol(String markVol) {
        this.markVol = markVol;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
