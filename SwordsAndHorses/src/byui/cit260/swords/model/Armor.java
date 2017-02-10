/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swords.model;

import java.io.Serializable;

/**
 *
 * @author andre_000
 */
public class Armor implements Serializable{
    
    //class instance variables
    private double defenseBonus;

    public Armor() {
    }

    public double getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(double defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    @Override
    public String toString() {
        return "Armor{" + "defenseBonus=" + defenseBonus + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.defenseBonus) ^ (Double.doubleToLongBits(this.defenseBonus) >>> 32));
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
        final Armor other = (Armor) obj;
        if (Double.doubleToLongBits(this.defenseBonus) != Double.doubleToLongBits(other.defenseBonus)) {
            return false;
        }
        return true;
    }
    
    
        
    
    
}
