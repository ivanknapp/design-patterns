package com.knappia.singleton;

public enum EnumPresident {
    INSTANCE;

    @Override
    public String toString() {
        return this.getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
