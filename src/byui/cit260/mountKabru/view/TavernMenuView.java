/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.ActorControl;
import byui.cit260.mountKabru.model.Game;

/**
 *
 * @author Andrew
 */
public class TavernMenuView extends View{
    
    public TavernMenuView(){
        super("\n  _____                          \n" +
                        " |_   _|_ ___   _____ _ __ _ __  \n" +
                        "   | |/ _` \\ \\ / / _ \\ '__| '_ \\ \n" +
                        "   | | (_| |\\ V /  __/ |  | | | |\n" +
                        "   |_|\\__,_| \\_/ \\___|_|  |_| |_|\n" +
                        "************************************************************\n" +
                        "*----Tavern Menu-------------------------------------------*\n" +
                        "*----------------------------------------------------------*\n" +
                        "*----[T] - Talk to Tavern owner----------------------------*\n" +
                        "*----[S] - Sleep-------------------------------------------*\n" +
                        "*----[H] - Buy Health Potion-------------------------------*\n" +
                        "*----[M] - Buy Mana Potion---------------------------------*\n" +
                        "*----[A] - Available Quests--------------------------------*\n" +
                        "*----[R] - Return to Town----------------------------------*\n" +
                        "*----------------------------------------------------------*\n" +
                        "************************************************************");
    }
    Game game = mountkabru.MountKabru.getCurrentGame();

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "T": // create and start a new game
                this.talkToTavernOwner();
                break;
            case "S": // display the help menu
                this.sleep();
                int currentDay = game.getDay();
                this.console.print("after a good night's sleep your health mana have been restored. it is now day " + currentDay + " of your adventure.");
                break;
            case "H": // display the help menu
                this.buyHealthPotion();
                break;
            case "M":
                this.buyManaPotion();
                break;
            case "A":
                this.availableQuests();
                break;
            case "R":
                this.returnToTown();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void talkToTavernOwner() {
        ActorControl ac = new ActorControl();
        int responseNum = ac.talkToActor(game.getActor().getPlayerStats().getLevel());
        String tavernResponse = ac.actorResponse(responseNum);
        this.console.println(tavernResponse);
    }

    private void sleep() {//sets health and mana to maximum
        game.getActor().getPlayerStats().setHealth(game.getActor().getPlayerStats().getMaxHealth());
        game.getActor().getPlayerStats().setMana(game.getActor().getPlayerStats().getMaxMana());
        game.setDay(game.getDay()+1);
    }

    private void buyHealthPotion() {
        BuyPotionView buy1 = new BuyPotionView();
        buy1.display();
    }

    private void buyManaPotion() {
        BuyManaPotion buy2 = new BuyManaPotion();
        buy2.display();
    }

    private void availableQuests() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void returnToTown() {
        TownMenuView town = new TownMenuView();
        town.display();
    }
}
