/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swords.model;

import java.io.Serializable;

/**
 *
 * @author Justen
 */
public class Map implements Serializable{
    private int hexRow;
    private int hexColumn;

    public Map() {
    }

    
    
    public int getHexRow() {
        return hexRow;
    }

    public void setHexRow(int hexRow) {
        this.hexRow = hexRow;
    }

    public int getHexColumn() {
        return hexColumn;
    }

    public void setHexColumn(int hexColumn) {
        this.hexColumn = hexColumn;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.hexRow;
        hash = 41 * hash + this.hexColumn;
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
        final Map other = (Map) obj;
        if (this.hexRow != other.hexRow) {
            return false;
        }
        if (this.hexColumn != other.hexColumn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "hexRow=" + hexRow + ", hexColumn=" + hexColumn + '}';
    }
    
    
}
