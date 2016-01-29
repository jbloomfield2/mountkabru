/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import byui.cit260.mountKabru.model.*;



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
        
        Actor actorOne = new Actor();
        actorOne.setName("john");
        actorOne.setLevel(1);
        actorOne.setAbilities("fireball, magic missile");
        String actInfo = actorOne.toString();
        System.out.println(actInfo);
        
        Ability abilityOne = new Ability();
        
        abilityOne.setAblitiyName("Pucnh");
        String abilityInfo = abilityOne.toString();
        System.out.println(abilityInfo);
        
        Blacksmith blacksmithOne = new Blacksmith();
        
        blacksmithOne.setArmorBonus("2");
        String blacksmithInfo = blacksmithOne.toString();
        System.out.println(blacksmithInfo);
        
        ThePit thePitOne = new ThePit();
        
        thePitOne.setTitle("Yes");
        String thePitInfo = thePitOne.toString();
        System.out.println(thePitInfo);
        
        Tavern tavernOne = new Tavern();
        
        tavernOne.setOwnerResponses("How's it going?");
        String tavernInfo = tavernOne.toString();
        System.out.println(tavernInfo);
    
    }}
