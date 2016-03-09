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
    
    Goblin(),
    Wolves(),
    Kobold(),
    Giant Ant(),
    Giant Spider(),
    Snake(),
    Black Panther(),
    Gator(),
    Centaur(),
    Ent(),
    Werewolf(),
    Mountain Lion(),
    Mountain Troll(),
    Giant(),
    Griffin(),
    Dragon();
    
    private final String playerClass;
    private final int level;
    private final String abilities;

    public Actor(String description) {
        this.decription = description;
        coordinates = new Point(1,1);
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public int getLevel() {
        return level;
    }

    public String getAbilities() {
        return abilities;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", playerClass=" + playerClass + ", level=" + level + ", abilities=" + abilities + '}';
    }

    
    

    
    
    
    
    
}
