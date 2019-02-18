package com.knappia.prototype;

public class ElfRanger extends Ranger {
    private String helpType;

    public ElfRanger(String helpType) {
        this.helpType = helpType;
    }

    private ElfRanger(ElfRanger elfWarrior) {
        this.helpType = elfWarrior.helpType;
    }

    public String getHelpType() {
        return helpType;
    }

    public void setHelpType(String helpType) {
        this.helpType = helpType;
    }

    @Override
    public Ranger copy() throws CloneNotSupportedException {
        return new ElfRanger(this);
    }

    @Override
    public String toString() {
        return "ElfRanger says: " + this.helpType;
    }

}
