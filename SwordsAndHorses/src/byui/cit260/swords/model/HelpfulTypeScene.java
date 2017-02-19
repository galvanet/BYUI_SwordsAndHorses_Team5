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
public class HelpfulTypeScene extends Scene implements Serializable{
    private boolean randomBonus;

    public HelpfulTypeScene(boolean giveItem) {
        this.randomBonus = giveItem;
    }

    
    public boolean isRandomBonus() {
        return randomBonus;
    }

    public void setRandomBonus(boolean randomBonus) {
        this.randomBonus = randomBonus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (this.randomBonus ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "HelpfulTypeScene{" + "giveItem=" + randomBonus + '}';
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
        final HelpfulTypeScene other = (HelpfulTypeScene) obj;
        if (this.randomBonus != other.randomBonus) {
            return false;
        }
        return true;
    }
    
    
    
}
