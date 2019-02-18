package com.knappia.prototype;

public class OrcRanger extends Ranger {

    private String weapon;

    public OrcRanger(String weapon) {
        this.weapon = weapon;
    }

    private OrcRanger(OrcRanger orcWarrior){
        this.weapon = orcWarrior.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public Ranger copy() throws CloneNotSupportedException {
        return new OrcRanger(this);
    }

    @Override
    public String toString() {
        return "OrcRanger says: " + this.weapon;
    }

}
