package ovidiucota.characters;

import ovidiucota.equipment.Equipment;
import ovidiucota.equipment.Protection.Body;
import ovidiucota.equipment.Weapons.Weapon;
import ovidiucota.exceptions.EquipException;

import java.lang.*;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    6:53 PM
 */
public abstract class Hero extends Character{
    Weapon  weapon;
    Body    body;

    public Weapon getWeapon() {
        return weapon;
    }

    public Body getBody() {
        return body;
    }

    public Hero(String name){
        super(name);

    }

    public abstract void equip(Equipment equipment) throws EquipException;

    public String toString(){
        String strBody;
        String strWeapon;
        String strClassName = "Class: " + this.getClass().getSimpleName() + " | ";
        String strName = "Name: " + this.getName() + " | ";
        String strLevel = "Level: " + this.getLevel() + " | ";
        String strHealth = "Health: " + this.getHealth() + " | ";
        String strArmor = "Armor: " + this.getArmor() + " | ";
        String strDamage = "Damage: " + this.getDamage() + " | ";
        if (weapon != null)
        {
            strWeapon = "Weapon: " + weapon.toString() + " | ";
        }
        else
            strWeapon = "- | ";
        if (body != null)
        {
            strBody = "Body: " + body.toString() + " | ";
        }
        else
            strBody = "- | ";
        return (strClassName + strName + strLevel + strHealth + strArmor + strDamage + strBody + strWeapon);
    }
}