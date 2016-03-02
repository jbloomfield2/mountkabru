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
class HelpMenuView extends View {

    public HelpMenuView() {
                super("\n"
              + "\n----------------------------------------"
              + "\n| Help Menu                            |"
              + "\n----------------------------------------"
              + "\nG - What is the goal of the game?"
              + "\nT - The town"
              + "\nA - Adventuring"
              + "\nI - Inventory"
              + "\nQ - Go back"
              + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "G": // Goal of game
                System.out.println("Goal of game info");
                break;
            case "T": // the town
                System.out.println("The town info");
                break;
            case "A": // Adventuring
                System.out.println("Adventuring info");
                break;
            case "I"://inventory
                System.out.println("Inventory info");
                break;
            case "Q"://back to main menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    
}
