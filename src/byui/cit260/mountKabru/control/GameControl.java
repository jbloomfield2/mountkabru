/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

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
        
        if (playersName == null)
            return null;
        
        Player player = new Player();
        player.setName(playersName);
        
        MountKabru.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
       Game game = new Game();//create a new game
       MountKabru.setCurrentGame(game);
       
       game.setPlayer(player);
       
       Inventory inv = new Inventory();
       
       inv = createInventory();
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
    
    public static Inventory createInventory(){
        Inventory inv = new Inventory();
        
        Item healthPotion= new Item();
        healthPotion.setItemType("Health potion");
        healthPotion.setQuantity(0);
        healthPotion.setValue(25);
        
        Item gHealthPotion= new Item();
        gHealthPotion.setItemType("Greater Health potion");
        gHealthPotion.setQuantity(0);
        gHealthPotion.setValue(50);
        
        Item manaPotion= new Item();
        manaPotion.setItemType("Mana potion");
        manaPotion.setQuantity(0);
        manaPotion.setValue(25);
        
        Item gManaPotion= new Item();
        gManaPotion.setItemType("Greater Mana potion");
        gManaPotion.setQuantity(0);
        gManaPotion.setValue(50);
        
        inv.getItems().add(healthPotion);
        inv.getItems().add(gHealthPotion);
        inv.getItems().add(manaPotion);
        inv.getItems().add(gManaPotion);
        
            
        return inv;
        }

    public static Inventory getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
