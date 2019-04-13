package com.knappia.chain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Account {
    Account next;
    Double balance;

    public Account(Account next, Double balance) {
        this.next = next;
        this.balance = balance;
    }

    public void pay(Double price) {
        if (canPay(price)) {
            log.info("Successfully paid {} by {}", price, this.getClass().getSimpleName());
        } else if (next != null) {
            next.pay(price);
        } else {
            log.info("No money, No honey");
        }
    }

    private boolean canPay(Double price) {
        return balance > price;
    }
}
