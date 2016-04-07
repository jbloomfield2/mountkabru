/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.io.Serializable;

/**
 *
 * @author farcry15
 */
    
    public enum ActorList implements Serializable{
    
    Goblin("goblin",4,2,5,10),
    Wolves("wolf",3,3,5,8),
    Kobold("kobold",3,4,5,12),
    GiantAnt("Giant Ant",2,3,5,15),
    GiantSpider("Giant Spider",5,4,5,25),
    Snake("Snake",6,3,5,20),
    BlackPanther("Black Panther",8,4,5,25),
    Gator("Gator",10,5,5,20),
    Centaur("Centaur",14,9,5,30),
    Ent("Ent",12,10,5,32),
    Werewolf("Werewolf",16,8,5,30),
    MountainLion("Mountain Lion",16,6,5,32),
    MountainTroll("Mountain Troll",20,15,10,50),
    Giant("Giant",36,15,10,70),
    Griffin("Griffin",35,16,10,80),
    Dragon("Dragon",40,25,15,100),
    MysteriousMaster("Mysterious Master",50,35,30,120);
    
    //private final String MONSTERABILITIES;
    private  Stats MONSTERSTATS;
    private final String NAME;
    
    ActorList(String monsterName,int atk,int def,int mana,int health) {
        this.NAME = monsterName;
        Stats temp = new Stats();
        temp.setAttack(atk);
        temp.setDefence(def);
        temp.setHealth(health);
        temp.setMaxHealth(health);
        temp.setMana(mana);
        temp.setMaxMana(mana);
        this.MONSTERSTATS = temp;
        
        
    }

    public String getName() {
        return NAME;
    }

    public Stats getMONSTERSTATS() {
        return MONSTERSTATS;
    }

    public void setMONSTERSTATS(Stats MONSTERSTATS) {
        this.MONSTERSTATS = MONSTERSTATS;
    }

   
    
    
}
