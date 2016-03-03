package ovidiucota.view;

import ovidiucota.controller.Controller;
import ovidiucota.model.GameModes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    3:31 PM
 */
public class MainMenuPanel extends JPanel{
    JButton createHero = new JButton("Create Hero");
    JButton exit = new JButton("Exit");

    public MainMenuPanel(Controller controller){
        add(createHero);
        add(exit);

        createHero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setMode(GameModes.CREATE_HERO);
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
