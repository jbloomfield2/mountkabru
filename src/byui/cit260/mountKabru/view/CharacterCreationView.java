/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.exceptions.GameControlException;
import byui.cit260.mountKabru.model.Actor;
import java.util.Scanner;

/**
 *
 * @author jacob bloomfield
 */
public class CharacterCreationView extends View {

    public CharacterCreationView() {
        super("\nGreetings " + mountkabru.MountKabru.getPlayer().getName() + ", "
                + "\nbefore we begin please answer these questions carefully"
                + " to choose your character class"
                + "\n"
                + "\n"
                + "\n1.	If a large tree fell on you and you were trapped, would you:\n" +
                "[ M ] 	push with all your might?\n" +
                "[ W ]	use your will to think it away?");
    }
    

    
    
    @Override
    public boolean doAction(String answer1) {
        answer1 = answer1.toUpperCase();
        if (!answer1.equals("W") && !answer1.equals("M")){
            this.console.print("invalid response");
            return false;
        }
            
        //change prompt to question 2
        this.displayMessage =  "2.	If you are hanging on the edge of a cliff, would you:\n" +
                            "[ M ] 	fall, knowing you're strong enough to not perish?\n" +
                            "[ W ] 	use your will to drift to the top?";
        
            
        String answer2 = this.getInput();
        answer2 = answer2.toUpperCase();
        if (!answer1.equals("W") && !answer1.equals("M")){
            this.console.print("invalid response");
            return false;
        }
        
        //change prompt for question 3
        this.displayMessage = "3.       If you are being enticed by delicious pastries, would you:\n" +
                        "[ M ]  Shove down as much as you can showing off your might?\n" +
                        "[ W ]	use your will to resist the temptation to indulge?";
        
        String answer3 = this.getInput();
        answer3 = answer3.toUpperCase();
        if (!answer1.equals("W") && !answer1.equals("M")){
            this.console.print("invalid response");
            return false;
        }     
                
                
        String classResult;
        GameControl gamec = new GameControl();
        //calculate player class
        try{
        classResult = gamec.calcClass(answer1,answer2,answer3);
        }
        catch (GameControlException e){
            this.console.println(e.getMessage());
            return false;
            
        }
        if (classResult.length() > 1)
            mountkabru.MountKabru.getPlayer().setPlayerClass(classResult);
        //continue to town menu
        TownMenuView town = new TownMenuView();
        town.display();
        return true;
    }
    
}
