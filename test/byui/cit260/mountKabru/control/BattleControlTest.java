/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }

    /**
     * Test of attack method, of class BattleControl.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        int atk = 15;
        int atkBonus = 8;
        int def = 9;
        BattleControl instance = new BattleControl();
        int expResult = 14;
        int result = instance.attack(atk, atkBonus, def);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of spell method, of class BattleControl.
     */
    @Test
    public void testSpell() {
        System.out.println("Test 1");
        int mana = 5;
        int manaBonus = 4;
        int def = 3;
        BattleControl instance = new BattleControl();
        int expResult = 6;
        int result = instance.spell(mana, manaBonus, def);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test 2");
        mana = 3;
        manaBonus = 4;
        def = 3;
        expResult = 4;
        result = instance.spell(mana, manaBonus, def);
        assertEquals(expResult, result);
        
        System.out.println("Test 3");
        mana = 1;
        manaBonus = 0;
        def = 2;
        expResult = -1;
        result = instance.spell(mana, manaBonus, def);
        assertEquals(expResult, result);
        
        System.out.println("Test 4");
        mana = 30;
        manaBonus = 30;
        def = 10;
        expResult = 50;
        result = instance.spell(mana, manaBonus, def);
        assertEquals(expResult, result);
        
        System.out.println("Test 5");
        mana = 30;
        manaBonus = 40;
        def = 10;
        expResult = 60;
        result = instance.spell(mana, manaBonus, def);
        assertEquals(expResult, result);
        
        System.out.println("Test 6");
        mana = 4;
        manaBonus = 4;
        def = 10;
        expResult = 0;
        result = instance.spell(mana, manaBonus, def);
        assertEquals(expResult, result);
    }
    
}
