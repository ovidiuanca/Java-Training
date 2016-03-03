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
 * Time:    1:53 PM
 */
public class CreateHeroPanel extends JPanel {
    private Controller controller;
    JLabel heroNameLabel;
    JTextField heroNameText;
    JLabel heroTypeLabel;
    JComboBox<String> heroTypeCombo;
    JButton createHeroButton = new JButton("Create Hero");
    JButton backButton = new JButton("Back");

    String attHeroName;
    String attHeroType;


    public CreateHeroPanel(Controller controller){
        this.controller = controller;
        heroNameLabel = new JLabel("Hero name:");
        heroTypeLabel = new JLabel("Hero type:");
        heroNameText = new JTextField();
        heroNameText.setColumns(15);
        heroTypeCombo = new JComboBox<String>();
        heroTypeCombo.addItem("Warrior");
        heroTypeCombo.addItem("Hunter");

        add(heroNameLabel);
        add(heroNameText);
        add(heroTypeLabel);
        add(heroTypeCombo);
        add(createHeroButton);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setMode(GameModes.MAIN_MENU);
            }
        });

        createHeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attHeroName = heroNameText.getText();
                attHeroType = heroTypeCombo.getSelectedItem().toString();
                controller.createHero(attHeroName, attHeroType);
                controller.setMode(GameModes.VILLAGE);
                controller.initShops();
            }
        });
    }
}