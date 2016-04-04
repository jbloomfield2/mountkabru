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
 * @author Andrew
 */
public class Tavern implements Serializable{
    
    private String ownerResponses;
    ArrayList<QuestLog> quests = new ArrayList<>();

    public Tavern() {
        
    }

    public String getOwnerResponses() {
        return ownerResponses;
    }

    public void setOwnerResponses(String ownerResponses) {
        this.ownerResponses = ownerResponses;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.ownerResponses);
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
        final Tavern other = (Tavern) obj;
        if (!Objects.equals(this.ownerResponses, other.ownerResponses)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tavern{" + "ownerResponses=" + ownerResponses + '}';
    }
    
    
    
}
