package ovidiucota.view;

import ovidiucota.controller.Controller;
import ovidiucota.model.GameModes;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    1:45 PM
 */
public class View extends JFrame implements Observer{
    private Controller controller;
    private PanelContainer panelContainer;

    public View(Controller controller){
        this.controller = controller;
        controller.addObserver(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setTitle("Swords and pandas");
        panelContainer = new PanelContainer(controller);
        add(panelContainer);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof GameModes){
            panelContainer.showMode((GameModes) arg);
        }
    }
}
