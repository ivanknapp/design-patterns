package com.knappia.builder;

public enum OperationSystem {
    ANDROID("andriod OS"),
    IOS("apple OS"),
    BLACK_BERRY("ultra high defence os"),
    JAVA("java OS");

    private String title;

    OperationSystem(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
