
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;
import byui.cit260.mountKabru.exceptions.BattleControlException;
import byui.cit260.mountKabru.model.ActorList;
import byui.cit260.mountKabru.model.EnemyActor;
import byui.cit260.mountKabru.model.Game;
import java.util.Random;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
public class BattleControl {

    public static void victory(EnemyActor e) {
        double xp = game.getActor().getInventory().getXp();
        double gainedXp = e.getStats().getMaxHealth() * 4;//award xp equal to 4x the enemies hp
        xp += gainedXp;
        game.getActor().getInventory().setXp(xp);
        if (game.getActor().getInventory().getXp() >= game.getActor().getInventory().getXpToNextLevel())
           BattleControl.levelUp();
        
        double shillings,gainedShillings;
        shillings = game.getActor().getInventory().getShillings();
        gainedShillings = e.getStats().getMaxHealth() / 2;
        shillings += gainedShillings;
        game.getActor().getInventory().setShillings(shillings);
                
    }
   static Game game = MountKabru.getCurrentGame();
    
    public double attack(double atk,double atkBonus,double def){
        Random rng = new Random();
        double totalAttack = 0;
        
        //check for vaild range
        if (atk < 1)
            return -1;
        
        if (atk > 50)
            return 50; //50 is the highest possible damage
        
        if (atkBonus < 0)
            return -1;
        
        if (atkBonus > 50)
            return 50;
        
        if (def < 1)
            return -1;
        
        if (def > 50)
            return -1;
            
        //now we know data is within acceptable bounds
        totalAttack = atk + atkBonus;
        totalAttack -= def;
        
        //return a 0 if defense causes damge to be negative
        if (totalAttack < 0)
            return 0;
    
        return totalAttack;
    }
    
    public int spell(int mana,int manaBonus,int def){
        Random rng = new Random();
        int totalSpell = 0;
        
        //check for vaild range
        if (mana < 1)
            return -1;
        
        if (mana > 50)
            return 50; //50 is the highest possible damage
        
        if (manaBonus < 1)
            return -1;
        
        if (manaBonus > 50)
            return 50;
        
        if (def < 1)
            return -1;
        
        if (def > 50)
            return -1;
            
        //now we know data is within acceptable bounds
        totalSpell = mana + manaBonus;
        totalSpell -= def;
        
        //return a 0 if defense causes damge to be negative
        if (totalSpell < 0)
            return 0;
    
        return totalSpell;
    }
    
    public EnemyActor plainsEncounter(){
        Random rnd = new Random();
        int rand = rnd.nextInt(100);//get a random number
        EnemyActor[] enemies = game.getLocations().getMonsterType();//retrieve list of monsters, only 0-3 can be found in plains
        EnemyActor monster = new EnemyActor();//this will be the monster encountered

        if (rand < 25){
            monster = enemies[ActorList.Goblin.ordinal()];//encountered goblin
            return monster;
        }
        if (rand < 45){
            monster = enemies[ActorList.Wolves.ordinal()];//encountered wolf
            return monster;
        }
        if (rand < 65){
            monster = enemies[ActorList.Kobold.ordinal()];//encountered kobold
            return monster;
        }
        if (rand < 80){
            monster = enemies[ActorList.GiantAnt.ordinal()];//encountered giant spider
            return monster;
        }
        if (rand > 79)
            return monster;//20% chance to not encounter anything

        return monster;
    }
    
    public EnemyActor JungleEncounter(){
        Random rnd = new Random();
        int rand = rnd.nextInt(100);//get a random number
        EnemyActor[] enemies = game.getLocations().getMonsterType();//retrieve list of monsters, only 0-3 can be found in plains
        EnemyActor monster = new EnemyActor();//this will be the monster encountered

        if (rand < 25){
            monster = enemies[ActorList.GiantSpider.ordinal()];//encountered goblin
            return monster;
        }
        if (rand < 45){
            monster = enemies[ActorList.Snake.ordinal()];//encountered wolf
            return monster;
        }
        if (rand < 65){
            monster = enemies[ActorList.BlackPanther.ordinal()];//encountered kobold
            return monster;
        }
        if (rand < 80){
            monster = enemies[ActorList.Gator.ordinal()];//encountered giant spider
            return monster;
        }
        if (rand > 79)
            return monster;//20% chance to not encounter anything

        return monster;
    }
    
    public EnemyActor ForestEncounter(){
        Random rnd = new Random();
        int rand = rnd.nextInt(100);//get a random number
        EnemyActor[] enemies = game.getLocations().getMonsterType();//retrieve list of monsters, only 0-3 can be found in plains
        EnemyActor monster = new EnemyActor();//this will be the monster encountered

        if (rand < 25){
            monster = enemies[ActorList.Centaur.ordinal()];//encountered goblin
            return monster;
        }
        if (rand < 45){
            monster = enemies[ActorList.Ent.ordinal()];//encountered wolf
            return monster;
        }
        if (rand < 65){
            monster = enemies[ActorList.Werewolf.ordinal()];//encountered kobold
            return monster;
        }
        if (rand < 80){
            monster = enemies[ActorList.MountainLion.ordinal()];//encountered giant spider
            return monster;
        }
        if (rand > 79)
            return monster;//20% chance to not encounter anything

        return monster;
    }
    
    public EnemyActor MountainEncounter(){
        Random rnd = new Random();
        int rand = rnd.nextInt(100);//get a random number
        EnemyActor[] enemies = game.getLocations().getMonsterType();//retrieve list of monsters, only 0-3 can be found in plains
        EnemyActor monster = new EnemyActor();//this will be the monster encountered

        if (rand < 25){
            monster = enemies[ActorList.MountainTroll.ordinal()];//encountered goblin
            return monster;
        }
        if (rand < 45){
            monster = enemies[ActorList.Giant.ordinal()];//encountered wolf
            return monster;
        }
        if (rand < 65){
            monster = enemies[ActorList.Griffin.ordinal()];//encountered kobold
            return monster;
        }
        if (rand < 80){
            monster = enemies[ActorList.Dragon.ordinal()];//encountered giant spider
            return monster;
        }
        if (rand > 79)
            return monster;//20% chance to not encounter anything

        return monster;
    }

    private static void levelUp() {
        game.getActor().getInventory().setXp(0);//reset experience counter
        double nextLevel = game.getActor().getInventory().getXpToNextLevel() + 50;
        game.getActor().getInventory().setXpToNextLevel(nextLevel);
        
        game.getActor().getPlayerStats().setLevel(game.getActor().getPlayerStats().getLevel()+1);
        game.getActor().getPlayerStats().setAttack(game.getActor().getPlayerStats().getAttack()+2);
        game.getActor().getPlayerStats().setDefence(game.getActor().getPlayerStats().getDefence()+1);
        game.getActor().getPlayerStats().setHealth(game.getActor().getPlayerStats().getHealth()+5);
        game.getActor().getPlayerStats().setMaxHealth(game.getActor().getPlayerStats().getMaxHealth()+5);
        game.getActor().getPlayerStats().setMana(game.getActor().getPlayerStats().getMana()+5);
        game.getActor().getPlayerStats().setMaxMana(game.getActor().getPlayerStats().getMaxMana()+5);
    }

    public boolean runAway() throws BattleControlException{
        Random rnd = new Random();
        int rand = rnd.nextInt(100);
        if (rand > 25)//run away has a 25% chance to fail
            return true;
        throw new BattleControlException("Failed to run");
    }
}
