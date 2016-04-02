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
public abstract class ForestView extends View {
    public ForestView(){
        super("         # #### ####\n" +
              "        ### \\/#|### |/####\n" +
              "       ##\\/#/ \\||/##/_/##/_#\n" +
              "     ###  \\/###|/ \\/ # ###\n" +
              "   ##_\\_#\\_\\## | #/###_/_####\n" +
              "  ## #### # \\ #| /  #### ##/##\n" +
              "   __#_--###`  |{,###---###-~\n" +
              "             \\ }{                      ###\n" +
              "              }}{                     #o###\n" +
              "              }}{                   #####o###\n" +
              "              {{}                  #o#\\#|#/###\n" +
              "        , -=-~{ .-^- _              ###\\|/#o#\n" +
              "              `}                     # }|{  #\n" +
              "               {                       }|{"  
                
                + "\nThe Dark Forest"
                + "\n======================================="
                + "\nM-Search for Monster"
                + "\nG-Game Menu"
                + "\nQ-return to previous menu"
                + "\n=======================================");
    }
    
    @Override
    public boolean doAction(String input){
        
        String choice = input.toUpperCase();//convert choice to upper case
        
        switch(choice){
            case "S":{
                this.searchForMonster();
                break;
            }
            case "G":{
                this.showGameMenu();
                break;
            }
            case "P":{
                this.usePotion();
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
        enemy = bc.ForestEncounter();
        if (enemy.getName() != null){
            this.console.println("encountered " + enemy.getName() + "!");
            BattleView battle = new BattleView(enemy);
            battle.display();
        }
        if (enemy.getName() == null)
            this.console.println("didn't find any monsters!");}


    private void showGameMenu() {
        GameMenuView menu = new GameMenuView();
        menu.display();
    }

    private void usePotion() {
        usePotionView potion = new usePotionView();
        potion.display();
    }
}
