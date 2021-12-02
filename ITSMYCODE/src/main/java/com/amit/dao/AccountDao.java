package com.amit.dao;

import com.amit.model.Account;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class AccountDao {
    private final Map<String, Account> accountMap = new ConcurrentHashMap<String, Account>();

    public void loadAccounts(CountDownLatch countDownLatch) {
        accountMap.put("1111", new Account("1111", "HSR",100));
        accountMap.put("2222", new Account("2222","MP",  100));
        accountMap.put("3333", new Account("3333", "HYD", 100));
        countDownLatch.countDown();
    }


    public Map<String, Account> getAccounts() {
        return accountMap;
    }
}
