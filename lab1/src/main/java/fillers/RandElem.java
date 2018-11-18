
package fillers;

import java.util.Arrays;
import java.util.Random;
import sorters.Collection;


public class RandElem implements Generate{

    @Override
    public int[] generate(int length, String name) {
        Random generator = new Random();
	int[] arr = new int[length];
		
	for(int i = 0; i < length-1; i++) {
            arr[i] = generator.nextInt(100);
	}
		
	Collection e = new Collection();
	e.main();
	e.methods.get(name).sort(arr);
		
	int[] newArr = Arrays.copyOf(arr, arr.length+1);
	newArr[newArr.length-1] = generator.nextInt(100);
		
	return newArr;
    }
}
