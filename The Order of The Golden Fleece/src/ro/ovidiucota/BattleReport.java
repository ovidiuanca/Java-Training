package ro.ovidiucota;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/24/16
 * Time:    3:27 PM
 */
public class BattleReport {
    protected Character winner;
    protected Character loser;
    private boolean draw = false;
    private String report;

    public void setWinner(Character winner){
        this.winner = winner;
    }

    public void setLoser(Character loser){
        this.loser = loser;
    }

    public void setDraw(Character winner, Character loser){
        draw = true;
        this.winner = winner;
        this.loser = loser;
    }

    public String toString(){
        report = "--------------BATTLE REPORT--------------\n";
        if (!draw) {
            report += "\t\t\t\tWinner\t\t\tLoser\n";
        }
        else {
            report += "\t\t\t\tDRAW\n";
        }
        report += "Name:\t\t\t" + winner.getName() + "\t\t\t" + loser.getName() + "\n";
        report +="Level\t\t\t" + winner.getLevel() + "\t\t\t\t" + loser.getLevel() + "\n";
        report += "Health:\t\t\t" + winner.getHealth() + "\t\t\t\t" + loser.getHealth() + "\n";
        report += "Armor:\t\t\t" + winner.getArmor() + "\t\t\t\t" + loser.getArmor() + "\n";
        report += "-----------------------------------------";
        return (report);
    }

    public void printReport(){
        System.out.print(toString());
    }
}
