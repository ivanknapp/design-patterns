package com.knappia.prototype;

public class OrcWarrior extends Warrior {

    private String weapon;

    public OrcWarrior(String weapon) {
        this.weapon = weapon;
    }

    private OrcWarrior(OrcWarrior orcWarrior){
        this.weapon = orcWarrior.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public Warrior copy() throws CloneNotSupportedException {
        return new OrcWarrior(this);
    }

    @Override
    public String toString() {
        return "OrcWarrior says: " + this.weapon;
    }

}
