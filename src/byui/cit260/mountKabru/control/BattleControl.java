/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;
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
    Game game = MountKabru.getCurrentGame();
    
    public int attack(int atk,int atkBonus,int def){
        Random rng = new Random();
        int totalAttack = 0;
        
        //check for vaild range
        if (atk < 1)
            return -1;
        
        if (atk > 50)
            return 50; //50 is the highest possible damage
        
        if (atkBonus < 1)
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
            monster = enemies[ActorList.GiantSpider.ordinal()];//encountered giant spider
            return monster;
        }
        if (rand > 80)
            return monster;//20% chance to not encounter anything

        return monster;
    }
}
