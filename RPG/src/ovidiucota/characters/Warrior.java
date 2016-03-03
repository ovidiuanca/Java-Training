package ovidiucota.characters;

import ovidiucota.equipment.Equipment;
import ovidiucota.equipment.Protection.Body;
import ovidiucota.equipment.Weapons.Sword;
import ovidiucota.exceptions.EquipException;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    7:36 PM
 */
public class Warrior extends Hero {
    public Warrior(String name){
        super(name);
    }

    @Override
    public void equip(Equipment equipment) throws EquipException{
        if (equipment.getClass().getSimpleName().equals("Body")){
            if (body != null){
                armor -= body.getArmor();
            }
            body = (Body)equipment;
            armor += body.getArmor();
        } else if (equipment.getClass().getSimpleName().equals("Sword")){
            if (weapon != null){
                damage -= weapon.getDamage();
            }
            weapon = (Sword)equipment;
            System.out.println();
            damage += weapon.getDamage();
        } else {
            throw new EquipException();
        }
    }
}
