package com.knappia.singleton;

public final class ThreadSafeLazyLoadPresident {
    private static ThreadSafeLazyLoadPresident instance;

    private ThreadSafeLazyLoadPresident() {
        if (instance == null){
            instance = this;
        }else {
            throw new IllegalStateException("Already Initialized");
        }
    }

    public static synchronized ThreadSafeLazyLoadPresident getInstance(){
        if (instance == null){
            instance = new ThreadSafeLazyLoadPresident();
        }
        return instance;
    }
}
