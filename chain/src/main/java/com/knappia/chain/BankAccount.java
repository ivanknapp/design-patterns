package com.knappia.chain;

public class BankAccount extends Account {

    public BankAccount(Account next, Double balance) {
        super(next, balance);
    }
}
