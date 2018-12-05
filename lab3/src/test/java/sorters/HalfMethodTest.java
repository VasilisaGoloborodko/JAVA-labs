
package sorters;

import java.util.Random;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HalfMethodTest {
    
    public HalfMethodTest() {
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
     * Test of divArr method, of class HalfMethod.
     */
    @Test
    public void testDivArr() {
        int[] emptyArr = {};
        int[] arr = {};
        HalfMethod instance = new HalfMethod();
        instance.divArr(arr);
        assertArrayEquals(emptyArr,arr);
    }
    
    @Test
    public void expectedExceptionDivArr(){
        HalfMethod instance = new HalfMethod();
        int[] arr = null;
        try {
            instance.divArr(arr);
            fail("NullPointerException was expected");
        } catch (NullPointerException ex) {
        }
    }
    
    @Test
    public void timeoutDivArr() throws InterruptedException, TimeoutException{
        HalfMethod instance = new HalfMethod();
        Random generator = new Random();
        int length = generator.nextInt(100);
        int[] arr = genArr(length);
        
        Thread testThread = new Thread(){
            @Override
            public void run(){
                instance.divArr(arr);
            }
        };
        
        testThread.start();
        Thread.sleep(10);
        testThread.interrupt();
        
        if (testThread.isInterrupted()){
            throw new TimeoutException("The divArr method test takes too much time");
        }
    }

    /**
     * Test of commonSort method, of class HalfMethod.
     */
    @Test
    public void testCommonSort() {
        HalfMethod instance = new HalfMethod();
        int[] arr = {};
        int[] emptyArr = {};
        instance.divArr(arr);
        instance.merge(instance.firstHalf, instance.secondHalf, arr);
        assertArrayEquals(emptyArr,arr);
    }
    
    @Test
    public void expectedExceptionCommonSort() {
        int[] firstHalf = new int[10];
        firstHalf = genArr(firstHalf.length);
        int[] secondHalf = new int[3];
        secondHalf = genArr(secondHalf.length);
        int[] arr = new int[14];
        arr = genArr(arr.length);
        HalfMethod instance = new HalfMethod();
        try {
            instance.merge(firstHalf, secondHalf, arr);
            fail("IndexOutOfBoundsException was expected");
        } catch (IndexOutOfBoundsException ex) {
        }
    }
    
    @Test
    public void timeoutCommonSort() throws InterruptedException, TimeoutException{
//        HalfMethod instance = new HalfMethod();
//        Random generator = new Random();
//        int length = generator.nextInt(100);
//        int[] arr = genArr(length);
//        instance.divArr(arr);
//        int[] firstHalf = instance.firstHalf;
//        int[] secondHalf = instance.secondHalf;
//        Thread testThread = new Thread(){
//            @Override
//            public void run(){
//                instance.merge(firstHalf, secondHalf, arr);
//            }
//        };
//        
//        testThread.start();
//        Thread.sleep(10);
//        testThread.interrupt();
//        
//        if (testThread.isInterrupted()){
//            throw new TimeoutException("The CommonSort method test takes too much time");
//        }
    }
   
    
    private int[] genArr(int length){
        Random generator = new Random();
	int[] arr = new int[length];
        
        for(int i = 0; i < length-1; i++) {
            arr[i] = generator.nextInt(100);
	}
        return arr;
    }
    
}
