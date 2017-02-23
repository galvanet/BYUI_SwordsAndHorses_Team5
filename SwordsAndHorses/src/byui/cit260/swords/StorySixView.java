/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

import byui.cit260.swordsAndHorses.control.GameControl;
import byui.cit260.swordsAndHorses.control.SceneControl;
import byui.cit260.swordsAndHorses.model.SwordsAndHorses;
import java.util.Scanner;

/**
 *
 * @author andre_000
 */
public class StorySixView {
    
    private String menu;
    
    private String story;
    private int red;
    private double blue;
    private double yellow;
    
    
    public StorySixView() {
        
        this.story = "\n"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n| Story #6 - Cabin in the Woods          |"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n A worn out cabin has smoke flowing from  "
                  + "\n its chimney. You can hear multiple voices"
                  + "\n chanting. This is a hide out for"
                  + "\n magicians."
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n PUZZLE"
                  + "\n Help the magicians with their painting."
                  + "\n They have a canvas that is 12in x 12in"
                  + "\n for a total area of 144 sq in."
                  + "\n They have 3 colors to paint with: Red,"
                  + "\n Blue, and Yellow. Red can only cover"
                  + "\n 5 sq in per gram. Blue covers 8 sq in"
                  + "\n per gram. Yellow covers 10 sq in per gram"
                  + "\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n How many grams of each color should they "
                  + "\n use to exactly cover the canvas?";
                
    }
    
    public void displayStorySix() {
        
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
        } while (!done);
                
        getRed();
        getBlue();
        getYellow();
                       
        SceneControl.calculatePaint(red, blue, yellow);
        
        //if (SceneControl.calculatePaint(red, blue, yellow) = 144 ) {
                
        //    puzzleResponse();
        
        //}
        
   
       
    
    }    
    
    
    private String getRed() {
        Scanner keyboard = new Scanner(System.in);
        String red = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.red);
            
            red = keyboard.nextLine();
           
            
            if (red.isEmpty()) {
                System.out.println("\nInvalid value: value cannot be empty");
                continue;
            }   
            
            break;           
        }
        
        return red;
    }
    
    private String getBlue() {
        Scanner keyboard = new Scanner(System.in);
        String blue = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.blue);
            
            blue = keyboard.nextLine();
           
            
            if (blue.isEmpty()) {
                System.out.println("\nInvalid value: value cannot be empty");
                continue;
            }   
            
            break;           
        }
        
        return blue;
    }
    
    private String getYellow() {
        Scanner keyboard = new Scanner(System.in);
        String yellow = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.yellow);
            
            yellow = keyboard.nextLine();
           
            
            if (yellow.isEmpty()) {
                System.out.println("\nInvalid value: value cannot be empty");
                continue;
            }   
            
            break;           
        }
        
        return yellow;
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            //System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }   
            
            break;           
        }
        
        return value;
    }

    
    
}

