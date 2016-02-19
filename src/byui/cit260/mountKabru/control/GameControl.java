/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Player;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null)
            return null;
        
        Player player = new Player();
        player.setName(playersName);
        
        MountKabru.setPlayer(player);
        
        return player;
    }
    
}
