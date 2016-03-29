/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.BattleControl;

/**
 *
 * @author Andrew
 */
public class BattleView extends View{
    
    public BattleView(){
        super("\n========================================" +
              "\n              Battle!                   " +
              "\n  -'A'- Attack!                         " +
              "\n  -'D'- Defend!                         " +
              "\n  -'M'- Abilites                        " +
              "\n  -'R'- Run Away!                       " +
              "\n========================================");
    
}

@Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "A": // create and start a new game
                this.attack();
                break;
            case "D": // display the help menu
                this.defend();
                break;
            case "B":
                this.ability();
                break;
            case "R":
                this.runAway();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void attack() {
        BattleControl bc = new BattleControl();
        int damage;
        damage = bc.attack(0, 0, 0);
    }

    private void defend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void runAway() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
