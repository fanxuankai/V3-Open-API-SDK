package com.okcoin.commons.okex.open.api.test.account;

import com.okcoin.commons.okex.open.api.service.account.AccountAPIService;
import com.okcoin.commons.okex.open.api.service.account.impl.AccountAPIServiceImpl;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountAPITests extends AccountAPIBaseTests {

    private static final Logger LOG = LoggerFactory.getLogger(AccountAPITests.class);

    private AccountAPIService accountAPIService;

    @Before
    public void before() {
        this.config = this.config();
        this.accountAPIService = new AccountAPIServiceImpl(this.config);
    }

}
