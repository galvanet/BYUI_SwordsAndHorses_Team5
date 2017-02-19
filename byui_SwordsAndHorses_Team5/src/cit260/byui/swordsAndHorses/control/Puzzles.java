/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.byui.swordsAndHorses.control;

/**
 *
 * @author Eduardo y Sandra
 */
import static java.lang.Math.PI;
public class Puzzles {
    
    public double calcTowerArea(int Constant, double diameter, double height){
    
    if (Constant != 2){
    return  "Constant must be 2"
    }
    if (Math.PI != 3.1416){
    return “Pi value is 3.1416”
    }

    if (radius < 5){
    return “Radius is the middle of diameter”
    }

    double radius = diameter / 2;

    double towerArea=(2 * Math.PI) * radius * (radius + heigth);
    return towerArea;

    }
}          

}
