/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;
import java.io.Serializable;
/**
 *
 * @author jacob bloomfield
 */
public class Stats implements Serializable {
    private double attack;
    private double defence;
    private double mana;
    private double health;
    private double maxHealth;
    private double maxMana;
    private int level;

    public Stats() {
    }

    public Stats(double attack, double defence, double health) {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
    }
    
    

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxhealth) {
        this.maxHealth = maxhealth;
        
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(double maxMana) {
        this.maxMana = maxMana;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.attack) ^ (Double.doubleToLongBits(this.attack) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.defence) ^ (Double.doubleToLongBits(this.defence) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.mana) ^ (Double.doubleToLongBits(this.mana) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
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
        final Stats other = (Stats) obj;
        if (Double.doubleToLongBits(this.attack) != Double.doubleToLongBits(other.attack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defence) != Double.doubleToLongBits(other.defence)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mana) != Double.doubleToLongBits(other.mana)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stats{" + "attack=" + attack + ", defence=" + defence + ", mana=" + mana + ", health=" + health + '}';
    }
    
    
}
