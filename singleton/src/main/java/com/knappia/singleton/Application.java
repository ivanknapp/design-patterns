package com.knappia.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        President president1 = President.getInstance();
        President president2 = President.getInstance();
        log.info("President 1 {}", president1);
        log.info("President 2 {}", president2);

        EnumPresident enumPresident1 = EnumPresident.INSTANCE;
        EnumPresident enumPresident2 = EnumPresident.INSTANCE;
        log.info("EnumPresident 1 {}", enumPresident1);
        log.info("EnumPresident 2 {}", enumPresident2);

        InitializingOnDemandHolderIdiomPresident initializingOnDemandHolderIdiomPresident1 = InitializingOnDemandHolderIdiomPresident.getInstance();
        InitializingOnDemandHolderIdiomPresident initializingOnDemandHolderIdiomPresident2 = InitializingOnDemandHolderIdiomPresident.getInstance();
        log.info("InitializingOnDemandHolderIdiomPresident 1 {}", initializingOnDemandHolderIdiomPresident1);
        log.info("InitializingOnDemandHolderIdiomPresident 2 {}", initializingOnDemandHolderIdiomPresident2);

        ThreadSafeLazyLoadPresident threadSafeLazyLoadPresident1 = ThreadSafeLazyLoadPresident.getInstance();
        ThreadSafeLazyLoadPresident threadSafeLazyLoadPresident2 = ThreadSafeLazyLoadPresident.getInstance();
        log.info("ThreadSafeLazyLoadPresident 1 {}", threadSafeLazyLoadPresident1);
        log.info("ThreadSafeLazyLoadPresident 2 {}", threadSafeLazyLoadPresident2);
    }
}
