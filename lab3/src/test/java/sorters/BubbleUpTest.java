
package sorters;

import java.util.Random;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleUpTest {
    
    public BubbleUpTest() {
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
     * Test of sort method, of class BubbleUp.
     */
    @Test
    public void testSort() {
        int[] emptyArr = {};
        int[] arr = {};
        BubbleUp instance = new BubbleUp();
        instance.sort(arr);
        assertArrayEquals(emptyArr,arr);
    }
    
    @Test
    public void timeoutTestSort() throws InterruptedException, TimeoutException{
        System.out.println("* BubbleUpTest - testWithTimeout()");
        
        BubbleUp instance = new BubbleUp();
        
        int[] arr = genArr();
        
        Thread testThread = new Thread(){
            @Override
            public void run(){
                instance.sort(arr);
            }
        };
        
        testThread.start();
        Thread.sleep(1000);
        testThread.interrupt();
        
        if (testThread.isInterrupted()){
            throw new TimeoutException("The BubbleUp sort test takes too much time");
        }
    }
    
    @Test
    public void testExpectedException(){
        BubbleUp instance = new BubbleUp();
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
