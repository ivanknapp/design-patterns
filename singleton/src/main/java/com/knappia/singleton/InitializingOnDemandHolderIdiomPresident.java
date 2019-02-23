package com.knappia.singleton;


public final class InitializingOnDemandHolderIdiomPresident {

    private InitializingOnDemandHolderIdiomPresident() {
    }

    public static InitializingOnDemandHolderIdiomPresident getInstance() {
        return InitializationHelper.INSTANCE;
    }

    public static class InitializationHelper {
        private final static InitializingOnDemandHolderIdiomPresident INSTANCE = new InitializingOnDemandHolderIdiomPresident();
    }
}
