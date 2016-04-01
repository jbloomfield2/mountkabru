/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.AbilityList;

/**
 *
 * @author Andrew
 */
public class WarriorAbilityView extends View{
    
    public WarriorAbilityView(){
            super("\n========================================" +
                  "\n              Abilities!                " +
                  "\n  -'F'- Focus                           " +
                  "\n  -'D'- Defend                          " +
                  "\n  -'S'- Slash                           " +
                  "\n  -'C'- SpiralCut                       " +
                  "\n  -'Q'- Return                          " +
                  "\n========================================");
        }   
@Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "F": // Focus Ability
                this.focus();
                break;
            case "D": // Defend Ability
                this.defend();
                break;
            case "S":
                this.slash();
                break;
            case "C":
                this.spiralcut();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }      

    private void focus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void defend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void slash() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void spiralcut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}