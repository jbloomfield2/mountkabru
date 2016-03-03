/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

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

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "T": // create and start a new game
                this.talkToTavernOwner();
                break;
            case "S": // display the help menu
                this.sleep();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sleep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void buyHealthPotion() {
        BuyPotionView buy1 = new BuyPotionView();
        buy1.display();
    }

    private void buyManaPotion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void availableQuests() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void returnToTown() {
        TownMenuView town = new TownMenuView();
        town.display();
    }
}
