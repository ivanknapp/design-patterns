package com.knappia.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnalystUnit extends ITUnit {
    @Override
    public String getName() {
        return "Analyst";
    }

    @Override
    public void doWork() {
        log.info("The analyst determines the current state of affairs.");
    }
}
