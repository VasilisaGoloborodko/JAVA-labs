
package fillers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Random;
import sorters.Collection;

@interface GenerateInfo{
    String genName();
} 


public class GenerateArr {  
    
    @GenerateInfo(genName = "Неотсортированный массив")
    public static int[] RandArr(int length) {
        int[] arr = genRandom(length);	
	return arr;
    }
    
    @GenerateInfo(genName = "Сортировка, дополненная одним случайным элементом")
    public static int[] RandElem(int length, String name) {
        Random generator = new Random();
        
        int[] arr = genRandom(length);
		
	sort(arr, name);
		
	int[] newArr = Arrays.copyOf(arr, arr.length+1);
	newArr[newArr.length-1] = generator.nextInt(100);
		
	return newArr;
    }
    
    @GenerateInfo(genName = "Сортировка в обратном порядке")
    public static int[] ReverseArr(int length, String name) {
        int[] arr = genRandom(length);
		
	sort(arr, name);
		
	for(int i = 0, j = arr.length - 1; j > i; j--, i++) {
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
	}
		
	return arr;
    }
    
    @GenerateInfo(genName = "Обычная сортировка")
    public static int[] SortedArr(int length, String name) {
	int[] arr = genRandom(length);	
        
        sort(arr, name);
	
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
    
    private static void sort(int[] arr, String name){
        Collection e = new Collection();
	e.main();
	e.methods.get(name).sort(arr);
    }
    
}
