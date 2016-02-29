package ro.ovidiucota;

import javax.jws.soap.SOAPBinding;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/25/16
 * Time:    1:56 PM
 */
public class Game {
    static void startGame(){
        Player myPlayer;

        //UserInterface ui = new UserInterface();
        MainForm mainForm = new MainForm();
        StartGameForm startGameForm = new StartGameForm();
        SelectHeroForm selectHeroForm = new SelectHeroForm();
        CreateHeroForm createHeroForm = new CreateHeroForm();
        UserInterface userInterface = new UserInterface();
        Model model = new Model();
        Controller controller = new Controller(mainForm, startGameForm, selectHeroForm, createHeroForm, userInterface);
        mainForm.setVisible(true);
    }
}
