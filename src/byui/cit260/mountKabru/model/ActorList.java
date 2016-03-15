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
    
    Goblin(),
    Wolves(),
    Kobold(),
    GiantAnt(),
    GiantSpider(),
    Snake(),
    BlackPanther(),
    Gator(),
    Centaur(),
    Ent(),
    Werewolf(),
    MountainLion(),
    MountainTroll(),
    Giant(),
    Griffin(),
    Dragon();
    
    //private final String MONSTERABILITIES;
    //private final Stats MONSTERSTATS;
    
    ActorList() {
    }
}
