package com.knappia.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static com.knappia.proxy.LoggerUtils.logger;
import static org.mockito.Mockito.*;

class DoorTimeLockerTest {

    @BeforeEach
    void setUp() {
        reset(logger);
    }

    @Test
    void open() {
        Door shopDoor = new ShopDoor();
        DoorTimeLocker locker = new DoorTimeLocker(shopDoor);

        for (int i = 0; i < 23; i++) {
            locker.open(LocalTime.of(i, 0));
        }

        verify(logger, times(14)).info("Open shop door");
        verify(logger, times(9)).info("Come later, door is closed");
    }

    @Test
    void close() {
        Door shopDoor = new ShopDoor();
        DoorTimeLocker locker = new DoorTimeLocker(shopDoor);

        locker.close();

        verify(logger, times(1)).info("Close shop door");
    }
}