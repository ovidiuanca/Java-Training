package ro.ovidiucota;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/27/16
 * Time:    11:56 AM
 */
public class Controller {
    Model model;
    MainForm mainForm;
    StartGameForm startGameForm;
    SelectHeroForm selectHeroForm;
    CreateHeroForm createHeroForm;
    UserInterface userInterface;
    Hero myHero;
    Player player;

    public Controller(MainForm mainForm, StartGameForm startGameForm, SelectHeroForm selectHeroForm, CreateHeroForm createHeroForm, UserInterface userInterface){
        this.mainForm = mainForm;
        this.startGameForm = startGameForm;
        this.selectHeroForm = selectHeroForm;
        this.createHeroForm = createHeroForm;
        this.userInterface = userInterface;
        mainForm.getController(this);
        startGameForm.getController(this);
        createHeroForm.getController(this);
        selectHeroForm.getController(this);
        userInterface.getController(this);
    }
    public void sendHero(Hero hero){
        myHero = hero;
    }
}