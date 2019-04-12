package com.knappia.proxy;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;

@Slf4j
public class DoorTimeLocker {
    private Door door;

    public DoorTimeLocker(Door door) {
        this.door = door;
    }

    public void open(LocalTime time) {
        if (time.isBefore(LocalTime.of(22, 59)) && time.isAfter(LocalTime.of(8, 0))) {
            door.open();
        } else {
            log.info("Come later, door is closed");
        }
    }

    public void close(){
        door.close();
    }
}
