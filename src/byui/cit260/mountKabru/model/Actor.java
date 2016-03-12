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
public enum Actor implements Serializable{
    
    PlayerCharacter("",0,0,0),
    Goblin("",0,0,0),
    Wolves("",0,0,0),
    Kobold("",0,0,0),
    GiantAnt("",0,0,0),
    GiantSpider("",0,0,0),
    Snake("",0,0,0),
    BlackPanther("",0,0,0),
    Gator("",0,0,0),
    Centaur("",0,0,0),
    Ent("",0,0,0),
    Werewolf("",0,0,0),
    MountainLion("",0,0,0),
    MountainTroll("",0,0,0),
    Giant("",0,0,0),
    Griffin("",0,0,0),
    Dragon("",0,0,0);
    
    //private final String playerClass;
    //private final int level;
    private final String MONSTERABILITIES;
    private final Stats MONSTERSTATS;
    
    private Stats playerStats;
    private QuestLog quest;
    private Inventory inventory;
    private Locations locations;

    Actor(String ability,double atk, double def,double hp) {
       this.MONSTERABILITIES = ability;
       this.MONSTERSTATS = new Stats(atk,def,hp);
    }

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

    

    public String getMonsterAbilities() {
        return MONSTERABILITIES;
    }

    @Override
    public String toString() {
        return "Character{"+ ", abilities=" + MONSTERABILITIES + '}';
    }

    
    

    
    
    
    
    
}
