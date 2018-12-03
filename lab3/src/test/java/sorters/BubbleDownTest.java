/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorters;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 *
 * @author Васька-супер)
 */
public class BubbleDownTest{
    
    public BubbleDownTest() {
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
    
    @Rule
    public final Timeout timeout = new Timeout(1000);

    /**
     * Test of sort method, of class BubbleDown.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] arr = null;
        int expResult = 0;
        BubbleDown instance = new BubbleDown();
        instance.sort(arr);
        assertEquals(expResult, arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
