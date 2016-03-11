/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Actor;
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

    public static void createNewGame(Player player) {
       System.out.println("***create new game method called***");
    }

    public String calcClass(String answer1, String answer2, String answer3) {
        //this method assigns the player's class based on their responses
        int w = 0,m = 0;
        
        //add to w or m based on answer
        if (answer1.equalsIgnoreCase("m"))
            m++;
        else if (answer1.equalsIgnoreCase("w"))
            w++;
        else    {
            System.out.println("Error unexpected input");
            return null;
        }
        
        if (answer2.equalsIgnoreCase("m"))
            m++;
        else if (answer2.equalsIgnoreCase("w"))
            w++;
        else    {
            System.out.println("Error unexpected input");
            return null;
        }
            
        if (answer3.equalsIgnoreCase("m"))
            m++;
        else if (answer3.equalsIgnoreCase("w"))
            w++;
        else    {
            System.out.println("Error unexpected input");
            return null;
        }
        //determine class based on answers
        //3 w = warrior, 3 m = mage, some combination = paladin
        String result;
        
        if (w > 2){
            result = "Warrior";
            System.out.println(" your class is: Warrior");
            return result;
        }
        if (m > 2) {
            result = "Mage";
            System.out.println(" your class is: Mage");
            return result;
        }
        else{
            result = "Paladin";
            System.out.println(" your class is: Paladin");
            return result;
        }
        
    
        
    }
}
