package com.knappia.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Sphere implements Shape {
    private Double r;
    private Color color;

    public Sphere(Double r, Color color) {
        this.r = r;
        this.color = color;
    }

    @Override
    public void info() {
        log.info("This is sphere, radius={}, V={}, Height={}, Color={}", this.r, getVolume(), getHeight(), getColor().getColor());
    }

    @Override
    public Double getHeight() {
        return 2.0* r;
    }

    @Override
    public Double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.r, 3);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
