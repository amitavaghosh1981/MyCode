package com.amit;

import com.amit.dao.AccountDao;
import com.amit.dao.UserDao;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ProjectStarter {
    private static final CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) {
        UserDao userData = new UserDao();
        userData.loadUsers(countDownLatch);
        AccountDao accountData = new AccountDao();
        accountData.loadAccounts(countDownLatch);
        try {
            if (countDownLatch.await(3000, TimeUnit.MILLISECONDS)) {
                System.out.println("Lets start everything loaded");
            }
        } catch (InterruptedException e) {
           throw new RuntimeException("Timeout: Not able to load the data");
        }
    }
}
