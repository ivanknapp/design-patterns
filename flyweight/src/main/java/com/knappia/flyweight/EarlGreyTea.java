package com.knappia.flyweight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EarlGreyTea implements Tea{
    @Override
    public void getDescriptions() {
        log.info("Earl Grey a variety of China tea flavoured with oil of bergamot");
    }
}
