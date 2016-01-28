/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import byui.cit260.mountKabru.model.Player;
import byui.cit260.mountKabru.model.Scene;
import byui.cit260.mountKabru.model.Locations;
import byui.cit260.mountKabru.model.Stats;

/**
 *
 * @author jacob bloomfield
 */
public class MountKabru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setName("Micky Mouse");
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Scene sceneOne = new Scene();
        
        sceneOne.setName("Forest");
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        Locations locationsOne = new Locations();
        
        locationsOne.setAreaName("Mount");
        String locationsInfo = locationsOne.toString();
        System.out.println(locationsInfo); 
    }
    
}
