/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.control;

import java.util.Scanner;

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
  
        if (redAmount >=12) {
            System.out.println("Please use less paint.");
        } else if (redAmount <0){
            System.out.println("Please use positive numbers.");
        }
        
        if (blueAmount >=13) {
            System.out.println("Please use less paint.");
        } else if (blueAmount <0){
            System.out.println("Please use positive numbers.");
        }
            
        if (yellowAmount >=8) {
            System.out.println("Please use less paint.");
        } else if (yellowAmount <0){
            System.out.println("Please use positive numbers.");
        }            
                
        
        double runningTotal = (redAmount*redCoverage)+(blueAmount*blueCoverage)+(yellowAmount*yellowCoverage);
        double paintNeeded = canvasArea - runningTotal;
        
        
        return paintNeeded;
        
        
    }

    public static int getStorySelection(int optionNumber) {
        
            
            String userInput;
            
            //modify code here to receive input from the user
            userInput = "4";
        
            if (userInput == "1"){
                optionNumber = 1;
            } else if (userInput == "2"){
                optionNumber = 2;
            } else if (userInput == "3"){
                optionNumber = 3;
            } else {
                System.out.println("Please enter a number 1, 2, or 3 to continue.");
            }
        
            return optionNumber;
            
           
        
    }
    
    
    
    
    
   
}
