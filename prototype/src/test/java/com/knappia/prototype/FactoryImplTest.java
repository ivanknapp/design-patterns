package com.knappia.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

class FactoryImplTest {

    @Test
    public void testFactory() throws Exception {
        final Mage mage = mock(Mage.class);
        final Warrior warrior = mock(Warrior.class);
        final Ranger ranger = mock(Ranger.class);

        when(mage.copy()).thenThrow(CloneNotSupportedException.class);
        when(warrior.copy()).thenThrow(CloneNotSupportedException.class);
        when(ranger.copy()).thenThrow(CloneNotSupportedException.class);

        final FactoryImpl factory = new FactoryImpl(mage, warrior, ranger);
        assertNull(factory.createMage());
        assertNull(factory.createWarrior());
        assertNull(factory.createRanger());

        verify(mage).copy();
        verify(warrior).copy();
        verify(ranger).copy();

        verifyNoMoreInteractions(mage, ranger, warrior);
    }

}