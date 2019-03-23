package com.knappia.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestingUnit extends ITUnit {
    @Override
    public String getName() {
        return "Tester";
    }

    @Override
    public void doWork() {
        log.info("Tester test another feature");
    }
}
