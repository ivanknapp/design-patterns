package com.knappia.singleton;

class EnumPresidentTest extends SingletonTest<EnumPresident> {

    public EnumPresidentTest() {
        super(() -> EnumPresident.INSTANCE);
    }
}