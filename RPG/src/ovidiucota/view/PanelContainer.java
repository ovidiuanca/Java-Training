package ovidiucota.view;

import ovidiucota.controller.Controller;
import ovidiucota.model.GameModes;

import javax.swing.*;
import java.awt.*;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    2:01 PM
 */
public class PanelContainer extends JPanel{

    private CardLayout cardLayout;
    private MainMenuPanel   mainMenuPanel;
    private CreateHeroPanel createHeroPanel;
    private TheVillagePanel theVillagePanel;
    //private TheArenaPanel theArenaPanel;
    //private WeaponsmithPanel weaponsmithPanel;
    //private ArmoryPanel armoryPanel;
    private StatsPanel statsPanel;

    public PanelContainer(Controller controller){
        mainMenuPanel = new MainMenuPanel(controller);
        createHeroPanel = new CreateHeroPanel(controller);
        theVillagePanel = new TheVillagePanel(controller);
        statsPanel = new StatsPanel(controller);

        cardLayout = new CardLayout();
        setLayout(cardLayout);

        add(mainMenuPanel, GameModes.MAIN_MENU.toString());
        add(createHeroPanel, GameModes.CREATE_HERO.toString());
        add(theVillagePanel, GameModes.VILLAGE.toString());
        add(statsPanel, GameModes.STATS.toString());
        cardLayout.show(this, GameModes.MAIN_MENU.toString());
    }

    public void showMode(GameModes mode){
        cardLayout.show(this, mode.toString());
    }
}
