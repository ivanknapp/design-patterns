package com.knappia.factorymethod;

public class MercedesFactory implements CarFactory{

    @Override
    public Car createCar(CarType type) {
        return new MercedesCar(type);
    }
}
