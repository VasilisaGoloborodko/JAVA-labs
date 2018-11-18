
package fillers;

import java.util.Random;

public class RandArr implements Generate{

    @Override
    public int[] generate(int length, String name) {
        Random generator = new Random();
	int[] arr = new int[length];
		
	for(int i = 0; i < length-1; i++) {
            arr[i] = generator.nextInt(100);
	}
		
	return arr;
    }
    
    public int[] generate(int length) {
        Random generator = new Random();
	int[] arr = new int[length];
		
	for(int i = 0; i < length-1; i++) {
            arr[i] = generator.nextInt(100);
	}
		
	return arr;
    }
    
}
