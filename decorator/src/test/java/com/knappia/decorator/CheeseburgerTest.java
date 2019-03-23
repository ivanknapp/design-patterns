package com.knappia.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class CheeseburgerTest {

    @Test
    public void test(){
        Burger hamburger = spy(new Hamburger());

        assertEquals(25.0, hamburger.getCost());
        verify(hamburger, times(1)).getCost();

        Burger cheesBurger = new Cheeseburger(hamburger);

        assertEquals(35.0, cheesBurger.getCost());
        verify(hamburger, times(2)).getCost();
        assertEquals("Burger with a ham and ketchup and cheese", cheesBurger.getDescription());
        verify(hamburger, times(1)).getDescription();
    }
}