package sorters;

import java.util.Arrays;

public class Type3 extends Sort{

    @Override
    public void sort(int[] arr) {
       HalfMethod div = new HalfMethod();  
        
       div.divArr(arr);
		
       BubbleUp c = new BubbleUp();
       c.sort(div.secondHalf);
		
       Arrays.sort(div.secondHalf);

       div.commonSort(div.firstHalf, div.secondHalf, arr);
    }
    
}