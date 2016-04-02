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
public class ThePit implements Serializable{
    
    private String title;
    private double trainingLimit;
    private double timesTrained;

    public ThePit() {
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getTimesTrained() {
        return timesTrained;
    }

    public void setTimesTrained(double timesTrained) {
        this.timesTrained = timesTrained;
    }

    public double getTrainingLimit() {
        return trainingLimit;
    }

    public void setTrainingLimit(double trainingLimit) {
        this.trainingLimit = trainingLimit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.trainingLimit) ^ (Double.doubleToLongBits(this.trainingLimit) >>> 32));
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
        final ThePit other = (ThePit) obj;
        if (Double.doubleToLongBits(this.trainingLimit) != Double.doubleToLongBits(other.trainingLimit)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ThePit{" + "title=" + title + ", trainingLimit=" + trainingLimit + '}';
    }
    
    
    
}
