/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.ActorList;
import byui.cit260.mountKabru.model.EnemyActor;
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.Locations;
import byui.cit260.mountKabru.model.Scene;
import byui.cit260.mountKabru.model.SceneType;
import java.util.ArrayList;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
public class MapControl {
    
    Game game = MountKabru.getCurrentGame();

    static Locations createLocations() {
        Locations temp = new Locations();
        EnemyActor enemies[]= new EnemyActor[16];
        int i = 0;
        for (ActorList actors: ActorList.values()){//build array of monster data
            enemies[i] = new EnemyActor();
            enemies[i].setName(actors.getName());
            enemies[i].setStats(actors.getMONSTERSTATS());
            i++;
        }
        temp.setMonsterType(enemies);
        return temp;
            
        
    }

    static Locations createMap() {
        Locations locations;
        locations = MapControl.createLocations();
                
        Scene[]scenes = createScenes();
        locations.setScenes(scenes);
        return locations;
        
    }

    private static Scene[] createScenes() {

        Scene[] scenes = new Scene[SceneType.values().length];
    
    Scene town = new Scene();
    town.setName("Town");
    town.setDescription("a small town at the base of mount kabru, it should have"
                        + " everything you need to prepare for your next adventure");
    scenes[SceneType.town.ordinal()] = town;
    
        Scene tavern = new Scene();
    tavern.setName("tavern");
    tavern.setDescription("a place for locals to relax after their long day"
                        + " the tavernkeep can offer advice as well as sell a few items"
                        + "and provide work for heroes");
    scenes[SceneType.tavern.ordinal()] = tavern;
    
        Scene thePit = new Scene();
    thePit.setName("The Pit");
    thePit.setDescription("Here you may train yourself to prepare for larger"
                        + " threats. you may only train so much per level");
    scenes[SceneType.thePit.ordinal()] = thePit;
    
        Scene blacksmith = new Scene();
   blacksmith.setName("Blacksmith");
    blacksmith.setDescription("Here the local blacksmith is able to provide upgraded"
                        + " weaponsand armor, if you can afford it");
    scenes[SceneType.blacksmith.ordinal()] = blacksmith;
    
    Scene plains = new Scene();
    plains.setName("Plains");
    plains.setDescription("Located at the base of the mountain, the plains are home to some of the weakest creatures around");
    
    scenes[SceneType.plains.ordinal()] = plains;
    
    Scene jungle = new Scene();
    jungle.setName("Jungle");
   jungle.setDescription("The jungle is home to many many dangerous animals lurking in the brush");
    scenes[SceneType.jungle.ordinal()] = jungle;
    
    Scene forest = new Scene();
    forest.setName("High Forest");
    forest.setDescription("Near the top of the mountain, the forest is dark and quiet. Tread carefully");
    scenes[SceneType.highForest.ordinal()] = forest;
    
    Scene peak = new Scene();
    peak.setName("the peak");
    peak.setDescription("The peak is home to the most powerful monsters you will encounter. watch out for the dragon!");
    scenes[SceneType.peak.ordinal()] = peak;
    
    return scenes;
    }
    
}
