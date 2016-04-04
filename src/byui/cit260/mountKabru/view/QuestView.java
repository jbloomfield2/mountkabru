/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.QuestControl;
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.QuestLog;
import mountkabru.MountKabru;

/**
 *
 * @author jacob bloomfield
 */
class QuestView extends View {
Game game = MountKabru.getCurrentGame();
    public QuestView() {
        super("enter a choice"
                + "\nC - complete quests and retrieve reward"
                + "\nQ - go back");
        this.updateDisplay();
    }
    
     @Override
    public boolean doAction(String input){
       input = input.toUpperCase();
       
       switch(input){
           
           case "C":{
               this.completeQuest();
               this.updateDisplay();
               return true;
           }
               
               
           
       }
        
        
        return false;
    }

    private void completeQuest() {
        QuestControl qc = new QuestControl();
        qc.completeQuest();
    }

    private void updateDisplay() {
        this.console.println("Your quests are listed below:");
       this.console.println("\n\nDescription\t Progress\t Rewards\n");
       for (QuestLog q:game.getActor().getQuest()){
           this.console.println(q.getQuestDetails() + "\t" + q.getProgress() + "/" + q.getObjective() + "\t"
           + q.getRewardXp() + " xp " + q.getRewardShillings() + " shillings");
       }
    }

    
}
