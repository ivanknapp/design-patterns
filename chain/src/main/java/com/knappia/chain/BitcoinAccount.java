package com.knappia.chain;

public class BitcoinAccount extends Account {
    public BitcoinAccount(Account next, Double balance) {
        super(next, balance);
    }
}
