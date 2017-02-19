/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.byui.swordsAndHorses.control;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eduardo y Sandra
 */
public class PuzzlesTest {
    
    public PuzzlesTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcTowerArea method, of class Puzzles.
     */
    @Test
    public void testCalcTowerArea() {
        System.out.println("calcTowerArea");
        int Constant = 0;
        Object PI = null;
        double diameter = 0.0;
        double height = 0.0;
        Puzzles instance = new Puzzles();
        double expResult = 0.0;
        double result = instance.calcTowerArea(Constant, diameter, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
