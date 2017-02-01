/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swords.model;

import java.io.Serializable;

/**
 *
 * @author Gavin Siegel
 */
public class CharacterTrait implements Serializable {
    private double type;
    private double strength;
    private double wisdom;
    private double dexterity;
    private double health;
    private double mana;
    private double coordinatesX;
    private double coordinatesY;

 public CharacterTrait() {
    }
    
    

    public double getType() {
        return type;
    }
    public void setType(double type) {
        this.type = type;
    }
    public double getStrength() {
        return strength;
    }
    public void setStrength(double strength) {
        this.strength = strength;
    }
    public double getWisdom() {
        return wisdom;
    }
    public void setWisdom(double wisdom) {
        this.wisdom = wisdom;
    }
    public double getDexterity() {
        return dexterity;
    }
    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public double getMana() {
        return mana;
    }
    public void setMana(double mana) {
        this.mana = mana;

    public double getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(double coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public double getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(double coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.type) ^ (Double.doubleToLongBits(this.type) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.wisdom) ^ (Double.doubleToLongBits(this.wisdom) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.dexterity) ^ (Double.doubleToLongBits(this.dexterity) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.mana) ^ (Double.doubleToLongBits(this.mana) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.coordinatesX) ^ (Double.doubleToLongBits(this.coordinatesX) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.coordinatesY) ^ (Double.doubleToLongBits(this.coordinatesY) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "CharacterTrait{" + "type=" + type + ", strength=" + strength + ", wisdom=" + wisdom + ", dexterity=" + dexterity + ", health=" + health + ", mana=" + mana + ", coordinatesX=" + coordinatesX + ", coordinatesY=" + coordinatesY + '}';
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
        final CharacterTrait other = (CharacterTrait) obj;
        if (Double.doubleToLongBits(this.type) != Double.doubleToLongBits(other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.wisdom) != Double.doubleToLongBits(other.wisdom)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dexterity) != Double.doubleToLongBits(other.dexterity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mana) != Double.doubleToLongBits(other.mana)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coordinatesX) != Double.doubleToLongBits(other.coordinatesX)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coordinatesY) != Double.doubleToLongBits(other.coordinatesY)) {
            return false;
        }
        return true;
    }
    

  
