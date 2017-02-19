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
 * @author Gavin Siegel
 */
public class CharacterTrait implements Serializable {
    public String type;
    private double strength;
    private double wisdom;
    private double dexterity;
    private double health;
    private double mana;
    private double coordinateX;
    private double coordinateY;
    private double defenseValue;
public CharacterTrait() {
    }

    public double getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(double defenseValue) {
        this.defenseValue = defenseValue;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
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
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.type);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.wisdom) ^ (Double.doubleToLongBits(this.wisdom) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.dexterity) ^ (Double.doubleToLongBits(this.dexterity) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.mana) ^ (Double.doubleToLongBits(this.mana) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.coordinateX) ^ (Double.doubleToLongBits(this.coordinateX) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.coordinateY) ^ (Double.doubleToLongBits(this.coordinateY) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "CharacterTrait{" + "type=" + type + ", strength=" + strength + ", wisdom=" + wisdom + ", dexterity=" + dexterity + ", health=" + health + ", mana=" + mana + ", coordinateX=" + coordinateX + ", coordinateY=" + coordinateY + '}';
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
        if (Double.doubleToLongBits(this.coordinateX) != Double.doubleToLongBits(other.coordinateX)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coordinateY) != Double.doubleToLongBits(other.coordinateY)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    

   

   
   
    }
    

  
