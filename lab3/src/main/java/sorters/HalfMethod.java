
package sorters;

import java.util.Arrays;


public class HalfMethod {
    int[] firstHalf;
    int[] secondHalf;
    void divArr(int[] arr) {
        firstHalf = Arrays.copyOfRange(arr, 0, arr.length/2);
	secondHalf = Arrays.copyOfRange(arr, arr.length/2, arr.length);
    }
	
    void commonSort(int[] firstHalf, int[] secondHalf, int[] arr) {
	int[] sortArr = new int[firstHalf.length + secondHalf.length];
	int i = 0;
	int j = 0;
		
	for( int k = 0; k < sortArr.length; k++) {
			
            if(i > firstHalf.length - 1) {
		int a = secondHalf[j];
		sortArr[k] = a;
		j++;
            }
            else if(j > secondHalf.length - 1) {
		int a = firstHalf[i];
		sortArr[k] = a;
		i++;
            }
            else if(firstHalf[i] < secondHalf[j]) {
		int a = firstHalf[i];
		sortArr[k]= a;
		i++;
            }
            else {
		int b = secondHalf[j];
                sortArr[k] = b;
		j++;
            }
	}
		
        System.arraycopy(sortArr, 0, arr, 0, arr.length);
    }

}
