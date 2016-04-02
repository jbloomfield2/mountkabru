/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import static byui.cit260.mountKabru.control.BattleControl.game;
import byui.cit260.mountKabru.model.Game;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
public class StatsControl {
    static Game game = MountKabru.getCurrentGame();
    
    public static void levelUp() {
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
        game.getLocations().getThePit().setTrainingLimit(3);
    }

    public static void trainAttack() {
        game.getActor().getPlayerStats().setAttack(game.getActor().getPlayerStats().getAttack()+1);
        game.getLocations().getThePit().setTrainingLimit(game.getLocations().getThePit().getTrainingLimit()-1);
        game.getLocations().getThePit().setTimesTrained(game.getLocations().getThePit().getTimesTrained()+1);
    }

    public static void trainDefense() {
        game.getActor().getPlayerStats().setDefence(game.getActor().getPlayerStats().getDefence()+1);
        game.getLocations().getThePit().setTrainingLimit(game.getLocations().getThePit().getTrainingLimit()-1);
        game.getLocations().getThePit().setTimesTrained(game.getLocations().getThePit().getTimesTrained()+1);
    }

    public static void trainMana() {
        game.getActor().getPlayerStats().setMaxMana(game.getActor().getPlayerStats().getMaxMana()+5);
        game.getActor().getPlayerStats().setMana(game.getActor().getPlayerStats().getMana()+5);
        game.getLocations().getThePit().setTrainingLimit(game.getLocations().getThePit().getTrainingLimit()-1);
        game.getLocations().getThePit().setTimesTrained(game.getLocations().getThePit().getTimesTrained()+1);
    }

    public static void trainHealth() {
        game.getActor().getPlayerStats().setMaxHealth(game.getActor().getPlayerStats().getMaxHealth()+5);
        game.getActor().getPlayerStats().setHealth(game.getActor().getPlayerStats().getHealth()+5);
        game.getLocations().getThePit().setTrainingLimit(game.getLocations().getThePit().getTrainingLimit()-1);
        game.getLocations().getThePit().setTimesTrained(game.getLocations().getThePit().getTimesTrained()+1);
        
    }
    
}
