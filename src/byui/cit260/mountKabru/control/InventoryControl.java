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
    public static Inventory createInventory(){//initialize inventory with starting items
        
        Inventory inv = new Inventory();
        for (ItemList items: ItemList.values()){
            Item temp = new Item(items);
            inv.getItems().add(temp);
        }
        inv.getItems().get(0).setQuantity(3);
        inv.getItems().get(2).setQuantity(1);
        inv.getItems().get(1).setQuantity(4);

        
        
        
            
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
        
                Inventory inv = new Inventory();
                        
                    if (inv.getShillings() < 50){
                        throw new InventoryControlException("\nYou only have "
                                                            + inv.getShillings() + ". Come back when you have enough.");
                    }
                               
                    if (inv.getShillings() > 50){
                        MountKabru.getOutFile().println("\nThanks for your business. Good luck!");
                    }
        }
}
