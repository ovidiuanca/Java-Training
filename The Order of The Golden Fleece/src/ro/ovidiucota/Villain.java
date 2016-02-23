package ro.ovidiucota;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/23/16
 * Time:    1:56 PM
 */
public class Villain extends Character {
    protected Villain(){
    }
}

class Devil extends Villain{
    public Devil(String name){
        this.name = name;
        health = 80;
        damage = 10;
    }
}

class Orc extends Villain{
    public Orc(String name){
        this.name = name;
        health = 150;
        damage = 5;
    }
}
