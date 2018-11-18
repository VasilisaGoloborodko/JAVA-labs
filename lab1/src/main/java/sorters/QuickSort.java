/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorters;

/**
 *
 * @author Васька-супер)
 */
public class QuickSort implements Sort{

    @Override
    public void sort(int[] arr) {
        
    }
    
    public void sort(int[] arr, int low, int high){
        
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
            sort(arr, low, j);
	}
		
	if(high > i) {
            sort(arr, i, high);
	}
    }
    
}
