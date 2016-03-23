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
public class StartProgramView extends View {


    public StartProgramView() {
        super("\nPlease enter your name :");
        //display banner when class is created
        this.displayBanner();
        
    }

    private void displayBanner() {
        this.console.println("\n************************************************************\n" +
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

    @Override
    public boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            this.console.println("\nInvalid player name:"
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control funtion
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccesful
            this.console.println("\nError creating player.");
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
    

    private void displayNextView(Player player) {
        this.console.println("\n============================================="
                           + "\n Welcome to the game " + player.getName()
                           + "\n We hope you have a lot of fun!"
                           + "\n============================================="
                            );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();
    }

}