package com.knappia.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeveleoperUnit extends ITUnit {
    @Override
    public String getName() {
        return "Developer";
    }

    @Override
    public void doWork() {
        log.info("Developer swears at the code");
    }
}
