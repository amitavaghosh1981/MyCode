package com.amit.model;

public class Account {
    private String accountNo;
    private String branchName;
    private double balance = 0.0;

    public Account(String accountNo, String branchName, double balance) {
        this.accountNo = accountNo;
        this.branchName = branchName;
        this.balance = balance;
    }
}