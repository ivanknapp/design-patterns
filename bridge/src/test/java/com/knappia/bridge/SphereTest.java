package com.knappia.bridge;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class SphereTest extends ShapeTest {

    @Test
    public void testSphere(){
        final Sphere sphere = spy(new Sphere(3.0, mock(RedColor.class)));
        testShapeMethods(sphere);
    }
}
