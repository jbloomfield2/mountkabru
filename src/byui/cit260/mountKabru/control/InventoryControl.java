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
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
public class InventoryControl {
    public static Inventory createInventory(){//initialize inventory with starting items
        Inventory inv = new Inventory();
        
        Item healthPotion= new Item();
        healthPotion.setItemType("Health potion\t");
        healthPotion.setQuantity(2);
        healthPotion.setValue(25);
        
        Item gHealthPotion= new Item();
        gHealthPotion.setItemType("Greater Health potion");
        gHealthPotion.setQuantity(0);
        gHealthPotion.setValue(50);
        
        Item manaPotion= new Item();
        manaPotion.setItemType("Mana potion\t");
        manaPotion.setQuantity(1);
        manaPotion.setValue(25);
        
        Item gManaPotion= new Item();
        gManaPotion.setItemType("Greater Mana potion");
        gManaPotion.setQuantity(0);
        gManaPotion.setValue(50);
        
        inv.getItems().add(healthPotion);
        inv.getItems().add(gHealthPotion);
        inv.getItems().add(manaPotion);
        inv.getItems().add(gManaPotion);
        inv.setShillings(10);
        
            
        return inv;
        }

    public static Inventory getSortedInventoryList() {
        Game currentGame = MountKabru.getCurrentGame();
        if (currentGame == null){//check if game is started yet
            Inventory sorted = new Inventory();
            sorted = createInventory();
            doInventorySort(sorted);
            return sorted;//if game is not started initialize a new inventory for the help screen
        }
        return null;
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
        
                Inventory inv = new Inventory();
                        
                    if (inv.getShillings() < 50){
                        throw new InventoryControlException("\nYou only have "
                                                            + inv.getShillings() + ". Come back when you have enough.");
                    }
                               
                    if (inv.getShillings() > 50){
                        System.out.println("\nThanks for your business. Good luck!");
                    }
        }
}
