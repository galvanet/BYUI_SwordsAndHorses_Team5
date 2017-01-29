/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swords.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Justen
 */
public class Scene implements Serializable{
    private String description;
    private int passable;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPassable() {
        return passable;
    }

    public void setPassable(int passable) {
        this.passable = passable;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.passable;
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", passable=" + passable + '}';
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
        final Scene other = (Scene) obj;
        if (this.passable != other.passable) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
