package ro.ovidiucota;

import java.util.Scanner;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/25/16
 * Time:    1:55 PM
 */
public class UserInterface {
    Controller controller;

    public void getController(Controller controller){
        this.controller = controller;
    }

    public void printTheVillage(){
        System.out.println("#------The Village-----#");
        System.out.println("|                      |");
        System.out.println("| 1. The Arena         |");
        System.out.println("| 2. Weaponsmith       |");
        System.out.println("| 3. Armory            |");
        System.out.println("| 4. Stats             |");
        System.out.println("| 5. Exit              |");
        System.out.println("|                      |");
        System.out.println("#----------------------#");
    }

    public void printTheArena(){

    }

    public void printWeaponsmith(){

    }

    public void printArmory(){

    }

    public void printStats(){

    }

    public void printGiveCommand(){
        System.out.print("Command: ");
    }

    public int checkForCommand(){
        Scanner scan = new Scanner(System.in);
        int command;
        while (true)
        {
            try {
                printGiveCommand();
                command = scan.nextInt();
                break;
            }
            catch (Exception ex){
                System.out.println("Command must be an integer!");
                scan.next();
            }
        }
        return command;
    }

    public void menuCommand(int command){
        if (command == 1){
            printTheArena();
        }
        else if (command == 2){
            printWeaponsmith();
        }else if (command == 3){
            printArmory();
        }else if (command == 4){
            printStats();
        }
        else if (command == 5){
            exitApp();
        }
        else {
            System.out.println("Wrong command!");
        }
    }

    public void exitApp(){
        System.exit(0);
    }

    public void startUi(){
        printTheVillage();
        checkForCommand();
        exitApp();
    }
}