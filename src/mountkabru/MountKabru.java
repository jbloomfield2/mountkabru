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
import byui.cit260.mountKabru.model.Character;


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
        
        Stats statOne = new Stats();
        statOne.setHealth(50);
        statOne.setMana(40);
        statOne.setAttack(6);
        statOne.setDefence(16);
        String statInfo = statOne.toString();
        System.out.println(statInfo);
        
        Character charOne = new Character();
        charOne.setName("john");
        charOne.setLevel(1);
        charOne.setAbilities("fireball, magic missile");
        String charInfo = charOne.toString();
        System.out.println(charInfo);
    }
    
}
