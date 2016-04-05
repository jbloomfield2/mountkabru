/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.StatsControl;

/**
 *
 * @author farcry15
 */
class TrainView extends View{

    public TrainView() {
        super("\n"
            + "\n============================================="
            + "\nChoose which attribute to train:"
            + "\n============================================="
            + "\n= A.)Increase attack by one                 ="
            + "\n= D.)Increase defense by one                ="
            + "\n= M.)Increase maximum mana by 5             ="
            + "\n= H.)Increase Maximum health by 5           ="
            + "\n= G.)View game menu                         ="
            + "\n= Q.)Return to previous menu                ="
            + "\n=============================================");
    }
    
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();

        switch (value){
            case "A":
                this.trainAttack();
                return true;
            case "D":
                this.trainDefense();
                return true;
            case "M":
                this.trainMana();
                return true;
            case "H":
                this.trainHealth();
                return true;
            case "G":
                GameMenuView gmv = new GameMenuView();
                gmv.display();
                break;
            
            default:
                this.console.println("invalid choice selected! please try again");
                break;      
        }
        
        return false;
        }

    private void trainAttack() {
        StatsControl.trainAttack();
        this.console.println("attack increased by 1");
    }

    private void trainDefense() {
        StatsControl.trainDefense();
        this.console.println("defense increased by 1");
    }

    private void trainMana() {
        StatsControl.trainMana();
        this.console.println("mana increased by 5");
    }

    private void trainHealth() {
        StatsControl.trainHealth();
        this.console.println("health increased by 5");
    }
    
    
}
