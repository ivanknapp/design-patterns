package com.knappia.chain;

public class BrokerAccount extends Account {
    public BrokerAccount(Account next, Double balance) {
        super(next, balance);
    }
}
