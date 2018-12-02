package sorters;

public class Type2 extends HalfMethod implements Sort{

    @Override
    public void sort(int[] arr) {
       divArr(arr);
       
       BubbleUp b = new BubbleUp();
       b.sort(secondHalf);
		
       int low = 0;
       int high = secondHalf.length - 1;
       QuickSort c = new QuickSort();
       c.sort(secondHalf, low, high);

       commonSort(firstHalf, secondHalf, arr);
    }
    
}