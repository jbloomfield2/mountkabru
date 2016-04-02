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
public abstract class HighMountainView extends View {
    public HighMountainView(){
        super("                    /   \\              /'\\       _                              \n" +
              "\\_..           /'.,/     \\_         .,'   \\     / \\_                            \n" +
              "    \\         /            \\      _/       \\_  /    \\     _                     \n" +
              "     \\__,.   /              \\    /           \\/.,   _|  _/ \\                    \n" +
              "          \\_/                \\  /',.,''\\      \\_ \\_/  \\/    \\                   \n" +
              "                           _  \\/   /    ',../',.\\    _/      \\                  \n" +
              "             /           _/m\\  \\  /    |         \\  /.,/'\\   _\\                 \n" +
              "           _/           /MMmm\\  \\_     |          \\/      \\_/  \\                \n" +
              "          /      \\     |MMMMmm|   \\__   \\          \\_       \\   \\_              \n" +
              "                  \\   /MMMMMMm|      \\   \\           \\       \\    \\             \n" +
              "                   \\  |MMMMMMmm\\      \\___            \\_      \\_   \\            \n" +
              "                    \\|MMMMMMMMmm|____.'  /\\_            \\       \\   \\_          \n" +
              "                    /'.,___________...,,'   \\            \\   \\        \\         \n" +
              "                   /       \\          |      \\    |__     \\   \\_       \\        \n" +
              "                 _/        |           \\      \\_     \\     \\    \\       \\_      \n" +
              "                /                               \\     \\     \\_   \\        \\     \n" +
              "                                                 \\     \\      \\   \\__      \\    \n" +
              "                                                  \\     \\_     \\     \\      \\   \n" +
              "                                                   |      \\     \\     \\      \\  \n" +
              "                                                    \\            |            \\ "  
                
                + "\nThe High Mountain"
                + "\n======================================="
                + "\nS-Search for Monster"
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
        enemy = bc.MountainEncounter();
        if (enemy.getName() != null){
            this.console.println("encountered " + enemy.getName() + "!");
            BattleView battle = new BattleView(enemy);
            battle.display();
        }
        if (enemy.getName() == null)
            this.console.println("didn't find any monsters!");
    }



    private void showGameMenu() {
        GameMenuView menu = new GameMenuView();
        menu.display();}

    private void usePotion() {
       usePotionView potion = new usePotionView();
        potion.display();
    }
}
