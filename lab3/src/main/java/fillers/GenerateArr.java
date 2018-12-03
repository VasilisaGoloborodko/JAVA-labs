
package fillers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenerateArr { 
    
    @Retention(RetentionPolicy.RUNTIME)
    public @interface GenerateInfo{} 
    
    @GenerateInfo
    public static int[] RandElem(int length, Class<?> sortClass) {
        Random generator = new Random();
        
        int[] arr = genRandom(length);
		
	sort(sortClass,arr);
		
	int[] newArr = Arrays.copyOf(arr, arr.length+1);
	newArr[newArr.length-1] = generator.nextInt(100);
		
	return newArr;
    }
    
    @GenerateInfo
    public static int[] ReverseArr(int length, Class<?> sortClass) {
        int[] arr = genRandom(length);
        
        sort(sortClass,arr);
		
	for(int i = 0, j = arr.length - 1; j > i; j--, i++) {
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
	}
	return arr;
    }
    
    @GenerateInfo
    public static int[] SortedArr(int length, Class<?> sortClass) {
	int[] arr = genRandom(length);	
        
        sort(sortClass,arr);
	
	return arr;
    }
    
    @GenerateInfo
    public static int[] RandArr(int length, Class<?> sortClass) {
	int[] arr = genRandom(length);	
	return arr;
    }
    
    private static int[] genRandom(int length){
        
        Random generator = new Random();
	int[] arr = new int[length];
        
        for(int i = 0; i < length-1; i++) {
            arr[i] = generator.nextInt(100);
	}
        
        return arr;
    }
    
    private static void sort(Class<?> sortClass, int[] arr){
        try {
            Method sortMeth = sortClass.getMethod("sort", int[].class);
            try {
                try {
                    sortMeth.invoke(sortClass.newInstance(), arr);
                } catch (InstantiationException ex) {
                    Logger.getLogger(GenerateArr.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(GenerateArr.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(GenerateArr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
