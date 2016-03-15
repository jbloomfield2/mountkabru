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
    
    HealthPotion("Restores 10 hp",10),
    GreaterHealthPotion("Restores 25 HP",25),
    ManaPotion("Restores 10 mp",10),
    GreaterManaPotion("Restores 25 hp",25);
    
    private final String DESCRIPTION;
    private final double VALUE;
    
    ItemList(String desc, double value){
        this.DESCRIPTION = desc;
        this.VALUE = value;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    @Override
    public String toString() {
        return "ItemList{" + "DESCRIPTION=" + DESCRIPTION + '}';
    }
    
    
}
