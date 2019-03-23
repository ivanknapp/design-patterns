package com.knappia.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Burger hamburger = new Hamburger();
        log.info("Description {}, cost {}", hamburger.getDescription(), hamburger.getCost());

        Burger cheeseBurger = new Cheeseburger(hamburger);
        log.info("Description {}, cost {}", cheeseBurger.getDescription(), cheeseBurger.getCost());
    }
}
