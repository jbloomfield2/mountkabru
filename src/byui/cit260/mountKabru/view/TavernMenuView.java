/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class TavernMenuView {
    private String menu;
    private boolean promptMessage;
    
    public TavernMenuView(){
        this.menu = "\n  _____                          \n" +
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
                        "************************************************************";
    }          
    public void displayMenu() {
        
        boolean done= false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
        }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        String value = "";
        
        boolean valid = false; // set flag to invalid value entered
        while(!valid) { // while a vaild name has not been retrieved
            
            //promt for menu choice
            System.out.println(this.menu);
            
            value = keyboard.nextLine(); // get the choice from the keyboard
            value = value.trim();
            
            //if the name is invalid (less than one character in length)
            if (value.length() < 1){
                System.out.println("\nInvalid value - the value can not be blank");
                continue; // and repeat again
            }
            valid = true; //set flag to end repetition
        }
        
        return value; // return the value
    }

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
        buy1.displayMenu();
    }

    private void buyManaPotion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void availableQuests() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void returnToTown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
