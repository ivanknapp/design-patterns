package com.knappia.flyweight;

import java.util.EnumMap;

public class TeaFactory {
    private EnumMap<TeaType, Tea> teaEnumMap;

    public TeaFactory() {
        this.teaEnumMap = new EnumMap<TeaType, Tea>(TeaType.class);
    }

    public Tea createTea(TeaType teaType) {
        Tea tea = teaEnumMap.get(teaType);
        if (tea == null) {
            switch (teaType) {
                case BLACK:
                    tea = new BlackTea();
                    teaEnumMap.put(TeaType.BLACK, tea);
                    break;
                case GREEN:
                    tea = new GreenTea();
                    teaEnumMap.put(TeaType.GREEN, tea);
                    break;
                case EARL_GREY:
                    tea = new EarlGreyTea();
                    teaEnumMap.put(TeaType.EARL_GREY, tea);
                    break;
                case BIG_RED_ROBE:
                    tea = new BigRedRobeTea();
                    teaEnumMap.put(TeaType.BIG_RED_ROBE, tea);
                    break;
                default:
                    break;
            }
        }
        return tea;
    }
}
