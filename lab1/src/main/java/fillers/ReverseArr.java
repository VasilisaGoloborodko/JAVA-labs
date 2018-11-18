
package fillers;

import java.util.Random;
import sorters.Collection;

public class ReverseArr implements Generate{

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
		
	for(int i = 0, j = arr.length - 1; j > i; j--, i++) {
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
	}
		
	return arr;
    }
    
}
