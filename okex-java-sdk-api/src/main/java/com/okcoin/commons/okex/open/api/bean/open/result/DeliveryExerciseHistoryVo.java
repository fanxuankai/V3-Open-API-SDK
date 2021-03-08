package com.okcoin.commons.okex.open.api.bean.open.result;

import java.util.List;

/**
 * @author fanxuankai
 */
public class DeliveryExerciseHistoryVo {

    /**
     * ts : 1597026383085
     * details : [{"type":"delivery","insId":"BTC-USD-190927","px":"0.016"}]
     */

    private String ts;
    private List<DetailsBean> details;

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public List<DetailsBean> getDetails() {
        return details;
    }

    public void setDetails(List<DetailsBean> details) {
        this.details = details;
    }

    public static class DetailsBean {
        /**
         * type : delivery
         * insId : BTC-USD-190927
         * px : 0.016
         */

        private String type;
        private String insId;
        private String px;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getInsId() {
            return insId;
        }

        public void setInsId(String insId) {
            this.insId = insId;
        }

        public String getPx() {
            return px;
        }

        public void setPx(String px) {
            this.px = px;
        }
    }
}
