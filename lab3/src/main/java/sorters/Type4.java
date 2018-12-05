package sorters;

import java.util.Arrays;

public class Type4 extends Sort{

    @Override
    public void sort(int[] arr) {
       HalfMethod div = new HalfMethod();
        
       div.divArr(arr);
       
       BubbleDown b = new BubbleDown();
       b.sort(div.firstHalf);
		
       Arrays.sort(div.secondHalf);

       div.merge(div.firstHalf, div.secondHalf, arr);
    }
    
}