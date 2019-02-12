package com.knappia.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MobilePhoneTest {
    @Test
    public void testMissingOSorProc() {
        assertThrows(IllegalArgumentException.class, () -> new MobilePhone.MobilePhoneBuilder(null, null).build());
        assertThrows(IllegalArgumentException.class, () -> new MobilePhone.MobilePhoneBuilder(OperationSystem.ANDROID, null).build());
        assertThrows(IllegalArgumentException.class, () -> new MobilePhone.MobilePhoneBuilder(null, "AMD").build());
    }

    @Test
    public void testMobileNotNullFields() {
        final String processor = "AMD";

        MobilePhone mobile = new MobilePhone.MobilePhoneBuilder(OperationSystem.ANDROID, processor)
                .withBattery(null)
                .withMemory(MemorySizeType.LARGE)
                .build();

        assertNotNull(mobile);
        assertNotNull(mobile.getProcessor());
        assertNotNull(mobile.getOperationSystem());
        assertNull(mobile.getBattery());
        assertEquals(MemorySizeType.LARGE, mobile.getMemory());
        assertEquals(processor, mobile.getProcessor());
    }

}
