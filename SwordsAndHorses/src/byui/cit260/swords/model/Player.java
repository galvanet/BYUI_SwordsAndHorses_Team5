package byui.cit260.swordsAndHorses.model;

import java.io.Serializable;
/**
 *
 * @author Gavin Siegel
 */
public class Player implements Serializable {
    private double name;
    private double progress;

 public Player() {
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
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
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.name) ^ (Double.doubleToLongBits(this.name) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.progress) ^ (Double.doubleToLongBits(this.progress) >>> 32));
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
        if (Double.doubleToLongBits(this.name) != Double.doubleToLongBits(other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.progress) != Double.doubleToLongBits(other.progress)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", progress=" + progress + '}';
    }
}

