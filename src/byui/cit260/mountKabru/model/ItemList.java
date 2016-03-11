/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.io.Serializable;

/**
 *
 * @author Jacob Bloomfield
 */
public enum ItemList implements Serializable {
    
    HealthPotion("Restores 10 hp"),
    GreaterHealthPotion("Restores 25 HP"),
    ManaPotion("Restores 10 mp"),
    GreaterManaPotion("Restores 25 hp");
    
    private final String DESCRIPTION;
    
    ItemList(String desc){
        this.DESCRIPTION = desc;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    @Override
    public String toString() {
        return "ItemList{" + "DESCRIPTION=" + DESCRIPTION + '}';
    }
    
    
}
