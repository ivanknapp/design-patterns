package com.knappia.flyweight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlackTea implements Tea {
    @Override
    public void getDescriptions() {
        log.info("Black tea lipton");
    }
}
