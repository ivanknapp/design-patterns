package com.knappia.flyweight;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeaShopTest {

    @Test
    public void testTeaShop(){
        TeaShop teaShop = new TeaShop();
        List<Tea> teaShopMenus = teaShop.getMenus();
        assertNotNull(teaShopMenus);
        assertEquals(6, teaShopMenus.size());
        assertEquals(4, teaShopMenus.stream().map(System::identityHashCode).distinct().count());
    }

}