package ro.ovidiucota;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/23/16
 * Time:    9:16 PM
 */
public class BattleEvent {
    public static void Atack(Hero hero, Villain villain){
        // Wounds for the hero
        if (hero.getArmor() == 0)
            hero.setHealth(hero.getHealth() - villain.getDamage());
        else {
            hero.setArmor(hero.getArmor() - villain.getDamage());
            if (hero.getArmor() < 0){
                hero.setHealth(hero.getHealth() + hero.getArmor());
                hero.setArmor(0);
            }
        }
        // Wounds for the villain
        if (villain.getArmor() == 0)
            villain.setHealth(villain.getHealth() - hero.getDamage());
        else {
            villain.setArmor(villain.getArmor() - hero.getDamage());
            if (villain.getArmor() < 0){
                villain.setHealth(villain.getHealth() + villain.getArmor());
                villain.setArmor(0);
            }
        }
    }
}
