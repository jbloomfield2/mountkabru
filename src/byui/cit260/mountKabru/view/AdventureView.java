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
        super("                       ,sdPBbs.\n" +
              "                      ,d$$$$$$$$b.                          PEAK\n" +
              "                     d$P'`Y'`Y'`?$b\n" +
              "                    d'    `  '  \\ `b\n" +
              "                   /    |        \\  \\\n" +
              "                  /    / \\       |   \\                      HIGH FOREST\n" +
              "             _,--'        |      \\    |\n" +
              "           /' _/          \\   |        \\\n" +
              "        _/' /'             |   \\        `-.__\n" +
              "    __/'       ,-'    /    |    |     \\      `--...__       JUNGLE\n" +
              "  /'          /      |    / \\     \\     `-.           `\\\n" +
              " /                   /   /    \\            \\            `-. PLAINS"  
                
                + "\nChoose an area to visit"
                + "\n==========================================================="
                + "\nP-Plains recommended level 1"
                + "\nJ-Jungle recommended level 3+"
                + "\nD-Dark Forest recommended level 6+"
                + "\nH-High Mountain recommended level 9(" 
                + "\nM-Summit(confront mysterious master) reccommend level 10+"
                + "\nG-Show Game Menu"
                + "\nQ-return to previous menu"
                + "\n===========================================================");    }
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
                this.goToSummit();
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

    private void goToPlains() {
        PlainsView plains = new PlainsView() {};
        plains.display();
    }

    private void goToJungle() {
        JungleView jungle = new JungleView() {};
        jungle.display();
    }

    private void goToDarkForest() {
        ForestView forest = new ForestView() {};
        forest.display();
    }

    private void goToHighMountain() {
        HighMountainView mount = new HighMountainView() {};
        mount.display();
    }

    private void showGameMenu() {
        GameMenuView menu = new GameMenuView();
        menu.display();
    }

    private void goToSummit() {
        SummitView sv = new SummitView();
        sv.display();
    }
    
}
