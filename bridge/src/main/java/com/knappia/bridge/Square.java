package com.knappia.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square implements Shape {
    private Double a;
    private Color color;

    public Square(Double a, Color color) {
        this.a = a;
        this.color = color;
    }

    @Override
    public void info() {
        log.info("This is square, side={}, V={}, Height={}, Color={}", this.a, getVolume(), getHeight(), getColor().getColor());
    }

    @Override
    public Double getHeight() {
        return a;
    }

    @Override
    public Double getVolume() {
        return Math.pow(a,3.0);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
