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
public class ActorControlTest {
    
    public ActorControlTest() {
    }

    /**
     * Test of talkToActor method, of class ActorControl.
     */
    @Test
    public void testTalkToActor() {
        System.out.println("talkToActor");
        int level = 4;
        ActorControl instance = new ActorControl();
        int expResult = 2;
        int result = instance.talkToActor(level);
        assertEquals(expResult, result);
       
    }
    
}
