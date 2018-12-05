
package sorters;

/**
 *
 * @author Vasilisa_Goloborodko
 */
public class QuickSort extends Sort{

    @Override
    public void sort(int[] arr) {
        sortHelp(arr, 0, arr.length-1);
    }
    
    private void sortHelp(int[] arr, int low, int high){
        
        if(arr.length == 0) {
            return;
	}
		
	if(low >= high) {
            return;
	}
		
	int point = arr[low + (high - low)/2];	
	int i = low, j = high;
        
	while(i <= j) {
			
            while (arr[i] < point) {
		i++;
            }
			
            while (arr[j] > point) {
		j--;
            }
			
            if(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
	}
		
	if(low < j) {
            sortHelp(arr, low, j);
	}
		
	if(high > i) {
            sortHelp(arr, i, high);
	}
    }
    
}
