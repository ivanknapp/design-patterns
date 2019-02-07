package com.knappia.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    CarFactory carFactory;

    public Application(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public static void main(String[] args) {
        Application application = new Application(new BMWFactory());
        Car car = application.carFactory.createCar(CarType.PASSENGER_CAR);
        Car car2 = application.carFactory.createCar(CarType.BUS);
        log.info(car.toString());
        log.info(car2.toString());

        application = new Application(new MercedesFactory());
        Car car3 = application.carFactory.createCar(CarType.TRUCK);
        log.info(car3.toString());

    }
}
