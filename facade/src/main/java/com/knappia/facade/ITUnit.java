package com.knappia.facade;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public abstract class ITUnit {
    public abstract String getName();

    public abstract void doWork();

    public void action(Action... actions) {
        Arrays.asList(actions).forEach(action -> {
            switch (action) {
                case WAKE_UP:
                    log.info("{} woke up, drank coffee and wants to go to work", getName());
                    break;
                case GO_TO_WORK:
                    log.info("{} is walking to work", getName());
                    break;
                case WORK:
                    doWork();
                    break;
                case LUNCH:
                    log.info("{} ate nutritious pasta", getName());
                    break;
                case GO_TO_HOME:
                    log.info("{} is walking to home", getName());
                    break;
                case GO_TO_SLEEP:
                    log.info("{} sleeps on the way home", getName());
                    break;
                default:
                    throw new IllegalStateException();
            }
        });
    }

    public enum Action {
        WAKE_UP, GO_TO_WORK, WORK, GO_TO_HOME, LUNCH, GO_TO_SLEEP
    }
}
