
package fillers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GenerateArrTest {
    
    public GenerateArrTest() {
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
     * Test of RandElem method, of class GenerateArr.
     */
    @Test
    public void testRandElem() {
        System.out.println("RandElem");
        int length = 0;
        Class sortClass = null;
        int[] expResult = null;
        int[] result = GenerateArr.RandElem(length, sortClass);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of ReverseArr method, of class GenerateArr.
     */
    @Test
    public void testReverseArr() {
        System.out.println("ReverseArr");
        int length = 0;
        Class sortClass = null;
        int[] expResult = null;
        int[] result = GenerateArr.ReverseArr(length, sortClass);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of SortedArr method, of class GenerateArr.
     */
    @Test
    public void testSortedArr() {
        System.out.println("SortedArr");
        int length = 0;
        Class sortClass = null;
        int[] expResult = null;
        int[] result = GenerateArr.SortedArr(length, sortClass);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of RandArr method, of class GenerateArr.
     */
    @Test
    public void testRandArr() {
        System.out.println("RandArr");
        int length = 0;
        Class sortClass = null;
        int[] expResult = null;
        int[] result = GenerateArr.RandArr(length, sortClass);
        assertArrayEquals(expResult, result);
    }
    
}
