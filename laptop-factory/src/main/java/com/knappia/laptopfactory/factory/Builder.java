package com.knappia.laptopfactory.factory;

import java.util.function.Supplier;

public interface Builder {
    void add(ComputerType type, Supplier<Computer> supplier);
}
