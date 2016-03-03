package ovidiucota.equipment.Protection;

import ovidiucota.equipment.Equipment;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    7:15 PM
 */
public abstract class Protection extends Equipment {
    int armor;

    public Protection(String name, int armor){
        this.name = name;
        this.armor = armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {

        return armor;
    }
}
