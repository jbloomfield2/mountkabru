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
public class MageAbilityView extends View{
    
    private static Game game = MountKabru.getCurrentGame();
    private EnemyActor enemyMonster;
    
    public MageAbilityView(EnemyActor enemy){
        super("\nEnemy: "+enemy.getName()+ " health: " +enemy.getStats().getHealth()+ "/" + enemy.getStats().getMaxHealth()
                +"\n" + game.getPlayer().getName() + ": level " + game.getActor().getPlayerStats().getLevel() + 
                " health: " + game.getActor().getPlayerStats().getHealth() + "/" + game.getActor().getPlayerStats().getMaxHealth()+
              "\n========================================" +
              "\n              Abilities!                " +
              "\n  -'F'- Focus                           " +
              "\n  -'D'- Defend                          " +
              "\n  -'B'- Fireball                        " +
              "\n  -'L'- Lighting                        " +
              "\n  -'Q'- Return                          " +
              "\n========================================");
        enemyMonster = enemy;
    }
    
@Override
    public boolean doAction(String choice) {
        this.updateDisplay();
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "F": // Focus Ability
                this.focus();
                break;
            case "D": // Defence Ability
                this.defend();
                break;
            case "B":
                this.fireball();
                return true;
            case "L":
                this.lighting();
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

    private EnemyActor fireball() {
        double damage, mana;
        mana = game.getActor().getPlayerStats().getMana();
            
            if(game.getActor().getPlayerStats().getMana() > AbilityList.Fireball.getResourceCost()){
                damage = AbilityList.Fireball.getDamage();
                mana -= 2;
                double enemyHealth = enemyMonster.getStats().getHealth();
                enemyHealth -= damage;
                enemyMonster.getStats().setHealth(enemyHealth);
                this.console.println("dealt " + damage + " damage to " + enemyMonster.getName());
                return enemyMonster;
            }
            
            if(game.getActor().getPlayerStats().getMana() < AbilityList.Fireball.getResourceCost()){
                this.console.println("You don't have enough mana.");
            }
          return enemyMonster;  
    }

    private EnemyActor lighting() {
        double damage, mana;
        mana = game.getActor().getPlayerStats().getMana();
            
            if(game.getActor().getPlayerStats().getMana() > AbilityList.Lighting.getResourceCost()){
                damage = AbilityList.Lighting.getDamage();
                mana -= 3;
                double enemyHealth = enemyMonster.getStats().getHealth();
                enemyHealth -= damage;
                enemyMonster.getStats().setHealth(enemyHealth);
                this.console.println("dealt " + damage + " damage to " + enemyMonster.getName());
            }
            
            if(game.getActor().getPlayerStats().getMana() < AbilityList.Fireball.getResourceCost()){
                this.console.println("You don't have enough mana.");
            }
          return enemyMonster;}
    
    
    private void updateDisplay() {
        this.displayMessage = "\nEnemy: "+enemyMonster.getName()+ " health: " +enemyMonster.getStats().getHealth()+ "/" + enemyMonster.getStats().getMaxHealth()
                +"\n" + game.getPlayer().getName() + ": level " + game.getActor().getPlayerStats().getLevel() + 
                " " + game.getActor().getPlayerStats().getHealth() + "/" + game.getActor().getPlayerStats().getMaxHealth() +
                "\n========================================" +
                "\n              Abilities!                " +
                "\n  -'F'- Focus                           " +
                "\n  -'D'- Defend                          " +
                "\n  -'B'- Fireball                        " +
                "\n  -'L'- Lighting                        " +
                "\n  -'Q'- Return                          " +
                "\n========================================";
    }
}
