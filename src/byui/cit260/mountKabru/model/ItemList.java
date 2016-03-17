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
    
    HealthPotion("Health potion\t","Restores 10 hp",10),
    GreaterHealthPotion("Greater Health potion","Restores 25 HP",25),
    ManaPotion("Mana potion\t","Restores 10 mp",10),
    GreaterManaPotion("Greater mana potion","Restores 25 hp",25);
    
    private final String DESCRIPTION;
    private final double VALUE;
    private final String ITEMTYPE;
    
    ItemList(String type,String desc, double value){
        this.DESCRIPTION = desc;
        this.VALUE = value;
        this.ITEMTYPE = type;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public double getVALUE() {
        return VALUE;
    }

    public String getITEMTYPE() {
        return ITEMTYPE;
    }
    

    @Override
    public String toString() {
        return "ItemList{" + "DESCRIPTION=" + DESCRIPTION + '}';
    }
    
    
}
