/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import byui.cit260.mountKabru.model.*;
import byui.cit260.mountKabru.control.*;
import byui.cit260.mountKabru.view.StartProgramView;



/**
 *
 * @author jacob bloomfield
 */
public class MountKabru {
    
    private static Game currentGame = null;
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView start = new StartProgramView();
        start.display();
        
        
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MountKabru.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MountKabru.player = player;
    }
    
    

    
}
