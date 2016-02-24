/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class MainMenuView {
    private String menu;
    private boolean promptMessage;
    
    public MainMenuView(){
        this.menu = "\n"
              + "\n----------------------------------------"
              + "\n| Main Menu                            |"
              + "\n----------------------------------------"
              + "\nN - Start new game"
              + "\nG - Get and Start saved game"
              + "\nH - Get help on how to play the game"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n----------------------------------------";
    
}
    
    public void displayMainMenuView() {
        
        boolean done= false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
        }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        String value = "";
        
        boolean valid = false; // set flag to invalid value entered
        while(!valid) { // while a vaild name has not been retrieved
            
            //promt for menu choice
            System.out.println(this.menu);
            
            value = keyboard.nextLine(); // get the choice from the keyboard
            value = value.trim();
            
            //if the name is invalid (less than one character in length)
            if (value.length() < 1){
                System.out.println("\nInvalid value - the value can not be blank");
                continue; // and repeat again
            }
            valid = true; //set flag to end repetition
        }
        
        return value; // return the value
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // display the help menu
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(mountkabru.MountKabru.getPlayer());
        
        //proceed to character creation
        CharacterCreationView charCreate = new CharacterCreationView();
        charCreate.display();
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
