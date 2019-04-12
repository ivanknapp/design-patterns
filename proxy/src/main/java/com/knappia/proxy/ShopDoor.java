package com.knappia.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShopDoor implements Door {

    private static final Logger log = LoggerFactory.getLogger(ShopDoor.class);

    @Override
    public void open() {
        log.info("Open shop door");
    }

    @Override
    public void close() {
        log.info("Close shop door");
    }
}
