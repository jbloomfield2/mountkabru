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
public class WarriorAbilityView extends View{
    
    private static Game game = MountKabru.getCurrentGame();
    private EnemyActor enemyMonster;
    
    public WarriorAbilityView(EnemyActor enemy){
            super("\nEnemy: "+enemy.getName()+ " health: " +enemy.getStats().getHealth()+ "/" + enemy.getStats().getMaxHealth()
                +"\n" + game.getPlayer().getName() + ": level " + game.getActor().getPlayerStats().getLevel() + 
                " health: " + game.getActor().getPlayerStats().getHealth() + "/" + game.getActor().getPlayerStats().getMaxHealth()+
              
                  "\n========================================" +
                  "\n              Abilities!                " +
                  "\n  -'F'- Focus                           " +
                  "\n  -'D'- Defend                          " +
                  "\n  -'S'- Slash                           " +
                  "\n  -'C'- SpiralCut                       " +
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
            case "S":
                this.slash();
                return true;
            case "C":
                this.spiralcut();
                return true;
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

    private void slash() {
        double damage, mana;
        mana = game.getActor().getPlayerStats().getMana();
            
            if(game.getActor().getPlayerStats().getMana() > AbilityList.Slash.getResourceCost()){
                damage = AbilityList.Slash.getDamage();
                mana -= 3;
                double enemyHealth = enemyMonster.getStats().getHealth();
                enemyHealth -= damage;
                enemyMonster.getStats().setHealth(enemyHealth);
                this.console.println("dealt " + damage + " damage to " + enemyMonster.getName());
                game.getActor().setCurrentMonster(enemyMonster);
            }
            
            if(game.getActor().getPlayerStats().getMana() < AbilityList.Fireball.getResourceCost()){
                this.console.println("You don't have enough mana.");
            }
           
    }

    private void spiralcut() {
        double damage, mana;
        mana = game.getActor().getPlayerStats().getMana();
            
            if(game.getActor().getPlayerStats().getMana() > AbilityList.SpiralCut.getResourceCost()){
                damage = AbilityList.SpiralCut.getDamage();
                mana -= 4;
                double enemyHealth = enemyMonster.getStats().getHealth();
                enemyHealth -= damage;
                enemyMonster.getStats().setHealth(enemyHealth);
                this.console.println("dealt " + damage + " damage to " + enemyMonster.getName());
                game.getActor().setCurrentMonster(enemyMonster);
            }
            
            if(game.getActor().getPlayerStats().getMana() < AbilityList.Fireball.getResourceCost()){
                this.console.println("You don't have enough mana.");
            } 
    }
    
}