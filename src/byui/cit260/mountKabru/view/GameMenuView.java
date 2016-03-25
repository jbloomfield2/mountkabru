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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
              + "\nP - Print inventory list"          
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
            case "P":
        {
            try {
                this.printList();
            } catch (IOException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                return true;
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

    private void printList() throws IOException {
        // prompt for and get the name of the file to save the game in
        this.displayMessage = "\nEnter the file path for file where the list"
                           + " is to be saved";
        String path = this.getInput();
        Inventory inv = InventoryControl.getSortedInventoryList();
        String itemName;
        PrintWriter out = null;
        
        try( PrintWriter fops = new PrintWriter(path)){
            fops.println("------------Inventory List---------------");
            for (Item item : inv.getItems()){
           itemName = item.getItemType();
           fops.println(item.getItemType()+ "\t" +
                              item.getDescription()+ "\t\t" +
                              "quantity: " + item.getQuantity() +
                              "\tvalue: " + item.getValue()+ " shillings");
            
        }
        }
        catch (Exception ex){
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        finally{
                this.console.println("DONE!"); 
            }
        }
    
}
