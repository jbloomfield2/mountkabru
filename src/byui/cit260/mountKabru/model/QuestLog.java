/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.util.ArrayList;

/**
 *
 * @author Jacob Bloomfield
 */
public class QuestLog {
    
    private ArrayList<Quest> currentQuest = new ArrayList<>();
    private ArrayList<Quest> CompletedQuests = new ArrayList<>();

    public ArrayList<Quest> getCurrentQuest() {
        return currentQuest;
    }

    public void setCurrentQuest(ArrayList<Quest> currentQuest) {
        this.currentQuest = currentQuest;
    }

    public ArrayList<Quest> getCompletedQuests() {
        return CompletedQuests;
    }

    public void setCompletedQuests(ArrayList<Quest> CompletedQuests) {
        this.CompletedQuests = CompletedQuests;
    }

    @Override
    public String toString() {
        return "QuestLog{" + "currentQuest=" + currentQuest + ", CompletedQuests=" + CompletedQuests + '}';
    }
    
    
    
}
