package com.knappia.bridge;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public abstract class ShapeTest {

    protected final void testShapeMethods(final Shape shape){
        assertNotNull(shape);
        final Color color = shape.getColor();
        assertNotNull(color);

        shape.info();
        verify(color).getColor();
        verifyNoMoreInteractions(color);
    }
}
