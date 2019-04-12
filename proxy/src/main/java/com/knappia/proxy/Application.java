package com.knappia.proxy;

import java.time.LocalTime;

public class Application {
    public static void main(String[] args) {
        final Door shopDoor = new ShopDoor();

        final DoorTimeLocker locker = new DoorTimeLocker(shopDoor);

        locker.open(LocalTime.of(22, 22));

        locker. close();

        locker.open(LocalTime.of(23, 5));
    }
}
