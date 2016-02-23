package ro.ovidiucota;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/23/16
 * Time:    1:50 PM
 */
public class Character {
    protected String name;
    protected int health;
    protected int level;
    protected int damage;
    protected int armor;
    protected boolean hasWeapon;
    protected boolean hasChest;
    protected boolean hasHelmet;
    protected boolean hasShield;
    Weapon weapon;
    Chest chest;
    Helmet helmet;
    Shield shield;

    protected Character(){
        level = 1;
        health = 50;
        hasWeapon = false;
        hasChest = false;
        hasHelmet = false;
        hasShield = false;
    }

    public String toString(){
        String strName, strHealth, strLevel, strDamage, strArmor, strWeapon, strChest, strHelmet, strShield, strAccesories;
        strName = name;
        strHealth = health + "";
        strLevel = level + "";
        strDamage = damage + "";
        strArmor = armor + "";
        strChest = "No Chest\n";
        strHelmet = "No Helmet\n";
        strShield = "No Shield\n";
        strWeapon = "No Weapon\n";
        if (weapon != null){
            strWeapon = weapon.getType();
        }
        // TO MODIFY !!!!!!!!!!!
        if (hasChest){
            strChest = chest.getType();
        }
        if (hasHelmet){
            strHelmet = helmet.getType();
        }
        if (hasShield){
            strShield = shield.getType();
        }
        strAccesories = strWeapon + strChest + strHelmet + strShield;
        return ("Name:  " + strName + "  Level:  " + strLevel + "   Health: " + strHealth + "   Armor:  " + strArmor +  "   Damage: " + strDamage + strAccesories);
    }
}

