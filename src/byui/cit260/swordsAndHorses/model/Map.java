/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SH_model_layer;

import java.io.Serializable;

/**
 *
 * @author Justen
 */
public class Map implements Serializable {
    private double hexRow;
    private double hexColumn;

    public Map() {
    }
    
    

    public double getHexRow() {
        return hexRow;
    }

    public void setHexRow(double hexRow) {
        this.hexRow = hexRow;
    }

    public double getHexColumn() {
        return hexColumn;
    }

    public void setHexColumn(double hexColumn) {
        this.hexColumn = hexColumn;
    
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.hexRow) ^ (Double.doubleToLongBits(this.hexRow) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.hexColumn) ^ (Double.doubleToLongBits(this.hexColumn) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "hexRow=" + hexRow + ", hexColumn=" + hexColumn + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.hexRow) != Double.doubleToLongBits(other.hexRow)) {
            return false;
        }
        return true;
    }
    
    
}
