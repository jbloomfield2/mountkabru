/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.model.Player;
import java.util.Scanner;

/**
 *
 * @author jacob bloomfield
 */
public class StartProgramView {
    String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name :";
        //display banner when class is created
        this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println("\n************************************************************\n" +
                            "*--------------------------Welcome-------------------------*\n" +
                            "*-----------------------------to---------------------------*\n" +
                            "*-------------------------Mount Kabru----------------------*\n" +
                            "*----------------------------------------------------------*\n" +
                            "*------------You must protect the town of Kabru------------*\n" +
                            "*----------from evil monsters in the surrounding-----------*\n" +
                            "*----------lands. To end the onslaught of monsters---------*\n" +
                            "*-----------you must find the mysterious master------------*\n" +
                            "*------------that created them and destroy him.------------*\n" +
                            "*----------------------------------------------------------*\n" +
                            "************************************************************\n"
                          + "                       ,sdPBbs.\n" +
                            "                      ,d$$$$$$$$b.                          \n" +
                            "                     d$P'`Y'`Y'`?$b\n" +
                            "                    d'    `  '  \\ `b\n" +
                            "                   /    |        \\  \\\n" +
                            "                  /    / \\       |   \\                      \n" +
                            "             _,--'        |      \\    |\n" +
                            "           /' _/          \\   |        \\\n" +
                            "        _/' /'             |   \\        `-.__\n" +
                            "    __/'       ,-'    /    |    |     \\      `--...__      \n" +
                            "  /'          /      |    / \\     \\     `-.           `\\\n" +
                            " /                   /   /    \\            \\            `-.");
    }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do{
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))// user wants to quit
                return; // exit the game
            
            //do the requested action and display the next vie
            done=this.doAction(playersName);
            
        } while (!done);
        }
    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid player name:"
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control funtion
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccesful
            System.out.println("\nError creating player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true; // success !
    }
/**
 * Prompt for and get the players name
 * @return the name of the player
 */
    public String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        String value = "";
        
        boolean valid = false; // set flag to invalid value entered
        while(!valid) { // while a vaild name has not been retrieved
            
            //promt for the player's name
            System.out.println(this.promptMessage);
            
            value = keyboard.nextLine(); // get the name from the keyboard
            value = value.trim();
            
            //if the name is invalid (less than one character in length)
            if (value.length() < 1){
                System.out.println("Invalid value - the value can not be blank");
                continue; // and repeat again
            }
            valid = true; //set flag to end repetition
        }
        
        return value; // return the value
    }

    private void displayNextView(Player player) {
        System.out.println("\n============================================="
                           + "\n Welcome to the game " + player.getName()
                           + "\n We hope you have a lot of fun!"
                           + "\n============================================="
                            );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }

}