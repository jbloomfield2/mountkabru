/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Locations;
import byui.cit260.mountKabru.model.Scene;
import byui.cit260.mountKabru.model.SceneType;
import java.util.ArrayList;

/**
 *
 * @author jacob bloomfield
 */
public class MapControl {

    static ArrayList<Locations> createLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void CreateMap() {
        Locations locations;
                
        Scene[]scenes = createScenes(); 
        
    }

    private static Scene[] createScenes() {
    Scene[] scenes = new Scene[SceneType.values().length];
    
    Scene town = new Scene();
    town.setAreaName("Town");
    town.setDescription("a small town at the base of mount kabru, it should have"
                        + " everything you need to prepare for your next adventure");
    scenes[SceneType.town.ordinal()] = town;
    
        Scene tavern = new Scene();
    town.setAreaName("tavern");
    town.setDescription("a place for locals to relax after their long day"
                        + " the tavernkeep can offer advice as well as sell a few items"
                        + "and provide work for heroes");
    scenes[SceneType.tavern.ordinal()] = tavern;
    
        Scene thePit = new Scene();
    town.setAreaName("The Pit");
    town.setDescription("Here you may train yourself to prepare for larger"
                        + " threats. you may only train so much per level");
    scenes[SceneType.thePit.ordinal()] = thePit;
    
        Scene blacksmith = new Scene();
    town.setAreaName("Blacksmith");
    town.setDescription("Here the local blacksmith is able to provide upgraded"
                        + " weaponsand armor, if you can afford it");
    scenes[SceneType.blacksmith.ordinal()] = blacksmith;
    
    return scenes;
    }
    
}
