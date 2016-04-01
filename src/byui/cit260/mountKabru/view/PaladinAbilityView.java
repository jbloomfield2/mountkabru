/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.BattleControl;
import byui.cit260.mountKabru.model.AbilityList;
import byui.cit260.mountKabru.model.EnemyActor;
import byui.cit260.mountKabru.model.Game;
import mountkabru.MountKabru;

/**
 *
 * @author Andrew
 */
public class PaladinAbilityView extends View {
    
    private static Game game = MountKabru.getCurrentGame();
    private EnemyActor enemyMonster;
    
    public PaladinAbilityView(EnemyActor enemy){
        super("\nEnemy: "+enemy.getName()+ " health: " +enemy.getStats().getHealth()+ "/" + enemy.getStats().getMaxHealth()
                +"\n" + game.getPlayer().getName() + ": level " + game.getActor().getPlayerStats().getLevel() + 
                " health: " + game.getActor().getPlayerStats().getHealth() + "/" + game.getActor().getPlayerStats().getMaxHealth()+
              
              "\n========================================" +
              "\n              Abilities!                " +
              "\n  -'F'- Focus                           " +
              "\n  -'D'- Defend                          " +
              "\n  -'M'- MinorHeal                       " +
              "\n  -'I'- Intimidate                      " +
              "\n  -'Q'- Return                          " +
              "\n========================================");
        enemyMonster = enemy;
        } 
@Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "F": // Focus Ability
                this.focus();
                break;
            case "D": // Defend Ability
                this.defend();
                break;
            case "M":
                this.minorheal();
                break;
            case "I":
                this.intimidate();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void focus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void defend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void minorheal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void intimidate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
