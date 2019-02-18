package com.knappia.prototype;

public abstract class Warrior extends Prototype {
    @Override
    public abstract Warrior copy() throws CloneNotSupportedException;
}
