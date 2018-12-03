
package sorters;

public class BubbleDown extends Sort{

    @Override
    public void sort(int[] arr) {
        
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1; j++) {
		if (arr[j]>arr[j+1]) {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
		}
            }
        }
        
    }
    
}
