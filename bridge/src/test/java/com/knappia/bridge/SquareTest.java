package com.knappia.bridge;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class SquareTest extends ShapeTest {

    @Test
    public void squareTest(){
        final Square square = spy(new Square(3.0, mock(RedColor.class)));
        testShapeMethods(square);
    }
}
