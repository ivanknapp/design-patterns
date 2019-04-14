package com.knappia.command;

public enum Visibility {
    VISIBLE("visible"), INVISIBLE("invisible");
    private String status;

    Visibility(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
