package ovidiucota.shops;

import ovidiucota.equipment.Protection.Protection;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/3/16
 * Time:    9:48 AM
 */
public class ArmorProduct {
    Protection protection;
    int gold;

    public ArmorProduct(Protection protection, int gold){
        this.protection = protection;
        this.gold = gold;
    }
}
