/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.util.Objects;

/**
 *
 * @author jacob bloomfield
 */
public enum Item implements Serializable {
    
    Health Potion();
    
    private final int quantity;
    private final int value;

    public Item(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public int getQuantity() {
        return quantity;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" + "itemType=" + itemType + ", quantity=" + quantity + ", value=" + value + '}';
    }
    
    
}
