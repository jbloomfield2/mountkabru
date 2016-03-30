/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.BattleControl;
import byui.cit260.mountKabru.model.EnemyActor;

/**
 *
 * @author Andrew
 */
public abstract class PlainsView extends View {
    public PlainsView(){
        super("                                                 \n" +
              "                                     /\\\n" +
              "                                   .'  \\ \n" +
              "                                  /     \\ \n" +
              "                       .'\\      .'       \\ \n" +
              "                    .-'   `.   /          `.\n" +
              "                  .'        \\.'             \\\n" +
              "               .-'           \\               \\   .-`\"`-. \n" +
              "           .'.'               \\               \\.'       `-.\n" +
              "          /                    `.           .-'\\           `-._\n" +
              "        .'                       \\       .-'                   `-.\n" +
              "                                                                  `-.\n" +
              "   .-------------------'''''''''''''''              _.--      .'\n" +
              "                                ___..         _.--''        .'\n" +
              "                          --''''             '            .'\n" +
                "\nThe Plains"
                + "\n======================================="
                + "\nS-Search for Monster"
                + "\nP-Use Potion"
                + "\nG-Game Menu"
                + "\nQ-return to previous menu"
                + "\n======================================="  
        );
    }
    @Override
    public boolean doAction(String input){
        
        String choice = input.toUpperCase();//convert choice to upper case
        
        switch(choice){
            case "S":{
                this.searchForMonster();
                break;
            }
            case "P":{
                this.usePotion();
                break;
            }
            case "G":{
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

    private void searchForMonster() {
        BattleControl bc = new BattleControl();
        EnemyActor enemy = new EnemyActor();
        enemy = bc.plainsEncounter();
        if (enemy.getName() != null){
            this.console.println("encountered " + enemy.getName() + "!");
        }
        if (enemy.getName() == null)
            this.console.println("didn't find any monsters!");
    } 

    private void usePotion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showGameMenu() {
        GameMenuView menu = new GameMenuView();
        menu.display();
    }
}
