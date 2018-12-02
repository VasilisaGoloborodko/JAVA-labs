
package sorters;

public class Type1 extends HalfMethod implements Sort{

    @Override
    public void sort(int[] arr) {
       divArr(arr);
       
       BubbleDown b = new BubbleDown();
       b.sort(firstHalf);
       
       BubbleUp c = new BubbleUp();
       c.sort(secondHalf);
       
       commonSort(firstHalf, secondHalf, arr);
    }
    
}
