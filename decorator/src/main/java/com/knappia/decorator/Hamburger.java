package com.knappia.decorator;

public class Hamburger implements Burger {

    @Override
    public Double getCost() {
        return 25.0;
    }

    @Override
    public String getDescription() {
        return "Burger with a ham and ketchup";
    }
}
