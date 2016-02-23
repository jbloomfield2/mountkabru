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
public class TownMenuView {
    private String menu;

    public TownMenuView() {
        this.menu = "\n"
              + "\n----------------------------------------"
              + "\n| Welcome to the Town                            |"
              + "\n----------------------------------------"
              + "\nA - go adventuring"
              + "\nT - Visit the Tavern"
              + "\nP - Train at the Pit"
              + "\nB - Visit the Blacksmith"
              + "\nM - Game Menu"
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "A": // adventure
                System.out.println("AdventureView class");
                break;
            case "T": // the tavern
                System.out.println("TavernView class");
                break;
            case "B": // Blacksmith
                System.out.println("BlacksmithView class");
                break;
            case "P"://Pit
                System.out.println("ThePitView class");
                break;
            case "M"://show game menu
                System.out.println("GameMenuView class");
            break;
                
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
        
    }
}   

   
    

