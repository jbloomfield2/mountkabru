/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

/**
 *
 * @author jacob bloomfield
 */
public class ThePitView extends View {
    
    public ThePitView(){
        super("\n"
              + "\n----------------------------------------"
              + "\n           Welcome to the Pit"                            
              + "\n----------------------------------------" 
              + "\nT - Train" 
              + "\nH - Help" 
              + "\nR - Return to town" 
              + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();

        switch (value){
            case "T":
                this.console.println("Train function called");
                break;
            case "H":
                HelpMenuView pitHelp = new HelpMenuView();
                pitHelp.displayPitHelp();
                break;
            case "R":
                return true;

            default:
                this.console.println("invalid choice selected! please try again");
                break;      
        }
        
        return false;
        }
    
}
