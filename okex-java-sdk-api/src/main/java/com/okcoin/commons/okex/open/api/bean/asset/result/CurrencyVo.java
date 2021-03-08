package com.okcoin.commons.okex.open.api.bean.asset.result;

/**
 * @author fanxuankai
 */
public class CurrencyVo {

    /**
     * ccy : BTC
     * chain :
     * name :
     * canDep : true
     * canWd : true
     * canInternal : true
     * minWd : 0.01
     * maxFee : 0.02
     * minFee : 0.0005
     */

    private String ccy;
    private String chain;
    private String name;
    private boolean canDep;
    private boolean canWd;
    private boolean canInternal;
    private String minWd;
    private String maxFee;
    private String minFee;

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanDep() {
        return canDep;
    }

    public void setCanDep(boolean canDep) {
        this.canDep = canDep;
    }

    public boolean isCanWd() {
        return canWd;
    }

    public void setCanWd(boolean canWd) {
        this.canWd = canWd;
    }

    public boolean isCanInternal() {
        return canInternal;
    }

    public void setCanInternal(boolean canInternal) {
        this.canInternal = canInternal;
    }

    public String getMinWd() {
        return minWd;
    }

    public void setMinWd(String minWd) {
        this.minWd = minWd;
    }

    public String getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(String maxFee) {
        this.maxFee = maxFee;
    }

    public String getMinFee() {
        return minFee;
    }

    public void setMinFee(String minFee) {
        this.minFee = minFee;
    }
}
