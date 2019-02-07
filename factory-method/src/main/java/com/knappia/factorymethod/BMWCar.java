package com.knappia.factorymethod;

public class BMWCar implements Car {

    private CarType carType;

    public BMWCar(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "BMWCar{" +
                "carType=" + carType +
                '}';
    }

    @Override
    public CarType getCarType() {
        return carType;
    }
}
