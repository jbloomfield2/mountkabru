/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author jacob bloomfield
 */
public class Actor implements Serializable{
    
    //private final String playerClass;
    //private final int level;

    private ActorList actorList;
    private Stats playerStats;
    private QuestLog quest;
    private Inventory inventory;
    private Locations locations;
    private EnemyActor currentMonster;

    

    public QuestLog getQuest() {
        return quest;
    }

    public void setQuest(QuestLog quest) {
        this.quest = quest;
    }


    public Stats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(Stats stats) {
        this.playerStats = stats;
    }

    public EnemyActor getCurrentMonster() {
        return currentMonster;
    }

    public void setCurrentMonster(EnemyActor currentMonster) {
        this.currentMonster = currentMonster;
    }

    public ActorList getActorList() {
        return actorList;
    }

    public void setActorList(ActorList actorList) {
        this.actorList = actorList;
    }

    

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Actor{" + "playerStats=" + playerStats + ", quest=" + quest + ", inventory=" + inventory + ", locations=" + locations + '}';
    }


    
}
