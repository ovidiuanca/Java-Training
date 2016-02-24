package ro.ovidiucota;

public class Hero extends Character{
    protected Hero(){
    }

    public void equip(Weapon weapon){
        this.weapon = weapon;
        damage += this.weapon.getDamage();
    }

    public void equip(Chest chest){
        this.chest = chest;
        armor += this.chest.getArmor();
    }

    public void equip(Helmet helmet){
        this.helmet = helmet;
        armor += this.helmet.getArmor();
    }

    public void equip(Shield shield){
        this.shield = shield;
        armor += this.shield.getArmor();
    }

}
class Knight extends Hero{
    public Knight(String name){
        this.name = name;
        health = 150;
        damage = 10;
    }
}

class Mage extends Hero{
    public Mage(String name){
        this.name = name;
        health = 75;
        damage = 20;
    }
}