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
public enum Ability implements Serializable{
    
    Defend(),
    Focus(),
    Slash(),
    Spiral Cut(),
    Minor Heal(),
    Intimidate(),
    Fireball(),
    Lighting();
    
    private final double resourceCost;
    private final double damage;

    public Ability(Sting description) {
        this.description = description
        coordninates = new Point(1,1);
    }

    public double getResourceCost() {
        return resourceCost;
    }

    public double getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Ability{" + "ablitiyName=" + ablitiyName + ", resourceCost=" + resourceCost + ", damage=" + damage + '}';
    }
    
    
    
}
