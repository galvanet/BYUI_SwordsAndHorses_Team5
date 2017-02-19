/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre_000
 */
public class SceneControlTest {
    
    public SceneControlTest() {
    }

    /**
     * Test of calculatePaint method, of class SceneControl.
     */
    @Test
    public void testCalculatePaint() {
        System.out.println("calculatePaint");
        double redAmount = 0.0;
        double blueAmount = 0.0;
        double yellowAmount = 0.0;
        double expResult = 144.0;
        double result = SceneControl.calculatePaint(redAmount, blueAmount, yellowAmount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    public void testCalculatePaintOne() {
        System.out.println("Test Case #1");
        double redAmount = 3.0;
        double blueAmount = 4.0;
        double yellowAmount = 5.0;
        double expResult = 47.0;
        double result = SceneControl.calculatePaint(redAmount, blueAmount, yellowAmount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    public void testCalculatePaintTwo() {
        System.out.println("Test Case #2");
        double redAmount = 5.0;
        double blueAmount = 5.0;
        double yellowAmount = 5.0;
        double expResult = 29.0;
        double result = SceneControl.calculatePaint(redAmount, blueAmount, yellowAmount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    public void testCalculatePaintThree() {
        System.out.println("Test Case #3");
        double redAmount = 2.0;
        double blueAmount = 8.0;
        double yellowAmount = 9.0;
        double expResult = -20.0;
        double result = SceneControl.calculatePaint(redAmount, blueAmount, yellowAmount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    public void testCalculatePaintFour() {
        System.out.println("Test Case #4");
        double redAmount = 12.0;
        double blueAmount = 134.0;
        double yellowAmount = 45.0;
        double expResult = -1438.0;
        double result = SceneControl.calculatePaint(redAmount, blueAmount, yellowAmount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    public void testCalculatePaintFive() {
        System.out.println("Test Case #5");
        double redAmount = 5.0;
        double blueAmount = 2.0;
        double yellowAmount = 1.0;
        double expResult = 93.0;
        double result = SceneControl.calculatePaint(redAmount, blueAmount, yellowAmount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    public void testCalculatePaintSix() {
        System.out.println("Test Case #6");
        double redAmount = 0.0;
        double blueAmount = 0.0;
        double yellowAmount = 0.0;
        double expResult = 144.0;
        double result = SceneControl.calculatePaint(redAmount, blueAmount, yellowAmount);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getStorySelection method, of class SceneControl.
     */
    @Test
    public void testGetStorySelection() {
        System.out.println("getStorySelection");
        int optionNumber = 0;
        int expResult = 0;
        int result = SceneControl.getStorySelection(optionNumber);
        assertEquals(expResult, result);
        
    }
    
    public void testGetStorySelectionOne() {
        System.out.println("getStorySelection");
        int optionNumber = 1;
        int expResult = 0;
        int result = SceneControl.getStorySelection(optionNumber);
        assertEquals(expResult, result);
        
    }
    
    public void testGetStorySelectionTwo() {
        System.out.println("getStorySelection");
        int optionNumber = 2;
        int expResult = 0;
        int result = SceneControl.getStorySelection(optionNumber);
        assertEquals(expResult, result);
        
    }
    
    public void testGetStorySelectionThree() {
        System.out.println("getStorySelection");
        int optionNumber = 3;
        int expResult = 0;
        int result = SceneControl.getStorySelection(optionNumber);
        assertEquals(expResult, result);
        
    }
    
    public void testGetStorySelectionFour() {
        System.out.println("getStorySelection");
        int optionNumber = 4;
        int expResult = 0;
        int result = SceneControl.getStorySelection(optionNumber);
        assertEquals(expResult, result);
        
    }
    
    public void testGetStorySelectionFive() {
        System.out.println("getStorySelection");
        int optionNumber = -1;
        int expResult = 0;
        int result = SceneControl.getStorySelection(optionNumber);
        assertEquals(expResult, result);
        
    }
}
