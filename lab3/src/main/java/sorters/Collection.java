
package sorters;

import java.util.HashMap;
import java.util.Map;

public class Collection {
    public Map< String, Sort> methods;
	
	public void main() {
		
            methods = new HashMap< >();

            FunctSort a = new FunctSort();
            methods.put("FunctSort", a);

            BubbleDown b = new BubbleDown();
            methods.put("BubbleDown", b);

            BubbleUp c = new BubbleUp();
            methods.put("BubbleUp", c);

            QuickSort d = new QuickSort();
            methods.put("Quicksort", d);

            Type1 e = new Type1();
            methods.put("HalfMethod1", e);

            Type2 f = new Type2();
            methods.put("HalfMethod2", (Sort) f);

            Type3 g = new Type3();
            methods.put("HalfMethod3", (Sort) g);

            Type4 h = new Type4();
            methods.put("HalfMethod4", (Sort) h);
	}
}
