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
        double attack;
        attack = 3;
        double playerAttack;
        playerAttack = game.getActor().getPlayerStats().getAttack();
        playerAttack += attack;
        game.getActor().getPlayerStats().setHealth(playerAttack);
        this.console.println("You gained " + attack + " temporary defense");
    }


    private void defend() {
        double defense;
        defense = 10;
        double playerDefense;
        playerDefense = game.getActor().getPlayerStats().getDefence();
        playerDefense += defense;
        game.getActor().getPlayerStats().setHealth(playerDefense);
        this.console.println("You gained " + defense + " temporary defense");}

    private void minorheal() {
        double heal, mana;
        mana = game.getActor().getPlayerStats().getMana();
            
            if(game.getActor().getPlayerStats().getMana() > AbilityList.MinorHeal.getResourceCost()){
                mana -= 2;
                double playerHealth = enemyMonster.getStats().getHealth();
                playerHealth -= 7;
                this.console.println("You healed 7 health.");
                game.getActor().setCurrentMonster(enemyMonster);
            }
            
            if(game.getActor().getPlayerStats().getMana() < AbilityList.Fireball.getResourceCost()){
                this.console.println("You don't have enough mana.");
            }
    }

    private void intimidate() {
        double damage, mana;
        mana = game.getActor().getPlayerStats().getMana();
            
            if(game.getActor().getPlayerStats().getMana() > AbilityList.Intimidate.getResourceCost()){
                damage = AbilityList.Intimidate.getDamage();
                mana -= 3;
                double enemyAttack = enemyMonster.getStats().getAttack();
                enemyAttack -= 2;
                enemyMonster.getStats().setHealth(enemyAttack);
                this.console.println("You Intimidated " + enemyMonster.getName() + ". The monsters attack fell 2 points");
                game.getActor().setCurrentMonster(enemyMonster);
            }
            
            if(game.getActor().getPlayerStats().getMana() < AbilityList.Fireball.getResourceCost()){
                this.console.println("You don't have enough mana.");
            } 
    }
}
