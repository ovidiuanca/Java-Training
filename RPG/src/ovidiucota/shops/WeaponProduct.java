package ovidiucota.shops;

import ovidiucota.equipment.Weapons.Weapon;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/3/16
 * Time:    9:48 AM
 */
public class WeaponProduct {
    Weapon weapon;
    int gold;

    public WeaponProduct(Weapon weapon, int gold){
        this.weapon = weapon;
        this.gold = gold;
    }
}
