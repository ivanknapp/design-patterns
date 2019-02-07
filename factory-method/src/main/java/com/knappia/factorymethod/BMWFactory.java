package com.knappia.factorymethod;

public class BMWFactory implements CarFactory {

    @Override
    public Car createCar(CarType type) {
        return new BMWCar(type);
    }
}
