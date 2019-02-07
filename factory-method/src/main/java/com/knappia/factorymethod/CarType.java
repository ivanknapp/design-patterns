package com.knappia.factorymethod;

public enum CarType {
    PASSENGER_CAR("little car"), TRUCK("auto truck"), BUS("bus is busy");

    private String title;

    CarType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "title='" + title + '\'' +
                '}';
    }
}
