package com.knappia.builder;

public enum MemorySizeType {
    SMALL("4GB"), MEDIUM("16GB"), LARGE("128");
    private String title;

    MemorySizeType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
