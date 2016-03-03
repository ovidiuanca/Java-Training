package ovidiucota.view;

import ovidiucota.controller.Controller;
import ovidiucota.model.GameModes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/2/16
 * Time:    3:08 PM
 */
public class TheVillagePanel extends JPanel {
    JLabel villageLabel = new JLabel("The Village");
    JButton arenaButton = new JButton("The Arena");
    JButton weaponsmithButton = new JButton("Weaponsmith");
    JButton armoryButton = new JButton("Armory");
    JButton statsButton = new JButton("Stats");
    JButton exitButton = new JButton("Exit game");

    public TheVillagePanel(Controller controller){
        add(villageLabel);
        add(arenaButton);
        add(weaponsmithButton);
        add(armoryButton);
        add(statsButton);
        add(exitButton);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 0;
                result = JOptionPane.showConfirmDialog(null, "Are you sure?","Warning!", result);
                if (result == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        statsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setMode(GameModes.STATS);
                controller.getHeroStats();
            }
        });
    }
}
