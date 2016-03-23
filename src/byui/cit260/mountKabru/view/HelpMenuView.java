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

/**
 *
 * @author jacob bloomfield
 */
class HelpMenuView extends View {

    public HelpMenuView() {
                super("\n"
              + "\n----------------------------------------"
              + "\n| Help Menu                            |"
              + "\n----------------------------------------"
              + "\nG - What is the goal of the game?"
              + "\nT - The town"
              + "\nA - Adventuring"
              + "\nI - Inventory"
              + "\nQ - Go back"
              + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "G": // Goal of game
                this.console.println("Goal of game info");
                break;
            case "T": // the town
                this.console.println("The town info");
                break;
            case "A": // Adventuring
                this.console.println("Adventuring info");
                break;
            case "I"://inventory
                this.displayInventoryList();
                break;
            case "Q"://back to main menu
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    void displayPitHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayInventoryList() {
        Inventory inv = InventoryControl.getSortedInventoryList();
        String itemName,itemDesc;
        this.console.println("items available");
        this.console.println("type" + "\t\t\t" + "description" + "\t\t" + "value");
       
       for (Item item : inv.getItems()){
           itemName = item.getItemType();
           this.console.println(item.getItemType()+ "\t" +
                              item.getDescription()+ "\t\t" +
                              item.getValue());
                              
                                      }
    }

    
}
