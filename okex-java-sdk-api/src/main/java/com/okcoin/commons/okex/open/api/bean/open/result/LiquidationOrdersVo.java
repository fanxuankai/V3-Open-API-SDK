package com.okcoin.commons.okex.open.api.bean.open.result;

import java.util.List;

/**
 * @author fanxuankai
 */
public class LiquidationOrdersVo {

    /**
     * instType : 2
     * totalLoss : 123
     * instId : btc
     * uly : 123
     * details : [{"side":"buy","posSide":"short","bkPx":"1234","sz":"1415","bkLoss":"14","ccy":"",
     * "ts":"1597026383085"},{"side":"buy","posSide":"short","bkPx":"1234","sz":"1415","bkLoss":"14","ccy":"",
     * "ts":"1597026383085"}]
     */

    private String instType;
    private String totalLoss;
    private String instId;
    private String uly;
    private List<DetailsBean> details;

    public String getInstType() {
        return instType;
    }

    public void setInstType(String instType) {
        this.instType = instType;
    }

    public String getTotalLoss() {
        return totalLoss;
    }

    public void setTotalLoss(String totalLoss) {
        this.totalLoss = totalLoss;
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

    public List<DetailsBean> getDetails() {
        return details;
    }

    public void setDetails(List<DetailsBean> details) {
        this.details = details;
    }

    public static class DetailsBean {
        /**
         * side : buy
         * posSide : short
         * bkPx : 1234
         * sz : 1415
         * bkLoss : 14
         * ccy :
         * ts : 1597026383085
         */

        private String side;
        private String posSide;
        private String bkPx;
        private String sz;
        private String bkLoss;
        private String ccy;
        private String ts;

        public String getSide() {
            return side;
        }

        public void setSide(String side) {
            this.side = side;
        }

        public String getPosSide() {
            return posSide;
        }

        public void setPosSide(String posSide) {
            this.posSide = posSide;
        }

        public String getBkPx() {
            return bkPx;
        }

        public void setBkPx(String bkPx) {
            this.bkPx = bkPx;
        }

        public String getSz() {
            return sz;
        }

        public void setSz(String sz) {
            this.sz = sz;
        }

        public String getBkLoss() {
            return bkLoss;
        }

        public void setBkLoss(String bkLoss) {
            this.bkLoss = bkLoss;
        }

        public String getCcy() {
            return ccy;
        }

        public void setCcy(String ccy) {
            this.ccy = ccy;
        }

        public String getTs() {
            return ts;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }
    }
}
