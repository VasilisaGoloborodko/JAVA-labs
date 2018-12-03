/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorters;

import java.util.Random;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Васька-супер)
 */
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
//    @Test
//    public void testSort() {
//        System.out.println("sort");
//        int[] arr = null;
//        BubbleUp instance = new BubbleUp();
//        instance.sort(arr);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void timeoutTestSort() throws InterruptedException, TimeoutException{
        System.out.println("* BubbleUpTest - testWithTimeout()");
        
        BubbleUp instance = new BubbleUp();
        
        Random generator = new Random();
	int[] arr = new int[generator.nextInt(100)];
        
        for(int i = 0; i < generator.nextInt(100); i++) {
            arr[i] = generator.nextInt(100);
	}
        
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
    
//    @Test
//    public void testExpectedException(){
//        BubbleUp instance = new BubbleUp();
//        try {
//            int[] arr = {null};
//            instance.sort(arr);
//            fail("IllegalArgumentException was expected");
//        } catch (IllegalArgumentException ex) {
//        }
//    }
}
