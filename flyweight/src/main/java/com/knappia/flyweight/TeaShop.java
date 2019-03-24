package com.knappia.flyweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeaShop {
    private List<Tea> menus;

    public TeaShop() {
        menus = new ArrayList<>();
        fillMenus();
    }

    private void fillMenus() {
        final TeaFactory teaFactory = new TeaFactory();
        menus.add(teaFactory.createTea(TeaType.BLACK));
        menus.add(teaFactory.createTea(TeaType.BLACK));
        menus.add(teaFactory.createTea(TeaType.GREEN));
        menus.add(teaFactory.createTea(TeaType.BIG_RED_ROBE));
        menus.add(teaFactory.createTea(TeaType.EARL_GREY));
        menus.add(teaFactory.createTea(TeaType.GREEN));
    }

    public void showMenus() {
        menus.forEach(Tea::getDescriptions);
    }

    public List<Tea> getMenus() {
        return Collections.unmodifiableList(menus);
    }
}
