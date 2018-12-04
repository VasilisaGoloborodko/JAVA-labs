
package sorters;

import java.util.Random;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {
    
    public QuickSortTest() {
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
     * Test of sort method, of class QuickSort.
     */
    @Test
    public void testSort() {
        int[] emptyArr = {};
        int[] arr = {};
        QuickSort instance = new QuickSort();
        instance.sort(arr);
        assertArrayEquals(emptyArr,arr);
    }
    
    @Test
    public void timeoutTestSort() throws InterruptedException, TimeoutException{
        QuickSort instance = new QuickSort();
        
        int[] arr = genArr();
        
        Thread testThread = new Thread(){
            @Override
            public void run(){
                instance.sort(arr);
            }
        };
        
        testThread.start();
        Thread.sleep(1);
        testThread.interrupt();
        
        if (testThread.isInterrupted()){
            throw new TimeoutException("The QuickSort test takes too much time");
        }
    }
    
    @Test
    public void testExpectedException(){
        QuickSort instance = new QuickSort();
        int[] arr = null;
        try {
            instance.sort(arr);
            fail("NullPointerException was expected");
        } catch (NullPointerException ex) {
        }
    }
    
    private int[] genArr(){
        Random generator = new Random();
	int[] arr = new int[generator.nextInt(100)];
        
        for(int i = 0; i < generator.nextInt(100); i++) {
            arr[i] = generator.nextInt(100);
	}
        return arr;
    }
    
}
