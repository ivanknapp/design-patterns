package com.knappia.singleton;

class ThreadSafeLazyLoadPresidentTest extends SingletonTest<ThreadSafeLazyLoadPresident> {
    public ThreadSafeLazyLoadPresidentTest() {
        super(ThreadSafeLazyLoadPresident::getInstance);
    }
}