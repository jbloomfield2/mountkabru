/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.BattleControl;
import byui.cit260.mountKabru.control.QuestControl;
import byui.cit260.mountKabru.exceptions.BattleControlException;
import byui.cit260.mountKabru.model.ActorList;
import byui.cit260.mountKabru.model.EnemyActor;
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.QuestList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mountkabru.MountKabru;


/**
 *
 * @author Andrew
 */
public class BattleView extends View{
    
    private static Game game = MountKabru.getCurrentGame();
    private EnemyActor enemyMonster = game.getActor().getCurrentMonster();
    
    
    public BattleView(EnemyActor enemy){
        super("\nEnemy: "+enemy.getName()+ " health: " +enemy.getStats().getHealth()+ "/" + enemy.getStats().getMaxHealth()
                +"\n" + game.getPlayer().getName() + ": level " + game.getActor().getPlayerStats().getLevel() + 
                " health: " + game.getActor().getPlayerStats().getHealth() + "/" + game.getActor().getPlayerStats().getMaxHealth()+
              "\n========================================" +
              "\n              Battle!                   " +
              "\n  -'A'- Attack!                         " +
              "\n  -'B'- Abilites                        " +
              "\n  -'R'- Run Away!                       " +
              "\n========================================");
        game.getActor().setCurrentMonster(enemy);
    
}

@Override
    public boolean doAction(String choice) {
        this.updateDisplay();

        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "A":
                this.attack();
                if (enemyMonster.getStats().getHealth() < 1 && game.getActor().getPlayerStats().getHealth() > 0){//check if monster is dead
                    this.victory();
                    return true;
                }
                break;
            case "B":
                this.ability();
                this.updateDisplay();
                if (enemyMonster.getStats().getHealth() < 1){//check if monster is dead
                    this.victory();
                    return true;
                }
                break;
            case "R":
                boolean ran = this.runAway();
                return ran;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void attack() {
        BattleControl bc = new BattleControl();
        double damage;
        damage = bc.attack(game.getActor().getPlayerStats().getAttack(), game.getLocations().getBlacksmith().getWeaponBonus(), enemyMonster.getStats().getDefence());
        double enemyHealth = enemyMonster.getStats().getHealth();
        enemyHealth -= damage;
        enemyMonster.getStats().setHealth(enemyHealth);
        this.console.println("dealt " + damage + " damage to " + enemyMonster.getName());
        this.enemyTurn();
        if (game.getActor().getPlayerStats().getHealth() < 0)
            this.fainted();
        if (game.getActor().getPlayerStats().getHealth() < 9)
            this.console.println("WARNING Your Health is low! rest at the tavern or drink a potion!");
        this.updateDisplay();
        
        
    }
    
    private void ability() {
        Game currentGame = MountKabru.getCurrentGame();
        
        if("Warrior".equals(currentGame.getPlayer().getPlayerClass())){
            WarriorAbilityView view1 = new WarriorAbilityView(enemyMonster);
            view1.display();
        }
        
        if("Mage".equals(currentGame.getPlayer().getPlayerClass())){
            MageAbilityView view2 = new MageAbilityView(enemyMonster);
            view2.display();
        }
        
        if("Paladin".equals(currentGame.getPlayer().getPlayerClass())){
            PaladinAbilityView view3 = new PaladinAbilityView(enemyMonster);
            view3.display();
        }
    }

    private boolean runAway() {
        BattleControl bc = new BattleControl();
        boolean ran;
        try {
            ran = bc.runAway();
        } catch (BattleControlException ex) {
            this.console.println(ex.getMessage());
            ran = false;
        }
        return ran;
    }

    private void updateDisplay() {
        enemyMonster = game.getActor().getCurrentMonster();
        this.displayMessage = "\nEnemy: "+enemyMonster.getName()+ " health: " +enemyMonster.getStats().getHealth()+ "/" + enemyMonster.getStats().getMaxHealth()
                +"\n" + game.getPlayer().getName() + ": level " + game.getActor().getPlayerStats().getLevel() + 
                " " + game.getActor().getPlayerStats().getHealth() + "/" + game.getActor().getPlayerStats().getMaxHealth()
                +"\n========================================" +
              "\n              Battle!                   " +
              "\n  -'A'- Attack!                         " +
              "\n  -'B'- Abilites                        " +
              "\n  -'R'- Run Away!                       " +
              "\n========================================";//update health display
    }

    private void victory() {
        BattleControl.victory(enemyMonster);
        double xp,shillings;
        xp = enemyMonster.getStats().getMaxHealth()*4;
        shillings = enemyMonster.getStats().getMaxHealth()/2;
        
        double xpToNextLevel = game.getActor().getInventory().getXpToNextLevel();
        double totalXp = game.getActor().getInventory().getXp();
        xpToNextLevel -= totalXp;
        
        this.console.println("\nVICTORY");
        this.console.println("\ngained " + xp + " experience, "
                + xpToNextLevel+ " until next level");
        this.console.println("\nYou found "+ shillings+" shillings" );
        game.getActor().setCurrentMonster(new EnemyActor());
        enemyMonster.getStats().setHealth(enemyMonster.getStats().getMaxHealth());//reset monsters health or they will already be dead next time
        QuestControl qc = new QuestControl();
        //update quests progress
        qc.updateQuest(QuestList.Win20Battles.getQUESTDETAILS());
        if (enemyMonster.getName() == ActorList.GiantSpider.getName())
            qc.updateQuest(QuestList.KillSpiders.getQUESTDETAILS());
            
    }

    private void enemyTurn() {
        this.enemyAttack();
    }

    private void enemyAttack() {
        BattleControl bc = new BattleControl();
        double damage,playerHealth;
        damage = bc.attack(enemyMonster.getStats().getAttack(), 0 , game.getActor().getPlayerStats().getDefence());
        playerHealth = game.getActor().getPlayerStats().getHealth();
        playerHealth -= damage;
        game.getActor().getPlayerStats().setHealth(playerHealth);
        this.console.println(enemyMonster.getName() + " dealt " + damage + " damage");
      
    }

    private void fainted() {
        this.console.println("you have fainted, you dropped all of your shillings"
                + "\n and lose all experience toward your next level");
        game.getActor().getInventory().setShillings(0);
        game.getActor().getInventory().setXp(0);
        this.console.println("Get to the tavern and rest Immediately before attempting to battle again");
    }
    
    
}
