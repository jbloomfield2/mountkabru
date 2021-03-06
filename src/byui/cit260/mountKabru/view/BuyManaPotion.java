/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.InventoryControl;
import byui.cit260.mountKabru.exceptions.InventoryControlException;

/**
 *
 * @author Andrew
 */
public class BuyManaPotion extends View {
    
    public BuyManaPotion(){
        super("\n Would you like to buy a Mana Potion for 50 gold? Y/N");    
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "Y": {
            try {
                // create and start a new game
                InventoryControl.addManaPotionToInv();
            } catch (InventoryControlException ex) {
                this.console.println(ex.getMessage());
                        
            }
        }
                break;
            case "N": // splay the help menu
                return true;
            }
        return false;
    }
   

}
