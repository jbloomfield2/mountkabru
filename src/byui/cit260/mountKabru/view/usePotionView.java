/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.InventoryControl;
import byui.cit260.mountKabru.exceptions.InventoryControlException;
import byui.cit260.mountKabru.model.Inventory;
import byui.cit260.mountKabru.model.Item;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacob bloomfield
 */
public class usePotionView extends View {

    public usePotionView() {
        super("\nUse which potion?"
                + "\n----------------------------------------------"
                + "\n1.)Health potion"
                + "\n2.)Greater health potion"
                + "\n3.)Mana potion"
                + "\n4.)Greater mana potion"
                + "\n----------------------------------------------");
    
    
    
    }
    @Override
    public boolean doAction(String input){
        
       switch(input){
           
           case "1":{
               this.useHealthPot();
               return true;
           }
           case "2":{
               this.useGHealthPot();
               return true;
           }
           case "3":{
               this.useManaPot();
               return true;
           }
           case "4":{
               this.useGManaPot();
               return true;
               
           }
       }
        
        
        return false;
    }

    private void useHealthPot() {
        InventoryControl ic = new InventoryControl();
        try {
            ic.useHealthPot();
            this.console.println("Healed 10 hitpoints");
        } catch (InventoryControlException ex) {
            this.console.println(ex.getMessage());
        }
    }

    private void useGHealthPot() {
         InventoryControl ic = new InventoryControl();
        try {
            ic.useGHealthPot();
            this.console.println("Healed 25 hitpoints");
        } catch (InventoryControlException ex) {
            this.console.println(ex.getMessage());
        }
    }

    private void useManaPot() {
        InventoryControl ic = new InventoryControl();
        try {
            ic.useManaPot();
            this.console.println("regained 10 mana");
        } catch (InventoryControlException ex) {
            this.console.println(ex.getMessage());
        }
    }

    private void useGManaPot() {
              InventoryControl ic = new InventoryControl();
        try {
            ic.useGManaPot();
            this.console.println("regained 25 mana");
        } catch (InventoryControlException ex) {
            this.console.println(ex.getMessage());
        }
    }
}
