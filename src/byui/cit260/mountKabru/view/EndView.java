/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.Game;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
public class EndView extends View{

    Game game = MountKabru.getCurrentGame();
    public EndView() {
        super("With the defeat of the mysterious master the monsters "
                + "surrounding mount Kabru decrease in numbers and the area"
                + "is once again safe. Thanks for playing!");
        this.console.println("you completed the game in " + game.getDay() + " days");
    }
    
    @Override
    public boolean doAction(String input){
     this.console.println("The game will now close");
     System.exit(0);
        
        return false;   
    }
    
}
