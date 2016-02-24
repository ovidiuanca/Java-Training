package ro.ovidiucota;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/24/16
 * Time:    3:10 PM
 */
public class Player {
    private String playerName;
    public Hero hero;

    public Player(String name, Hero hero){
        playerName = name;
        this.hero = hero;
    }
}
