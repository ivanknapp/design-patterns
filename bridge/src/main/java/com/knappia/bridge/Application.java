package com.knappia.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    public static void main(String[] args) {
        Color redColor = new RedColor();
        Color greenColor = new GreenColor();

        Shape greenSquare = new Square(3.0, greenColor);
        greenSquare.info();

        Shape redSphere = new Sphere(10.0, redColor);
        redSphere.info();
    }
}
