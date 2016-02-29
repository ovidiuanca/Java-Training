package ro.ovidiucota;

import java.util.Scanner;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/25/16
 * Time:    2:03 PM
 */
public class Menu {
    private void clearConsole() {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
    public int userDigitCommand(){
        int command;
        Scanner scan = new Scanner(System.in);
        System.out.print("Command: ");
        while(true)
        {
            try
            {
                command = scan.nextInt();
                break;
            } catch (Exception exception) {
                System.out.println("Must be an integer");
                scan.next();
            }
        }
        clearConsole();
        return command;
    }

    public String heroNaming(){
        String name;
        clearConsole();
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.next();
        return (name);
    }

    public void printMainMenu(){
        clearConsole();
        System.out.println("#-------MENU-------#");
        System.out.println("| [1] Start game   |");
        System.out.println("| [2] Exit game    |");
        System.out.println("#------------------#");
    }

    public void printStartGameMenu(){
        System.out.println("#----START-GAME----#");
        System.out.println("| [1] Play         |");
        System.out.println("|                  |");
        System.out.println("| [2] Back         |");
        System.out.println("#------------------#");
    }

    public void printPlay(){
        System.out.println("#---CREATE--HERO---#");
        System.out.println("| [1] Knight       |");
        System.out.println("| [2] Mage         |");
        System.out.println("|                  |");
        System.out.println("| [3] Back         |");
        System.out.println("#------------------#");
    }
}
