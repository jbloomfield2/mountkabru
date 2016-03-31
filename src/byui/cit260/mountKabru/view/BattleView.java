/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.BattleControl;
import byui.cit260.mountKabru.model.Game;
import mountkabru.MountKabru;

/**
 *
 * @author Andrew
 */
public class BattleView extends View{
    
    public BattleView(){
        super("\n========================================" +
              "\n              Battle!                   " +
              "\n  -'A'- Attack!                         " +
              "\n  -'M'- Abilites                        " +
              "\n  -'R'- Run Away!                       " +
              "\n========================================");
    
}

@Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "A":
                this.attack();
                break;
            case "B":
                this.ability();
                break;
            case "R":
                this.runAway();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void attack() {
        BattleControl bc = new BattleControl();
        int damage;
        damage = bc.attack(0, 0, 0);
    }
    
    private void ability() {
        Game game = MountKabru.getCurrentGame();
        
        if(game.getPlayer().getPlayerClass() == "Warrior"){
            WarriorAbilityView view1 = new WarriorAbilityView();
            view1.display();
        }
        
        if(game.getPlayer().getPlayerClass() == "Mage"){
            MageAbilityView view2 = new MageAbilityView();
            view2.display();
        }
        
        if(game.getPlayer().getPlayerClass() == "Paladin"){
            PaladinAbilityView view3 = new PaladinAbilityView();
            view3.display();
        }
    }

    private void runAway() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
