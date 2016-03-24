/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

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
                break;
            case "C": //show character info
                showCharacterInfo();
                break;
            case "R": // back to last menu
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

    private void showCharacterInfo() {
        Game game = MountKabru.getCurrentGame();
        this.console.println("\n================================="
                            + "\n" + game.getPlayer().getName()
                            + "\nLevel " + game.getActor().getPlayerStats().getLevel() + " " + game.getPlayer().getPlayerClass()
                            + "\n" + game.getActor().getPlayerStats().getHealth() + "/" + game.getActor().getPlayerStats().getMaxHealth() + " Health"
                            + "\n" + game.getActor().getPlayerStats().getMana() + "/" +game.getActor().getPlayerStats().getMaxMana() + " Mana"
                            + "\n" + game.getActor().getPlayerStats().getAttack() + " Attack power"
                            + "\n" + game.getActor().getPlayerStats().getDefence() + " Defense power"
                            + "\n" + game.getActor().getInventory().getXp() + " experience, " + game.getActor().getInventory().getXpToNextLevel() + " until next level up"
                            +"\nyou have " + game.getActor().getInventory().getShillings() + " shillings"
                            + "\n================================");
    }
    
}
