/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jacob Bloomfield
 */
public class QuestLog implements Serializable{
    
public String questDetails;
public double rewardXp;
public double rewardShillings;
public int progress;//progress toward objective
public int objective;//number of required actions

    public QuestLog() {
    }

    @Override
    public String toString() {
        return "QuestLog{" + "questDetails=" + questDetails + ", rewardXp=" + rewardXp + ", rewardShillings=" + rewardShillings + ", progress=" + progress + ", objective=" + objective + '}';
    }



    public String getQuestDetails() {
        return questDetails;
    }

    public void setQuestDetails(String questDetails) {
        this.questDetails = questDetails;
    }

    public double getRewardXp() {
        return rewardXp;
    }

    public void setRewardXp(double rewardXp) {
        this.rewardXp = rewardXp;
    }

    public double getRewardShillings() {
        return rewardShillings;
    }

    public void setRewardShillings(double rewardShillings) {
        this.rewardShillings = rewardShillings;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getObjective() {
        return objective;
    }

    public void setObjective(int objective) {
        this.objective = objective;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.questDetails);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.rewardXp) ^ (Double.doubleToLongBits(this.rewardXp) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.rewardShillings) ^ (Double.doubleToLongBits(this.rewardShillings) >>> 32));
        hash = 53 * hash + this.progress;
        hash = 53 * hash + this.objective;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestLog other = (QuestLog) obj;
        if (Double.doubleToLongBits(this.rewardXp) != Double.doubleToLongBits(other.rewardXp)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rewardShillings) != Double.doubleToLongBits(other.rewardShillings)) {
            return false;
        }
        if (this.progress != other.progress) {
            return false;
        }
        if (this.objective != other.objective) {
            return false;
        }
        if (!Objects.equals(this.questDetails, other.questDetails)) {
            return false;
        }
        return true;
        
    }




    

    
    
    
    
}
