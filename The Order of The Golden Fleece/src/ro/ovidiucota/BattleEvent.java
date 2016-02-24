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

    public static BattleReport Battle(Hero hero, Villain villain){
        BattleReport report = new BattleReport();
        while (hero.getHealth() > 0 && villain.getHealth() > 0){
            Atack(hero, villain);
        }
        if (hero.getHealth() <= 0 && villain.getHealth() <= 0)
            report.setDraw(hero, villain);
        else if (hero.getHealth() <= 0){
            report.setWinner(villain);
            report.setLoser(hero);
        } else {
            report.setWinner(hero);
            report.setLoser(villain);
        }
        return (report);
    }
}
