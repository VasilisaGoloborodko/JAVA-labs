package sorters;

public class Type2 extends Sort{

    @Override
    public void sort(int[] arr) {
       HalfMethod div = new HalfMethod(); 
        
       div.divArr(arr);
       
       BubbleUp b = new BubbleUp();
       b.sort(div.firstHalf);
		
       int low = 0;
       int high = div.secondHalf.length - 1;
       QuickSort c = new QuickSort();
       c.sort(div.secondHalf);

       div.merge(div.firstHalf, div.secondHalf, arr);
    }
    
}