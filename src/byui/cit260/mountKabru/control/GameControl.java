/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.exceptions.GameControlException;
import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.Inventory;
import byui.cit260.mountKabru.model.Item;
import byui.cit260.mountKabru.model.Locations;
import byui.cit260.mountKabru.model.Player;
import byui.cit260.mountKabru.model.QuestLog;
import byui.cit260.mountKabru.model.Stats;
import java.util.ArrayList;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null)//check if user entered anything
            return null;
        
        Player player = new Player();
        player.setName(playersName);
        
        
        MountKabru.setPlayer(player);//save player in main for later
        
        return player;
    }

    public static void createNewGame(Player player) {
       Game game = new Game();//create a new game
       MountKabru.setCurrentGame(game);
       
       game.setPlayer(player);//set player
       Actor actor = new Actor();//create and initalize all other model objects
       game.setActor(actor);
       game.setDay(1);
       
       Inventory inv = new Inventory();
       
       inv = InventoryControl.createInventory();
       game.getActor().setInventory(inv);
       
       ArrayList<Locations> locations = new ArrayList<>();
       locations = MapControl.createLocations();
       game.setLocations(locations);
       
       QuestLog quests = new QuestLog();
       game.getActor().setQuest(quests);
       
       Stats playerStats = new Stats();
       playerStats = ActorControl.createPlayerStats();
       game.getActor().setPlayerStats(playerStats);
       
       MapControl.CreateMap();
       
       
       
       
    }
    
    

    public String calcClass(String answer1, String answer2, String answer3) throws GameControlException {
        //this method assigns the player's class based on their responses
        int w = 0,m = 0;
        
        //add to w or m based on answer
        if (answer1.equalsIgnoreCase("m"))
            m++;
        else if (answer1.equalsIgnoreCase("w"))
            w++;
        else    {
            throw new GameControlException("Unexpected input, m or w expected");
        }
        
        if (answer2.equalsIgnoreCase("m"))
            m++;
        else if (answer2.equalsIgnoreCase("w"))
            w++;
        else    {
            throw new GameControlException("unexpected input, m or w expected");
        }
            
        if (answer3.equalsIgnoreCase("m"))
            m++;
        else if (answer3.equalsIgnoreCase("w"))
            w++;
        else    {
           throw new  GameControlException("unexpexted input m or w expected");
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
