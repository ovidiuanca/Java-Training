package ovidiucota;

import ovidiucota.controller.Controller;
import ovidiucota.model.Model;
import ovidiucota.view.View;

/**
 * User:    ovidiu
 * Package: RPG
 * Date:    3/1/16
 * Time:    1:44 PM
 */
public class Main {
    public static void main(String[] args){
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);
    }
}
