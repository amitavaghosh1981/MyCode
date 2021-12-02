package com.amit.dao;

import com.amit.model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class UserDao {
    private final Map<String, User> userMap = new ConcurrentHashMap<String, User>();

    public void loadUsers(CountDownLatch countDownLatch) {
        userMap.put("001", new User("001", "1111", "amit", 10));
        userMap.put("002", new User("002", "2222", "Raj", 20));
        userMap.put("003", new User("003", "3333", "Harsh", 30));
        countDownLatch.countDown();
    }

    public Map<String, User> getUsers() {
        return userMap;
    }


}
