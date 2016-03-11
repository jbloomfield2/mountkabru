/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jacob bloomfield
 */
public class Game implements Serializable {
    
    private Actor actor;
    private ArrayList<Locations> Locations = new ArrayList<>();
    

    public Game() {
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public ArrayList<Locations> getLocations() {
        return Locations;
    }

    public void setLocations(ArrayList<Locations> Locations) {
        this.Locations = Locations;
    }

    

    
    @Override
    public String toString() {
        return "Game{" + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
