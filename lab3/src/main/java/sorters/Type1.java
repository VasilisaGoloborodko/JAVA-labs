
package sorters;

public class Type1 extends Sort{

    @Override
    public void sort(int[] arr) {
       HalfMethod div = new HalfMethod();
        
       div.divArr(arr);
       
       BubbleDown b = new BubbleDown();
       b.sort(div.firstHalf);
       
       BubbleUp c = new BubbleUp();
       c.sort(div.secondHalf);
       
       div.merge(div.firstHalf, div.secondHalf,arr);
    }
    
}
