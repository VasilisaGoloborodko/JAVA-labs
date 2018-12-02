package sorters;

import java.util.Arrays;

public class Type3 extends HalfMethod implements Sort{

    @Override
    public void sort(int[] arr) {
       divArr(arr);
		
       BubbleUp c = new BubbleUp();
       c.sort(secondHalf);
		
       Arrays.sort(secondHalf);

       commonSort(firstHalf, secondHalf, arr);
    }
    
}