package com.knappia.singleton;

class PresidentTest extends SingletonTest<President> {

    public PresidentTest() {
        super(President::getInstance);
    }
}