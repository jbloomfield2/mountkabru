/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacob bloomfield
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of attack method, of class BattleControl.
     */
    @Test
    public void testAttack() {
        System.out.println("test case 1");
        int atk = 15; 
        int atkBonus = 8;
        int def = 9;
        BattleControl instance = new BattleControl();
        int expResult = 14;
        int result = instance.attack(atk, atkBonus, def);
        assertEquals(expResult,result);
        
        System.out.println("test case 2");
        atk = 10; 
        atkBonus = 3;
        def = 16;
        expResult = 0;
        result = instance.attack(atk, atkBonus, def);
        assertEquals(expResult,result);
        
        System.out.println("test case 3");
        atk = 55; 
        atkBonus = 15;
        def = 25;
        expResult = 50;
        result = instance.attack(atk, atkBonus, def);
        assertEquals(expResult,result);
        
        System.out.println("test case 4");
        atk = 12; 
        atkBonus = 3;
        def = 0;
        expResult = -1;
        result = instance.attack(atk, atkBonus, def);
        assertEquals(expResult,result);

        System.out.println("test case 5");
        atk = 1; 
        atkBonus = 50;
        def = 1;
        expResult = 50;
        result = instance.attack(atk, atkBonus, def);
        assertEquals(expResult,result);
        
        
        System.out.println("test case 6");
        atk = 50; 
        atkBonus = 1;
        def = 50;
        expResult = 1;
        result = instance.attack(atk, atkBonus, def);
        assertEquals(expResult,result);
        
        System.out.println("test case 7");
        atk = 50; 
        atkBonus = 50;
        def = 50;
        expResult = 50;
        result = instance.attack(atk, atkBonus, def);
        assertEquals(expResult,result);
        

    }
    

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
