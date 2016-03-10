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

    Actor(String ability) {
       this.abilities = ability;
    }

    

    public String getAbilities() {
        return abilities;
    }

    @Override
    public String toString() {
        return "Character{"+ ", abilities=" + abilities + '}';
    }

    
    

    
    
    
    
    
}
