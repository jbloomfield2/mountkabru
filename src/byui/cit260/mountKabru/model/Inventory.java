/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jacob bloomfield
 */
public class Inventory implements Serializable{
    
    private double shillings;
    private double xp;
    private ItemList itemlist;
    private ArrayList<Item> items = new ArrayList<>();

    public Inventory() {
    }

    public double getShillings() {
        return shillings;
    }

    public void setShillings(double shillings) {
        this.shillings = shillings;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public ItemList getItemlist() {
        return itemlist;
    }

    public void setItemlist(ItemList itemlist) {
        this.itemlist = itemlist;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.shillings) ^ (Double.doubleToLongBits(this.shillings) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.xp) ^ (Double.doubleToLongBits(this.xp) >>> 32));
        hash = 73 * hash + Objects.hashCode(this.items);
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.shillings) != Double.doubleToLongBits(other.shillings)) {
            return false;
        }
        if (Double.doubleToLongBits(this.xp) != Double.doubleToLongBits(other.xp)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "shillings=" + shillings + ", xp=" + xp + ", items=" + items + '}';
    }
    
            
    
}
