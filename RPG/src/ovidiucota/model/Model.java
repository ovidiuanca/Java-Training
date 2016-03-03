package ovidiucota.model;

import ovidiucota.characters.Hero;
import ovidiucota.shops.ArmorProduct;
import ovidiucota.shops.WeaponProduct;

import java.util.ArrayList;
import java.util.Observable;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    1:44 PM
 */
public class Model extends Observable {
    private Hero myHero;
    private ArrayList<WeaponProduct> weaponsmith;
    private ArrayList<ArmorProduct> armory;
    private String text = new String("");

    public void setMode(GameModes mode){
        setChanged();
        notifyObservers(mode);
    }

    public void createHero(Hero hero){
        myHero = hero;
    }

    public void initWeaponsmith(ArrayList<WeaponProduct> weaponsmith){
        this.weaponsmith = weaponsmith;
    }

    public void initArmory(ArrayList<ArmorProduct> armory){
        this.armory = armory;
    }

    public void sendHeroStats(){
        text = "Name: " + myHero.getName() + "\n";
        text += "Class: " + myHero.getClass().getSimpleName() + "\n";
        text += "Level: " + myHero.getLevel() + "\n";
        text += "Damage: " + myHero.getDamage() + "\n";
        text += "Health: " + myHero.getHealth() + "\n";
        text += "Armor: " + myHero.getArmor() + "\n";
        text += "Weapon: " + myHero.getWeapon() + "\n";
        text += "Body: " + myHero.getBody();
        setChanged();
        notifyObservers(text);
    }
}
