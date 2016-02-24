/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.Inventory;
import java.util.Scanner;
/**
 *
 * @author Andrew
 */
public class BuyPotionView {
    private final String menu;
    private boolean promptMessage;
    
    public BuyPotionView(){
        this.menu = "\n Would you like to buy a Potion for 50 gold? Y/N";    
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "Y": // create and start a new game
                this.addPotionToInv();
                break;
            case "N": // display the help menu
                return true;
            }
        return false;
    }
    
    private void addPotionToInv() { 
        
                Inventory inv = new Inventory();
                        
                    if (inv.getShillings() < 50){
                        System.out.println("\nCome back when you have enough money.");
                    }
                               
                    if (inv.getShillings() > 50){
                        System.out.println("\nThanks for your business. Good luck!");
                    }
        }

    private void returnToTavernMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    


