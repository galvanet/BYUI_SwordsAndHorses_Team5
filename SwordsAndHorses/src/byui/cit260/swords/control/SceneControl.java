/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.control;

/**
 *
 * @author andre_000
 */
public class SceneControl {
    
    
    public static double calculatePaint(double redAmount, double blueAmount, double yellowAmount) {
        
        int redCoverage = 5;
        int blueCoverage = 8;
        int yellowCoverage = 10;
        int canvasArea = 144;
              
        
        double runningTotal = (redAmount*redCoverage)+(blueAmount*blueCoverage)+(yellowAmount*yellowCoverage);
        double paintNeeded = canvasArea - runningTotal;
        
        return paintNeeded;
        
                
        
    }
    
}
