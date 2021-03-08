package com.okcoin.commons.okex.open.api.test.account;

import com.okcoin.commons.okex.open.api.bean.account.result.MaxWithDrawalVo;
import com.okcoin.commons.okex.open.api.service.account.AccountAPIService;
import com.okcoin.commons.okex.open.api.service.account.impl.AccountAPIServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AccountAPITests extends AccountAPIBaseTests {

    private static final Logger LOG = LoggerFactory.getLogger(AccountAPITests.class);

    private AccountAPIService accountAPIService;

    @Before
    public void before() {
        this.config = this.config();
        this.accountAPIService = new AccountAPIServiceImpl(this.config);
    }

    @Test
    public void getMaxWithdrawal() {
        List<MaxWithDrawalVo> list = accountAPIService.getMaxWithdrawal("BTC");
        toResultString(LOG, "account", list);
    }
}
