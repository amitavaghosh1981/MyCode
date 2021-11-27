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
            System.out.println("Waiting");
            boolean allAppStarted = countDownLatch.await(10000, TimeUnit.MILLISECONDS);
            if (allAppStarted) {
                System.out.println("Lets start everything loaded:");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException("Timeout: Not able to load the data");
        }
        System.out.println( "App cannot be started");
    }
}
