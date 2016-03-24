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
public class TownMenuView extends View {

    public TownMenuView() {
        super("\n"
              + "\n----------------------------------------"
              + " \nWelcome to the Town"
              + "\n----------------------------------------"
              + "\nA - go adventuring"
              + "\nT - Visit the Tavern"
              + "\nP - Train at the Pit"
              + "\nB - Visit the Blacksmith"
              + "\nM - Game Menu"
              + "\nQ return to main menu"
              + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "A": // adventure
                AdventureView av = new AdventureView();
                av.display();
                break;
            case "T": // the tavern
                TavernMenuView tavern = new TavernMenuView();
                tavern.display();
                break;
            case "B": // Blacksmith
                BlacksmithView blacksmith = new BlacksmithView();
                blacksmith.display();
                break;
            case "P"://Pit
                ThePitView pit = new ThePitView();
                pit.display();
                break;
            case "M"://show game menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
            break;
                
                
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
        
    }
}   

   
    

