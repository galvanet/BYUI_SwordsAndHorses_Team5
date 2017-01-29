package byui.cit260.swords.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Gavin Siegel
 */
public class Player implements Serializable {
    private String name;
    private double progress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.progress) ^ (Double.doubleToLongBits(this.progress) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.progress) != Double.doubleToLongBits(other.progress)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

 

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", progress=" + progress + '}';
    }
}

