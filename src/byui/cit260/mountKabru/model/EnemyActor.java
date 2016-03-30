/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

/**
 *
 * @author jacob bloomfield
 */
public class EnemyActor {
    private Stats stats;
    private String name;

    public EnemyActor() {
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EnemyActor{" + "stats=" + stats + ", name=" + name + '}';
    }
    
    
}
