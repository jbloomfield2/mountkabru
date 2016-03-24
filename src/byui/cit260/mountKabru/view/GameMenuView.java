/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.control.InventoryControl;
import byui.cit260.mountKabru.model.Inventory;
import byui.cit260.mountKabru.model.Item;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
public class GameMenuView extends View{
 
    public GameMenuView() {
                super("\n"
              + "\n----------------------------------------"
              + " \nGame menu"
              + "\n----------------------------------------"
              + "\nI - view inventory"
              + "\nC - View character sheet"
              + "\nS - Save game"
              + "\nH - View help menu"
              + "\nQ - Quit game(unsaved game will be lost)"
              + "\nR - Return to previous Menu"
              + "\n----------------------------------------");
    }
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "I":// show sorted inventory list
                showInventory();
            case "R": // back to last menu
                return true;
            case "S":
                this.saveGame();
                break;
        }

   
    return false;
    }

    private void showInventory() {
        Inventory temp = new Inventory();
        String itemName;
        temp = InventoryControl.getSortedInventoryList();
        
        for (Item item : temp.getItems()){
           itemName = item.getItemType();
          this.console.println(item.getItemType()+ "\t" +
                              item.getDescription()+ "\t\t" +
                              "quantity: " + item.getQuantity() +
                              "\tvalue: " + item.getValue()+ " shillings");
                              
        }
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
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }
    
}
