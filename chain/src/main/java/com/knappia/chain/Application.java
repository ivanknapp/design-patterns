package com.knappia.chain;

public class Application {
    public static void main(String[] args) {

        final BrokerAccount brokerAccount = new BrokerAccount(null, 1000.0);
        final BitcoinAccount bitcoinAccount = new BitcoinAccount(brokerAccount, 300.0);
        final BankAccount bankAccount = new BankAccount(bitcoinAccount, 150.0);

        bankAccount.pay(100.0);
        bankAccount.pay(160.0);
        bankAccount.pay(310.0);
        bankAccount.pay(1100.0);
    }
}
