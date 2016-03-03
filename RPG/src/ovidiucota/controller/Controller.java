package ovidiucota.controller;

import ovidiucota.model.Model;
import ovidiucota.model.GameModes;

import java.util.Observer;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    1:44 PM
 */
public class Controller {
    private Model model;
    private Factory factory;

    public Controller(Model model){
        this.model = model;
        factory = Factory.getInstance();
    }

    public void addObserver(Observer view){
        model.addObserver(view);
    }

    public void setMode(GameModes mode){
        model.setMode(mode);
    }

    public void createHero(String heroName, String heroType){
        model.createHero(factory.createHero(heroName, heroType));
    }

    public void initShops(){
        model.initWeaponsmith(factory.initWeaponsmith());
        model.initArmory(factory.initArmory());
    }

    public void getHeroStats(){
        model.sendHeroStats();
    }
}
