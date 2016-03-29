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
    
    private int day; //keep track of days passed in game
    private Actor actor;
    private Locations locations;
    private Player player;

    public Game() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    
    public Actor getActor() {
        return actor;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations Locations) {
        this.locations = Locations;
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
