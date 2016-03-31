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
 * @author Andrew
 */
import java.util.Objects;/**
 *
 * @author Andrew
 */
public class Locations implements Serializable{
    
    private String areaName;
    private EnemyActor[] monsterType = new EnemyActor[16];
    private String areaNumber;
    private Scene[] scenes = new Scene[8];
    private BlackSmith blacksmith = new BlackSmith();
    private Tavern tavern = new Tavern();
    private ThePit thePit = new ThePit();

    public Locations() {
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public EnemyActor[] getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(EnemyActor[] Monstertype) {
        this.monsterType = Monstertype;
    }

    public BlackSmith getBlacksmith() {
        return blacksmith;
    }

    public void setBlacksmith(BlackSmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    public Tavern getTavern() {
        return tavern;
    }

    public void setTavern(Tavern tavern) {
        this.tavern = tavern;
    }

    public ThePit getThePit() {
        return thePit;
    }

    public void setThePit(ThePit thePit) {
        this.thePit = thePit;
    }



    public String getAreaNumber() {
        return areaNumber;
    }

    public void setAreaNumber(String areaNumber) {
        this.areaNumber = areaNumber;
    }

    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.areaName);
        hash = 67 * hash + Objects.hashCode(this.monsterType);
        hash = 67 * hash + Objects.hashCode(this.areaNumber);
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
        final Locations other = (Locations) obj;
        if (!Objects.equals(this.areaName, other.areaName)) {
            return false;
        }
        if (!Objects.equals(this.monsterType, other.monsterType)) {
            return false;
        }
        if (!Objects.equals(this.areaNumber, other.areaNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Locations{" + "areaName=" + areaName + ", monsterType=" + monsterType + ", areaNumber=" + areaNumber + '}';
    }

    public void setName(String mount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
