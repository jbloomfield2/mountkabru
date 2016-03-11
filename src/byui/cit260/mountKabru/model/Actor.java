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
    
    PlayerCharacter(""),
    Goblin(""),
    Wolves(""),
    Kobold(""),
    GiantAnt(""),
    GiantSpider(""),
    Snake(""),
    BlackPanther(""),
    Gator(""),
    Centaur(""),
    Ent(""),
    Werewolf(""),
    MountainLion(""),
    MountainTroll(""),
    Giant(""),
    Griffin(""),
    Dragon("");
    
    //private final String playerClass;
    //private final int level;
    private final String abilities;
    
    private Player player;
    private Stats stats;
    private Quest quest;
    private Inventory inventory;
    private Locations locations;

    Actor(String ability) {
       this.abilities = ability;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
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

    

    public String getAbilities() {
        return abilities;
    }

    @Override
    public String toString() {
        return "Character{"+ ", abilities=" + abilities + '}';
    }

    
    

    
    
    
    
    
}
