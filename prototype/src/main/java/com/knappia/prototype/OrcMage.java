package com.knappia.prototype;

public class OrcMage extends Mage {

    private String weapon;

    public OrcMage(String weapon) {
        this.weapon = weapon;
    }

    private OrcMage(OrcMage orcWarrior){
        this.weapon = orcWarrior.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public Mage copy() throws CloneNotSupportedException {
        return new OrcMage(this);
    }

    @Override
    public String toString() {
        return "OrcMage says: " + this.weapon;
    }

}
