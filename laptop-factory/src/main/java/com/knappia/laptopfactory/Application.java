package com.knappia.laptopfactory;

import com.knappia.laptopfactory.factory.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    
    public static void main(String[] args) {
        LaptopFactory factory = LaptopFactory.factory(builder -> {
            builder.add(ComputerType.MAC_BOOK, AppleLaptop::new);
            builder.add(ComputerType.PC, AsusPC::new);
            builder.add(ComputerType.MAC, ApplePC::new);
        });

        Computer appleLaptop = factory.create(ComputerType.MAC_BOOK);
        log.info("My computer is {}", appleLaptop.toString());
    }

}
