/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author jacob bloomfield
 */
public class Quest implements Serializable {
    
    private String questName;
    private String questDetails;
    private String progress;
    private String reward;

    public Quest() {
    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public String getQuestDetails() {
        return questDetails;
    }

    public void setQuestDetails(String questDetails) {
        this.questDetails = questDetails;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.questName);
        hash = 79 * hash + Objects.hashCode(this.questDetails);
        hash = 79 * hash + Objects.hashCode(this.progress);
        hash = 79 * hash + Objects.hashCode(this.reward);
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
        final Quest other = (Quest) obj;
        if (!Objects.equals(this.questName, other.questName)) {
            return false;
        }
        if (!Objects.equals(this.questDetails, other.questDetails)) {
            return false;
        }
        if (!Objects.equals(this.progress, other.progress)) {
            return false;
        }
        if (!Objects.equals(this.reward, other.reward)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quest{" + "questName=" + questName + ", questDetails=" + questDetails + ", progress=" + progress + ", reward=" + reward + '}';
    }

   
    
    
}
