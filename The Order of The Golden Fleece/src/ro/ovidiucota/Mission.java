package ro.ovidiucota;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/24/16
 * Time:    3:16 PM
 */
public class Mission implements MissionSet {
    public static void playMission1(Player player){
        BattleReport report;
        //Orc grom = new Orc("Grommash");
        Devil devil = new Devil("Diablo");
        report = BattleEvent.Battle(player.hero, devil);
        report.printReport();
    }
}
