package ovidiucota.characters;

import ovidiucota.equipment.Equipment;
import ovidiucota.equipment.Protection.Body;
import ovidiucota.equipment.Weapons.Bow;
import ovidiucota.exceptions.EquipException;


/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    8:07 PM
 */
public class Hunter extends Hero {
    public Hunter(String name){
        super(name);
    }

    @Override
    public void equip(Equipment equipment) throws EquipException {
        if (equipment.getClass().getSimpleName().equals("Body")){
            if (body != null){
                armor -= body.getArmor();
            }
            body = (Body) equipment;
            armor += body.getArmor();
        } else if (equipment.getClass().getSimpleName().equals("Bow")){
            if (weapon != null){
                damage -= weapon.getDamage();
            }
            weapon = (Bow) equipment;
            damage += weapon.getDamage();
        } else {
            throw new EquipException();
        }
    }
}
