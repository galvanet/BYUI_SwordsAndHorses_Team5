/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.byui.swordsAndHorses.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Eduardo y Sandra
 */
public class Player implements Serializable{
    //class instance variables
    private String name;
    private double bestTIme;

    public Player() {
    }

    
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTIme() {
        return bestTIme;
    }

    public void setBestTIme(double bestTIme) {
        this.bestTIme = bestTIme;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.bestTIme) ^ (Double.doubleToLongBits(this.bestTIme) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTIme=" + bestTIme + '}';
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
        final Player other = (Player) obj;
        return Double.doubleToLongBits(this.bestTIme) == Double.doubleToLongBits(other.bestTIme);
    }

    public void setBestTime(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
