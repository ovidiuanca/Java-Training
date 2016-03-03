package ovidiucota.view;

import ovidiucota.characters.Hero;
import ovidiucota.controller.Controller;
import ovidiucota.model.GameModes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/3/16
 * Time:    11:15 AM
 */
public class StatsPanel extends JPanel implements Observer{
    JTextArea statsText = new JTextArea();
    JButton backButton = new JButton("Back");
    String liveStats;


    public StatsPanel(Controller controller){
        controller.addObserver(this);
        add(statsText);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setMode(GameModes.VILLAGE);
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String){
            liveStats = (String) arg;
            statsText.setText(liveStats);
        }
    }
}
