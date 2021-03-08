package com.okcoin.commons.okex.open.api.test.market;

import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.enums.I18nEnum;
import com.okcoin.commons.okex.open.api.test.BaseTests;

/**
 * Market api basetests
 *
 * @author hucj
 * @version 1.0.0
 * @date 2018/7/04 18:23
 */
public class MarketAPIBaseTests extends BaseTests {

    public APIConfiguration config() {
        APIConfiguration config = new APIConfiguration();

        config.setEndpoint("https://www.okex.com/");
        // apiKey，api注册成功后页面上有

        config.setApiKey("");
        config.setSecretKey("");
        config.setPassphrase("");

        config.setPrint(true);
        config.setI18n(I18nEnum.ENGLISH);
        config.setSimulated(true);
        return config;
    }


}