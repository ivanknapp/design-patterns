package com.knappia.laptopfactory.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface LaptopFactory {
    Computer create(ComputerType type);

    static LaptopFactory factory(Consumer<Builder> consumer) {
        Map<ComputerType, Supplier<Computer>> map = new HashMap<>();
        consumer.accept(map::put);
        return type -> map.get(type).get();
    }
}
