/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.Game;
import mountkabru.MountKabru;

/**
 *
 * @author Andrew
 */
public class WeaponBonusView extends View {
    
    private static Game game = MountKabru.getCurrentGame();
    
    public WeaponBonusView(){
        super("\n Would you like to upgrade your weapon for 100? Y/N");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "Y":  {
                double attack;
                attack = 2;
                double playerAttack;
                playerAttack = game.getActor().getPlayerStats().getAttack();
                playerAttack += attack;
                game.getActor().getPlayerStats().setDefence(playerAttack);
                this.console.println("\nThanks for your business. Good luck!");
            }
                break;
            case "N": // return to Blacksmith
                return true;
            }
        return false;  
    }
    
}
