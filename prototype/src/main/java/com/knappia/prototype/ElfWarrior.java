package com.knappia.prototype;

public class ElfWarrior extends Warrior {
    private String helpType;

    public ElfWarrior(String helpType) {
        this.helpType = helpType;
    }

    private ElfWarrior(ElfWarrior elfWarrior) {
        this.helpType = elfWarrior.helpType;
    }

    public String getHelpType() {
        return helpType;
    }

    public void setHelpType(String helpType) {
        this.helpType = helpType;
    }

    @Override
    public Warrior copy() throws CloneNotSupportedException {
        return new ElfWarrior(this);
    }

    @Override
    public String toString() {
        return "ElfWarrior says: " + this.helpType;
    }

}
