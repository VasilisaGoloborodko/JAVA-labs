/**
* Bubble up sort
*/
package sorters;

public class BubbleUp extends Bubble{

    @Override
    public void sort(int[] arr) {
        
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = arr.length-1; j > 0; j--) {
                if (arr[j-1]>arr[j]) {
                    int a = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = a;
		}
            }
	}
    
    }
    
}
