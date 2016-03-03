package ovidiucota.equipment.Weapons;

import ovidiucota.equipment.Equipment;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    7:03 PM
 */
public abstract class Weapon extends Equipment {
    protected int damage;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {

        return damage;
    }
}
