package com.knappia.singleton;

public final class President {

    private final static President INSTANCE = new President();

    private President() {
    }

    public static President getInstance() {
        return INSTANCE;
    }
}
