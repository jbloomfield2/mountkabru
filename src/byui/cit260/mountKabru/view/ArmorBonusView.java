/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.BattleControl;
import byui.cit260.mountKabru.control.InventoryControl;
import byui.cit260.mountKabru.exceptions.BlackSmithException;
import byui.cit260.mountKabru.exceptions.InventoryControlException;
import byui.cit260.mountKabru.model.Game;
import mountkabru.MountKabru;



/**
 *
 * @author Andrew
 */
public class ArmorBonusView extends View {
    
    private static Game game = MountKabru.getCurrentGame();
    
    public ArmorBonusView(){
        super("\n Would you like to upgrade your armor for 100? Y/N");
    }

    @Override
    public boolean doAction(String choice) {
     choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "Y":  {
                double defense;
                defense = 2;
                double playerDefense;
                playerDefense = game.getActor().getPlayerStats().getDefence();
                playerDefense += defense;
                game.getActor().getPlayerStats().setDefence(playerDefense);
                this.console.println("\nThanks for your business. Good luck!");
            }
                break;
            case "N": // return to Blacksmith
                return true;
            }
        return false;    
    }
    
    
}
