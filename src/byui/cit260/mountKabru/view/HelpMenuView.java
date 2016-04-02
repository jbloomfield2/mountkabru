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
              + "\nC - character class information"
              + "\nM - Blacksmith"
              + "\nP - The Pit"
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
                this.console.println("The goal of the game is to locate the mysterious master who has created all the monsters."
                        + "You will be able to find him once you have grown strong enough.");
                break;
                
            case "T": // the town
                this.console.println("The town is the main hub of the world. from the town you can head out in search of adventure or "
                        + "visit the blacksmith to upgrade your gear, train at the pit, or visit the tavern to rest and accept quests");
                break;
                
            case "C":
                this.console.println("There are 3 classes available. The mageis skilled in magic and uses the fireball and lightning abilities."
                        + " the paladin is a skilled warrior able to use utility magic like healing and intimidating enemies. the warrior is skilled in"
                        + " melee combat and can use slash and spiral cut.");
                break;
                
            case "M":
                this.console.println("The blacksmith is where you can upgrade your weapons and armor. The cost starts out low but "
                        + "will gradually increase after each upgrade");
                break;
                
            case "P":
                this.console.println("The pit is where you can train and improve your character's attributes. You may train and improve 3 stats every time you level up."
                        + "be sure to use it each level, because the amount of training you can do does not add up");
                break;
                
            case "A": // Adventuring
                this.console.println("Choose to head out to a region, and search for a monster. There is a small chance you won't find any monsters."
                        + " be careful when you battle, if your health reaches 0, you will lose all of your shillings and experience for the current level."
                        + "Available abilities will depend on the player's class.");
                break;
                
            case "I"://inventory
                this.displayInventoryList();
                break;
                
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
