/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

/**
 *
 * @author jacob bloomfield
 */
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.QuestList;
import java.util.ArrayList;
import byui.cit260.mountKabru.model.QuestLog;
import mountkabru.MountKabru;
public class QuestControl {
    
    Game game = MountKabru.getCurrentGame();
    
    public static ArrayList<QuestLog> createQuests(){
        ArrayList<QuestLog> quests = new ArrayList<>();
        for (QuestList q: QuestList.values()){
            QuestLog currentQuest = new QuestLog();
            currentQuest.setQuestDetails(q.getQUESTDETAILS());
            currentQuest.setObjective(q.getObjective());
            currentQuest.setProgress(0);
            currentQuest.setRewardShillings(q.getREWARDSHILLINGS());
            currentQuest.setRewardXp(q.getREWARDXP());
            quests.add(currentQuest);
        }
        return quests;
    }
    
    public void updateQuest(String questDesc){
        for (QuestLog q: game.getActor().getQuest()){
            if (q.getQuestDetails() == questDesc){
                q.setProgress(q.getProgress()+1);
                if (q.getProgress() > q.getObjective())
                    q.setProgress(q.getObjective());
            }
        }
    }
        
       public void completeQuest(){
           for (QuestLog q: game.getActor().getQuest()){
               if (q.getProgress() == q.getObjective()){
                   game.getActor().getInventory().setShillings(game.getActor().getInventory().getShillings()+q.getRewardShillings());
                   game.getActor().getInventory().setXp(game.getActor().getInventory().getXp() + q.rewardXp);
                   game.getActor().getQuest().remove(q);
                   break;
               }
           }
           
       }
            
    }

