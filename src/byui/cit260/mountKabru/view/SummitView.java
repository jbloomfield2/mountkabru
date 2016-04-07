/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.EnemyActor;
import byui.cit260.mountKabru.model.Game;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
class SummitView extends View{
    
    Game game = MountKabru.getCurrentGame();

    public SummitView() {
        super("\nAt the mountains summit, in a small cave is the lair of the mysterious master who"
                + "\ncreated all these monsters. he eagerly accepts your challenge.'you fool', he says,"
                + "'\nyou cannot stop me!"
                + "\nAre you Ready to challenge me?"
                + "\nY - Begin fight"
                + "\nQ - Leave for now");
    }
    
        @Override
    public boolean doAction(String input){
        
        String choice = input.toUpperCase();//convert choice to upper case
        
        switch(choice){
            case "Y":{
                this.bossbattle();
                break;
            }
                    
        }
        return false;
    }

    private void bossbattle() {
        EnemyActor[] enemies = game.getLocations().getMonsterType();
        EnemyActor boss = enemies[game.getActor().getActorList().MysteriousMaster.ordinal()];
        BattleView bv = new BattleView(boss);
        bv.display();
        
    }
}
