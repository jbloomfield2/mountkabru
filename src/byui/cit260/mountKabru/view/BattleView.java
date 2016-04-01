/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.BattleControl;
import byui.cit260.mountKabru.model.EnemyActor;
import byui.cit260.mountKabru.model.Game;
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
              "\n  -'D'- Defend!                         " +
              "\n  -'M'- Abilites                        " +
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
                if (enemyMonster.getStats().getHealth() < 1){//check if monster is dead
                    this.victory();
                    return true;
                }
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
        double damage;
        damage = bc.attack(game.getActor().getPlayerStats().getAttack(), game.getLocations().getBlacksmith().getWeaponBonus(), enemyMonster.getStats().getDefence());
        double enemyHealth = enemyMonster.getStats().getHealth();
        enemyHealth -= damage;
        enemyMonster.getStats().setHealth(enemyHealth);
        this.console.println("dealt " + damage + " damage to " + enemyMonster.getName());
        this.enemyTurn();
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

    private void runAway() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void updateDisplay() {
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
    
    
}
