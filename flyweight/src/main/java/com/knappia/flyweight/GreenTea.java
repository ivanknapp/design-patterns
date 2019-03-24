package com.knappia.flyweight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GreenTea implements Tea {
    @Override
    public void getDescriptions() {
        log.info("Green tea prepared from leaves not fermented before drying");
    }
}
