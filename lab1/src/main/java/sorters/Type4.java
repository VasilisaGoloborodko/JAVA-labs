package sorters;

import java.util.Arrays;

public class Type4 extends HalfMethod implements Sort{

    @Override
    public void sort(int[] arr) {
       divArr(arr);
       
       BubbleDown b = new BubbleDown();
       b.sort(firstHalf);
		
       Arrays.sort(secondHalf);

       commonSort(firstHalf, secondHalf, arr);
    }
    
}