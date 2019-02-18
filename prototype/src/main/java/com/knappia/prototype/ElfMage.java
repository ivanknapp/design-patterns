package com.knappia.prototype;

public class ElfMage extends Mage {
    private String helpType;

    public ElfMage(String helpType) {
        this.helpType = helpType;
    }

    private ElfMage(ElfMage elfWarrior) {
        this.helpType = elfWarrior.helpType;
    }

    public String getHelpType() {
        return helpType;
    }

    public void setHelpType(String helpType) {
        this.helpType = helpType;
    }

    @Override
    public Mage copy() throws CloneNotSupportedException {
        return new ElfMage(this);
    }

    @Override
    public String toString() {
        return "ElfMage says: " + this.helpType;
    }
}
