package com.knappia.factorymethod;

public class MercedesCar implements Car {
    private CarType carType;

    public MercedesCar(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "MercedesCar{" +
                "carType=" + carType +
                '}';
    }

    @Override
    public CarType getCarType() {
        return carType;
    }
}
