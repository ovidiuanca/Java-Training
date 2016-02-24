package ro.ovidiucota;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/23/16
 * Time:    1:39 PM
 */
public class Main {
    public static void main(String[] args){
        // Characters
        Knight arthas = new Knight("Arthas");
        //Orc grom = new Orc("Grommash");
        //Mage jaina = new Mage("Jaina");
        //Devil devil = new Devil("Diablo");

        // Weapons
        //Wand wand = new Wand();
        //Axe axe = new Axe();
        Sword sword = new Sword();

        //Armor
        Chest chest = new Chest();
        Helmet helmet = new Helmet();
        Shield shield = new Shield();

        // Equiping items
        arthas.equip(sword);
        arthas.equip(chest);
        arthas.equip(helmet);
        arthas.equip(shield);
        System.out.println(arthas.toString());

        //Two characters atacking
        //BattleEvent.Atack(arthas, grom);

        //System.out.println(arthas.toString());
        //System.out.println(devil.toString());

        //Player comes in
        Player player = new Player("Ovidiu", arthas);
        Mission.playMission1(player);
    }
}
