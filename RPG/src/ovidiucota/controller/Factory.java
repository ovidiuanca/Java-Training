package ovidiucota.controller;

import ovidiucota.characters.Hero;
import ovidiucota.equipment.Protection.Body;
import ovidiucota.equipment.Weapons.Bow;
import ovidiucota.equipment.Weapons.Sword;
import ovidiucota.shops.ArmorProduct;
import ovidiucota.shops.WeaponProduct;

import java.util.ArrayList;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    6:42 PM
 */
public class Factory {
    private static Factory ourInstance = new Factory();

    public static Factory getInstance() {
        return ourInstance;
    }

    private Factory() {
    }

    public Hero createHero(String heroName, String heroType) throws NoClassDefFoundError{
        Hero h = null;
        try {
            h = (Hero) Class.forName("ovidiucota.characters." + heroType).getConstructor(new Class[]{String.class}).newInstance(heroName);
        }
        catch (NoClassDefFoundError e){
            e.printStackTrace();
            System.out.print("No such class");
        }
        catch (Exception e){
            System.out.println(h);
            e.printStackTrace();
            System.out.print("Another error");
        }
        return h;
    }

    public ArrayList<WeaponProduct> initWeaponsmith(){
        ArrayList<WeaponProduct> weaponsmith = new ArrayList<WeaponProduct>();
        WeaponProduct wp;

        // BOWS
        Bow glaivezooka = new Bow("Glaivezooka", 25);
        Bow longbow = new Bow("Longbow", 40);

        // SWORDS
        Sword longsword = new Sword("Longsword", 20);
        Sword ashbringer = new Sword("Ashbringer", 45);

        wp = new WeaponProduct(glaivezooka, 100);
        weaponsmith.add(wp);
        wp = new WeaponProduct(longsword, 100);
        weaponsmith.add(wp);
        wp = new WeaponProduct(longbow, 200);
        weaponsmith.add(wp);
        wp = new WeaponProduct(ashbringer, 300);
        weaponsmith.add(wp);
        return weaponsmith;
    }

    public ArrayList<ArmorProduct> initArmory(){
        ArrayList<ArmorProduct> armory = new ArrayList<ArmorProduct>();
        ArmorProduct ap;

        //BODIES
        Body fireArmor = new Body("Fire Armor", 50);
        Body frozenTunic = new Body("Frozen Tunic", 100);
        Body elementalArmor = new Body("Elemental Armor", 190);
        Body crepuscularArmor = new Body ("Crepuscular Armor", 300);

        ap = new ArmorProduct(fireArmor, 100);
        armory.add(ap);
        ap = new ArmorProduct(frozenTunic, 250);
        armory.add(ap);
        ap = new ArmorProduct(elementalArmor, 350);
        armory.add(ap);
        ap = new ArmorProduct(crepuscularArmor, 500);
        armory.add(ap);

        return armory;
    }
}
