/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swords.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justen
 */
public class CombatFuncTest {
    
    public CombatFuncTest() {
    }

    /**
     * Test of CombatFunc method, of class CombatFunc.
     */
    @Test
    public void testCombatFunc() {
        System.out.println("CombatFunc");
        double attributeBonus = 2.0;
        double attackBonus = 3.0;
        double defenseValue = 20.0;
        CombatFunc instance = new CombatFunc();
        boolean expResult = false;
        boolean result = instance.CombatFunc(attributeBonus, attackBonus, defenseValue);
        assertEquals(expResult, result);
       
        
    }
    
}
