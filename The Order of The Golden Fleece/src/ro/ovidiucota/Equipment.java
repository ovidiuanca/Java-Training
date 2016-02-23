package ro.ovidiucota;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/23/16
 * Time:    3:43 PM
 */
public class Equipment {
    protected String type;
    public String getType(){
        return (type);
    }
}

class Armor extends Equipment{
    protected int armor;
}

class Chest extends Armor{
    public Chest(){
        type = "Chest";
        armor = 50;
    }
}

class Helmet extends Armor{
    public Helmet(){
        type = "Helmet";
        armor = 25;
    }
}

class Shield extends Armor{
    public Shield(){
        type = "Shield";
        armor = 75;
    }
}

class Weapon extends Equipment{
    protected int damage;
}

class Sword extends Weapon{
    public Sword(){
        type = "Sword";
        damage = 25;
    }
}

class Wand extends Weapon{
    public Wand(){
        type = "Wand";
        damage = 45;
    }
}

class Axe extends Weapon{
    public Axe(){
        type = "Axe";
        damage = 20;
    }
}

