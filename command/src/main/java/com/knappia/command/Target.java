package com.knappia.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public abstract class Target {
    private Size size;
    private Visibility visibility;

    public abstract String toString();

    public void printStatus() {
        log.info("{} size={}, visibility={}", this.toString(), size, visibility);
    }
}
