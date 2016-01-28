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
 * @author Andrew
 */
public class Ability implements Serializable{
    
    private String ablitiyName;
    private double resourceCost;
    private double damage;

    public Ability() {
    }

    public String getAblitiyName() {
        return ablitiyName;
    }

    public void setAblitiyName(String ablitiyName) {
        this.ablitiyName = ablitiyName;
    }

    public double getResourceCost() {
        return resourceCost;
    }

    public void setResourceCost(double resourceCost) {
        this.resourceCost = resourceCost;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.ablitiyName);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.resourceCost) ^ (Double.doubleToLongBits(this.resourceCost) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.damage) ^ (Double.doubleToLongBits(this.damage) >>> 32));
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
        final Ability other = (Ability) obj;
        if (Double.doubleToLongBits(this.resourceCost) != Double.doubleToLongBits(other.resourceCost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.damage) != Double.doubleToLongBits(other.damage)) {
            return false;
        }
        if (!Objects.equals(this.ablitiyName, other.ablitiyName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ability{" + "ablitiyName=" + ablitiyName + ", resourceCost=" + resourceCost + ", damage=" + damage + '}';
    }
    
    
    
}
