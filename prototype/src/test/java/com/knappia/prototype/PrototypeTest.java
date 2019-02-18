package com.knappia.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

class PrototypeTest {
    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Warrior elfWarrior = new ElfWarrior("protecting");
        Warrior elfWarriorClone = elfWarrior.copy();

        assertNotSame(elfWarrior, elfWarriorClone);
        assertSame(elfWarrior.getClass(), elfWarriorClone.getClass());
        assertEquals(elfWarrior.toString(), elfWarriorClone.toString());
    }
}