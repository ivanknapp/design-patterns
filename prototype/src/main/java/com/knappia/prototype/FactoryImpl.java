package com.knappia.prototype;

public class FactoryImpl implements Factory {

    private Mage mage;
    private Warrior warrior;
    private Ranger ranger;

    public FactoryImpl(Mage mage, Warrior warrior, Ranger ranger) {
        this.mage = mage;
        this.warrior = warrior;
        this.ranger = ranger;
    }

    @Override
    public Mage createMage() {
        try {
            return mage.copy();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Warrior createWarrior() {
        try {
            return warrior.copy();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Ranger createRanger() {
        try {
            return ranger.copy();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
