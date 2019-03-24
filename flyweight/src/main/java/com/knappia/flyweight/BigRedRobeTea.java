package com.knappia.flyweight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BigRedRobeTea implements Tea {
    @Override
    public void getDescriptions() {
        log.info("Da Hong Pao (Big Red Robe) is a Wuyi rock tea grown in the Wuyi Mountains.");
    }
}
