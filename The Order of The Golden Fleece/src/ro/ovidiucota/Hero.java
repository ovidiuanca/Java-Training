package ro.ovidiucota;

public class Hero extends Character{
    protected Hero(){
    }

    public void equip(Weapon weapon){

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
