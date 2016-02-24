package ro.ovidiucota;

import java.util.Objects;

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
    protected int id;
    private static int id_count;
    Weapon weapon;
    Chest chest;
    Helmet helmet;
    Shield shield;

    protected Character(){
        id_count++;
        id = id_count;
        level = 1;
        health = 50;
    }

    public String getName(){
        return (name);
    }

    public int getDamage(){
        return (damage);
    }

    public int getHealth(){
        return (health);
    }

    public int getArmor(){
        return (armor);
    }

    public int getLevel(){
        return (level);
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }

    public void setLevel(int level){
        this.level = level;
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
        strWeapon = "\nNo Weapon\n";
        if (weapon != null){
            strWeapon = "\n" + weapon.getType() + " ";
        }
        if (chest != null){
            strChest = chest.getType() + " ";
        }
        if (helmet != null){
            strHelmet = helmet.getType() + " ";
        }
        if (shield != null){
            strShield = shield.getType();
        }
        strAccesories = strWeapon + strChest + strHelmet + strShield;
        return ("Name:  " + strName + "  Level:  " + strLevel + "   Health: " + strHealth + "   Armor:  " + strArmor +  "   Damage: " + strDamage + strAccesories);
    }

    public boolean equals(Object object){
        if (!(object instanceof Character))
            return (false);
        Character character = new Character();
        character = (Character)object;
        if (this.id == character.id)
            return (true);
        else
            return (false);
    }
}

