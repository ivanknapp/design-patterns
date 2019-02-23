package com.knappia.singleton;

class InitializingOnDemandHolderIdiomPresidentTest extends SingletonTest<InitializingOnDemandHolderIdiomPresident> {

    public InitializingOnDemandHolderIdiomPresidentTest() {
        super(InitializingOnDemandHolderIdiomPresident::getInstance);
    }
}