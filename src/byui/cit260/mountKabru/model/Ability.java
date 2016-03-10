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
    
    Defend(0,0),
    Focus(0,0),
    Slash(3,10),
    SpiralCut(4,15),
    MinorHeal(2,0),
    Intimidate(3,0),
    Fireball(2,15),
    Lighting(3,25);
    
    private final double resourceCost;
    private final double damage;

    Ability(double resCost, double dmg) {
        this.resourceCost = resCost;
        this.damage = dmg;
        
    }

    public double getResourceCost() {
        return resourceCost;
    }

    public double getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Ability{" + ", resourceCost=" + resourceCost + ", damage=" + damage + '}';
    }
    
    
    
}
