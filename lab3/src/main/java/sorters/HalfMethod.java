
package sorters;

import java.util.Arrays;
import org.apache.commons.lang.ArrayUtils;


public class HalfMethod {
    int[] firstHalf;
    int[] secondHalf;
    void divArr(int[] arr) {
        firstHalf = Arrays.copyOfRange(arr, 0, arr.length/2);
	secondHalf = Arrays.copyOfRange(arr, arr.length/2, arr.length);
    }
	
    void merge(int[] firstHalf, int[] secondHalf, int[] arr) {
        int[] mergedArr = new int[arr.length];
        mergedArr = ArrayUtils.addAll(firstHalf,secondHalf);
        System.arraycopy(mergedArr, 0, arr, 0, arr.length);
    }

}
