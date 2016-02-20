/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import java.util.Scanner;


/**
 *
 * @author jacob bloomfield
 */
class HelpMenuView {
private String menu;


    public HelpMenuView() {
                this.menu = "\n"
              + "\n----------------------------------------"
              + "\n| Help Menu                            |"
              + "\n----------------------------------------"
              + "\nG - What is the goal of the game?"
              + "\nT - The town"
              + "\nA - Adventuring"
              + "\nI - Inventory"
              + "\nQ - Go back"
              + "\n----------------------------------------";
    }

    void displayMenu() {
        
        boolean done= false; // set flag to not done
        
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
           
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        }
        while (!done);         
                  
            
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
            case "G": // Goal of game
                System.out.println("Goal of game info");
                break;
            case "T": // the town
                System.out.println("The town info");
                break;
            case "A": // Adventuring
                System.out.println("Adventuring info");
                break;
            case "I"://inventory
                System.out.println("Inventory info");
                break;
            case "Q"://back to main menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    
}
