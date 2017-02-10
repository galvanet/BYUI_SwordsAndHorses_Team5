/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swords.model;

/**
 *
 * @author Justen
 */
public class Inventory {
   private int spaces;
   private int gold;

    public Inventory() {
    }

   
   
    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.spaces;
        hash = 47 * hash + this.gold;
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "spaces=" + spaces + ", gold=" + gold + '}';
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
        final Inventory other = (Inventory) obj;
        if (this.spaces != other.spaces) {
            return false;
        }
        if (this.gold != other.gold) {
            return false;
        }
        return true;
    }
   
   
    
}
