package com.knappia.prototype;

public abstract class Ranger extends Prototype{
    @Override
    public abstract Ranger copy() throws CloneNotSupportedException;
}
