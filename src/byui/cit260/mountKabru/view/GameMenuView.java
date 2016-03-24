/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.control.InventoryControl;
import byui.cit260.mountKabru.model.Game;
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
              + "\nQ - Return to previous Menu"
              + "\n----------------------------------------");
    }
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "I":// show sorted inventory list
                showInventory();
                break;
            case "C": //show character info
                showCharacterInfo();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":
                this.showHelp();
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

    private void showCharacterInfo() {
        Game game = MountKabru.getCurrentGame();
        this.console.println("\n================================="
                            + "\n" + game.getPlayer().getName()
                            + "\nLevel " + game.getActor().getPlayerStats().getLevel() + " " + game.getPlayer().getPlayerClass()
                            + "\nAdventurer for: " + game.getDay() + " days"
                            + "\n" + game.getActor().getPlayerStats().getHealth() + "/" + game.getActor().getPlayerStats().getMaxHealth() + " Health"
                            + "\n" + game.getActor().getPlayerStats().getMana() + "/" +game.getActor().getPlayerStats().getMaxMana() + " Mana"
                            + "\n" + game.getActor().getPlayerStats().getAttack() + " Attack power"
                            + "\n" + game.getActor().getPlayerStats().getDefence() + " Defense power"
                            + "\n" + game.getActor().getInventory().getXp() + " experience, " + game.getActor().getInventory().getXpToNextLevel() + " until next level up"
                            +"\nyou have " + game.getActor().getInventory().getShillings() + " shillings"
                            + "\n================================");
    
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

    private void showHelp() {
        HelpMenuView help = new HelpMenuView();
        help.display();
    }


    
}
