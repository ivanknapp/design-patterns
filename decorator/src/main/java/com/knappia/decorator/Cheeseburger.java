package com.knappia.decorator;

public class Cheeseburger implements Burger {

    private Burger burger;

    public Cheeseburger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public Double getCost() {
        return this.burger.getCost() + 10.0;
    }

    @Override
    public String getDescription() {
        return this.burger.getDescription() + " and cheese";
    }
}
