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
    Weapon weapon;
    Chest chest;
    Helmet helmet;
    Shield shield;

    protected Character(){
        level = 1;
        health = 50;
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
        // TO MODIFY !!!!!!!!!!!
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
}

