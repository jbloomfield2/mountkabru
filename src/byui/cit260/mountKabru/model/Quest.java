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
    
    private String quests;
    private String acceptedQuests;
    private String completed;
    private String reward;

    public Quest() {
    }

    public String getQuests() {
        return quests;
    }

    public void setQuests(String quests) {
        this.quests = quests;
    }

    public String getAcceptedQuests() {
        return acceptedQuests;
    }

    public void setAcceptedQuests(String acceptedQuests) {
        this.acceptedQuests = acceptedQuests;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.quests);
        hash = 89 * hash + Objects.hashCode(this.acceptedQuests);
        hash = 89 * hash + Objects.hashCode(this.completed);
        hash = 89 * hash + Objects.hashCode(this.reward);
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
        if (!Objects.equals(this.quests, other.quests)) {
            return false;
        }
        if (!Objects.equals(this.acceptedQuests, other.acceptedQuests)) {
            return false;
        }
        if (!Objects.equals(this.completed, other.completed)) {
            return false;
        }
        if (!Objects.equals(this.reward, other.reward)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quest{" + "quests=" + quests + ", acceptedQuests=" + acceptedQuests + ", completed=" + completed + ", reward=" + reward + '}';
    }
    
    
}
