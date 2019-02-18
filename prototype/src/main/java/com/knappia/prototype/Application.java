package com.knappia.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    public static void main(String[] args) {
        Factory factory;
        Mage mage;
        Warrior warrior;
        Ranger ranger;

        factory = new FactoryImpl(new ElfMage("baffs"), new ElfWarrior("dance"), new ElfRanger("eagle eye"));
        mage = factory.createMage();
        warrior = factory.createWarrior();
        ranger = factory.createRanger();
        log.info(mage.toString());
        log.info(warrior.toString());
        log.info(ranger.toString());

        factory = new FactoryImpl(new OrcMage("blunt"), new OrcWarrior("axe"), new OrcRanger("big bow"));

        mage = factory.createMage();
        warrior = factory.createWarrior();
        ranger = factory.createRanger();
        log.info(mage.toString());
        log.info(warrior.toString());
        log.info(ranger.toString());
    }
}
