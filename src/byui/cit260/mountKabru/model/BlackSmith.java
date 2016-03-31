/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.io.Serializable;
/**
 *
 * @author Andrew
 */
public class BlackSmith implements Serializable{
    
    private double armorBonus;
    private double weaponBonus;

    public BlackSmith() {
        
    }

    public double getArmorBonus() {
        return armorBonus;
    }

    public void setArmorBonus(double armorBonus) {
        this.armorBonus = armorBonus;
    }

    public double getWeaponBonus() {
        return weaponBonus;
    }

    public void setWeaponBonus(double weaponBonus) {
        this.weaponBonus = weaponBonus;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.armorBonus) ^ (Double.doubleToLongBits(this.armorBonus) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.weaponBonus) ^ (Double.doubleToLongBits(this.weaponBonus) >>> 32));
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
        final BlackSmith other = (BlackSmith) obj;
        if (Double.doubleToLongBits(this.armorBonus) != Double.doubleToLongBits(other.armorBonus)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weaponBonus) != Double.doubleToLongBits(other.weaponBonus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BlackSmith{" + "armorBonus=" + armorBonus + ", weaponBonus=" + weaponBonus + '}';
    }
    
    
    
}
