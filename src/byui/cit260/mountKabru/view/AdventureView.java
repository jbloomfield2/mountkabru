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
public class AdventureView extends View{
    public AdventureView(){
        super("\nChoose an area to visit"
                + "\n======================================="
                + "\nP-Plains recommended level 1-5"
                + "\nJ-Jungle recommended level 5-15"
                + "\nD-Dark forest recommended level 10-20"
                + "\nH-High mountain recommended level 20+"
                + "\nM-Show Game Menu"
                + "\nQ-return to previous menu"
                + "\n=======================================");
    }
    @Override
    public boolean doAction(String input){
        
        String choice = input.toUpperCase();//convert choice to upper case
        
        switch(choice){
            case "P":{
                this.goToPlains();
                break;
            }
            case "J":{
                this.goToJungle();
                break;
            }
            case "D":{
                this.goToDarkForest();
                break;
            }
            case "H":{
                this.goToHighMountain();
                break;
            }
            case "M":{
                this.showGameMenu();
                break;
            }
            default:{
                this.console.println("\n*** Invalid selection *** Try again");
                break;
            }
                    
        }
        
        return false;
    }

    private void goToPlains() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void goToJungle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void goToDarkForest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void goToHighMountain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showGameMenu() {
        GameMenuView menu = new GameMenuView();
        menu.display();
    }
    
}
