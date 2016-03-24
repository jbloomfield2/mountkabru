/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import mountkabru.MountKabru;

/**
 *
 * @author Andrew
 */
public class MainMenuView extends View {
    
    
    public MainMenuView(){
        super("\n"
              + "\n----------------------------------------"
              + "\n| Main Menu                            |"
              + "\n----------------------------------------"
              + "\nN - Start new game"
              + "\nG - Get and Start saved game"
              + "\nH - Get help on how to play the game"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n----------------------------------------");
}
    @Override
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
                this.console.println("\n*** Invalid selection *** Try again");
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
        
        //prompt for and get the name of the file to save the game in
         this.displayMessage = "\nEnter the file path for file where the game"
                           + " is to be savaed";
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
           ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.displayMessage = "\nEnter the file path for file where the game"
                           + " is to be savaed";
        String filePath = this.getInput();
        
        try {
            // save the game to the speciried file
            GameControl.saveGame(MountKabru.getCurrentGame(), filePath);
        } catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
}
