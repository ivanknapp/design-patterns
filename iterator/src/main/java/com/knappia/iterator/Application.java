package com.knappia.iterator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        TV tv = new TV(new SiberiaTelevision());
        while (tv.hasNext()){
            log.info(tv.next().toString());
        }

        tv = new TV(new CentralTelevesion());

        tv.forEachRemaining(channel -> log.info(channel.toString()));
    }
}
