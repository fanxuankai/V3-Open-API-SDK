package com.okcoin.commons.okex.open.api.test.market;

import com.okcoin.commons.okex.open.api.bean.market.result.BookVo;
import com.okcoin.commons.okex.open.api.service.market.MarketAPIService;
import com.okcoin.commons.okex.open.api.service.market.impl.MarketAPIServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MarketAPITests extends MarketAPIBaseTests {

    private static final Logger LOG = LoggerFactory.getLogger(MarketAPITests.class);

    private MarketAPIService service;

    @Before
    public void before() {
        this.config = this.config();
        this.service = new MarketAPIServiceImpl(this.config);
    }

    @Test
    public void getMaxWithdrawal() {
        List<BookVo> list = service.books("BTC/USDT", null);
        toResultString(LOG, "market", list);
    }
}
