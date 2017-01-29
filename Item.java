/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.model;

import java.io.Serializable;

/**
 *
 * @author andre_000
 */
public class Item implements Serializable{
    
    private double cost;
    private double inventorySpace;

    public Item() {
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getInventorySpace() {
        return inventorySpace;
    }

    public void setInventorySpace(double inventorySpace) {
        this.inventorySpace = inventorySpace;
    }

    @Override
    public String toString() {
        return "Item{" + "cost=" + cost + ", inventorySpace=" + inventorySpace + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.inventorySpace) ^ (Double.doubleToLongBits(this.inventorySpace) >>> 32));
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.inventorySpace) != Double.doubleToLongBits(other.inventorySpace)) {
            return false;
        }
        return true;
    }
    
    
    
    
           
    
    
}
