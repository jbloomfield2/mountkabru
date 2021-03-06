/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.exceptions.InventoryControlException;
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.Inventory;
import byui.cit260.mountKabru.model.Item;
import byui.cit260.mountKabru.model.ItemList;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
public class InventoryControl {
   static Game game = MountKabru.getCurrentGame();
    public static Inventory createInventory(){//initialize inventory with starting items
        
        Inventory inv = new Inventory();
        for (ItemList items: ItemList.values()){
            Item temp = new Item(items);
            inv.getItems().add(temp);
        }
        inv.getItems().get(0).setQuantity(1);
        inv.getItems().get(2).setQuantity(1);
        inv.getItems().get(1).setQuantity(0);
        inv.setShillings(50);
        inv.setXp(0);
        inv.setXpToNextLevel(250);

        
        
        
            
        return inv;
        }

    public static Inventory getSortedInventoryList() {
        Game currentGame = MountKabru.getCurrentGame();
        Inventory sorted = new Inventory();
        if (currentGame == null){//check if game is started yet
            sorted = createInventory();
            sorted = doInventorySort(sorted);
            return sorted;//if game is not started initialize a new inventory for the help screen
        }
        sorted = doInventorySort(currentGame.getActor().getInventory());
        return sorted;
    }
    
    public static Inventory doInventorySort(Inventory sortMe){//bubblesort implementation
        int n = sortMe.getItems().size();
        int k;
        for (int m = n; m > 0;m--){
            for (int i = 0; i < n - 1;i++){
                k = i+1;
                if (sortMe.getItems().get(k).getQuantity() > sortMe.getItems().get(i).getQuantity()){//compare 2 item quantities
                    Item temp;//if one is greater swap it toward the top
                    temp = sortMe.getItems().get(k);
                    sortMe.getItems().set(k, sortMe.getItems().get(i));
                    sortMe.getItems().set(i, temp);
                    
                }
                    
            }
        }
        
        return sortMe;
    }
    
    public static void addPotionToInv() throws InventoryControlException { 
        
                Inventory inv = game.getActor().getInventory();
                        
                    if (inv.getShillings() < 50){
                        throw new InventoryControlException("\nYou only have "
                                                            + inv.getShillings() + ". Come back when you have enough.");
                    }
                               
                    if (inv.getShillings() > 50){
                        for(Item i : game.getActor().getInventory().getItems()){
                            if (i.getItemType() == "Health potion\t"){
                               i.setQuantity(i.getQuantity()+1);
                            }
                            }
                    }
        }

    public static void addManaPotionToInv() throws InventoryControlException{
        Inventory inv = game.getActor().getInventory();
                        
                    if (inv.getShillings() < 50){
                        throw new InventoryControlException("\nYou only have "
                                                            + inv.getShillings() + ". Come back when you have enough.");
                    }
                               
                    if (inv.getShillings() > 50){
                        for(Item i : game.getActor().getInventory().getItems()){
                            if (i.getItemType() == "Mana potion\t"){
                               i.setQuantity(i.getQuantity()+1);
                            }
                            }
                    }
    }

    public void useHealthPot() throws InventoryControlException {
        double hp;
       for(Item i : game.getActor().getInventory().getItems()){
           if (i.getItemType() == "Health potion\t"){
               if (i.getQuantity()>0){
                   hp = game.getActor().getPlayerStats().getHealth();
                   hp +=10;
                   if(hp > game.getActor().getPlayerStats().getMaxHealth())
                       hp = game.getActor().getPlayerStats().getMaxHealth();
                   game.getActor().getPlayerStats().setHealth(hp);
                   i.setQuantity(i.getQuantity()-1);
               }
               else{
                   throw new InventoryControlException("you don't have any of that item");
               }
                   
                   
           }
       }
    }

    public void useGHealthPot () throws InventoryControlException{
         double hp;
       for(Item i : game.getActor().getInventory().getItems()){
           if (i.getItemType() == "Greater Health potion"){
               if (i.getQuantity()>0){
                   hp = game.getActor().getPlayerStats().getHealth();
                   hp +=25;
                   if(hp > game.getActor().getPlayerStats().getMaxHealth())
                       hp = game.getActor().getPlayerStats().getMaxHealth();
                   game.getActor().getPlayerStats().setHealth(hp);
                   i.setQuantity(i.getQuantity()-1);
               }
               else{
                   throw new InventoryControlException("you don't have any of that item");
               }
                   
                   
           }
       }
    }

    public void useManaPot() throws InventoryControlException{
       double mana;
       for(Item i : game.getActor().getInventory().getItems()){
           if (i.getItemType() == "Mana potion\t"){
               if (i.getQuantity()>0){
                   mana = game.getActor().getPlayerStats().getMana();
                   mana +=10;
                   if(mana > game.getActor().getPlayerStats().getMaxMana())
                       mana = game.getActor().getPlayerStats().getMaxMana();
                   game.getActor().getPlayerStats().setMana(mana);
                   i.setQuantity(i.getQuantity()-1);
               }
               else{
                   throw new InventoryControlException("you don't have any of that item");
               }
                   
                   
           }
       }
    }

    public void useGManaPot() throws InventoryControlException{
       double mana;
       for(Item i : game.getActor().getInventory().getItems()){
           if (i.getItemType() == "Greater mana potion"){
               if (i.getQuantity()>0){
                   mana = game.getActor().getPlayerStats().getMana();
                   mana +=25;
                   if(mana > game.getActor().getPlayerStats().getMaxMana())
                       mana = game.getActor().getPlayerStats().getMaxMana();
                   game.getActor().getPlayerStats().setMana(mana);
                   i.setQuantity(i.getQuantity()-1);
               }
               else{
                   throw new InventoryControlException("you don't have any of that item");
               }
                   
                   
           }
       }
    }
    
    public void addItem(String item){
        Inventory inv = game.getActor().getInventory();
        for (Item i:inv.getItems()){
            if (i.getItemType() == item){
                i.setQuantity(i.getQuantity()+1);
            }
        }
    }
}
