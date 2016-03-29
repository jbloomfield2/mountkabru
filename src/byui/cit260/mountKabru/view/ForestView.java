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
                + "\nP-Use Potion"
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void usePotion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showGameMenu() {
        GameMenuView menu = new GameMenuView();
        menu.display();
    }
}
