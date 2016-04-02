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
public class ThePitView extends View {
    Game game = MountKabru.getCurrentGame();
    public ThePitView(){
        super("\n"
              + "\n----------------------------------------"
              + "\n           Welcome to the Pit"                            
              + "\n----------------------------------------" 
              + "\nT - Train" 
              + "\nH - Help" 
              + "\nQ - Return to town" 
              + "\n----------------------------------------");
        this.console.println("You may train " + game.getLocations().getThePit().getTrainingLimit() + " more times this level");
    }
    
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();

        switch (value){
            case "T":
                if(game.getLocations().getThePit().getTrainingLimit() > 0){
                    this.train();
                    this.console.println("You may train " + game.getLocations().getThePit().getTrainingLimit() + " more times this level");
                }
                else
                    this.console.println("You must level up before you can train more");
                break;
            case "H":
                HelpMenuView pitHelp = new HelpMenuView();
                pitHelp.display();
                break;

            default:
                this.console.println("invalid choice selected! please try again");
                break;      
        }
        
        return false;
        }

    private void train() {
        TrainView train = new TrainView();
        train.display();
    }
    
}
