/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.model.Actor;
import java.util.Scanner;

/**
 *
 * @author jacob bloomfield
 */
public class CharacterCreationView {
    private String prompt;

    public CharacterCreationView() {
        this.prompt = "\nGreetings " + mountkabru.MountKabru.getPlayer().getName() + ", "
                + "\nbefore we begin please answer these questions carefully"
                + " to choose your character class"
                + "\n"
                + "\n"
                + "\n1.	If a large tree fell on you and you were trapped, would you:\n" +
                "[ M ] 	push with all your might?\n" +
                "[ W ]	use your will to think it away?";
    }
    
    void display(){
        boolean done= false; // set flag to not done
        
        do {
            // prompt for answer to question 1
            String answer1 = this.getMenuOption();
            
            //change prompt to question 2
            this.prompt = "2.	If you are hanging on the edge of a cliff, would you:\n" +
                        "[ M ] 	fall, knowing you're strong enough to not perish?\n" +
                        "[ W ] 	use your will to drift to the top?";
            
            //prompt for question2
            String answer2 = this.getMenuOption();
            
            this.prompt = "If you are being enticed by delicious pastries, would you:\n" +
                        "[ M ]  Shove down as much as you can showing off your might?\n" +
                        "[ W ]	use your will to resist the temptation to indulge?";
            
           String answer3 = this.getMenuOption();
           
            
            
           
            
            // do the requested action and display the next view
           done = this.doAction(answer1,answer2,answer3);
        }
        while (!done);
        
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        String value = "";
        
        boolean valid = false; // set flag to invalid value entered
        while(!valid) { // while a vaild name has not been retrieved
            
            //promt for menu choice
            System.out.println(this.prompt);
            
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

    private boolean doAction(String answer1, String answer2, String answer3) {
        Actor playerActor = new Actor();
        GameControl gamec = new GameControl();
        //calculate player class
        playerActor = gamec.calcClass(answer1,answer2,answer3);
        //continue to town menu
        TownMenuView town = new TownMenuView();
        town.displayMenu();
        return true;
    }
    
}
