package com.knappia.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.knappia.proxy.LoggerUtils.logger;
import static org.mockito.Mockito.*;

class ShopDoorTest {

    @BeforeEach
    void setUp() {
        reset(logger);
    }

    @Test
    void open() {
        Door shopDoor = new ShopDoor();
        shopDoor.open();

        verify(logger, times(1)).info("Open shop door");
    }

    @Test
    void close() {
        Door shopDoor = new ShopDoor();
        shopDoor.close();

        verify(logger, times(1)).info("Close shop door");
    }
}