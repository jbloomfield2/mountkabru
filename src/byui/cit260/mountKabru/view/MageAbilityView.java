/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

/**
 *
 * @author Andrew
 */
public class MageAbilityView extends View{
    
    public MageAbilityView(){
        super("\n========================================" +
              "\n              Abilities!                " +
              "\n  -'F'- Focus                           " +
              "\n  -'D'- Defend                          " +
              "\n  -'B'- Fireball                        " +
              "\n  -'L'- Lighting                        " +
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
            case "D": // Defence Ability
                this.defend();
                break;
            case "B":
                this.fireball();
                break;
            case "L":
                this.lighting();
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

    private void fireball() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void lighting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
