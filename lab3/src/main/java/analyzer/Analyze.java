
package analyzer;

import fillers.Generate;
import fillers.RandArr;
import fillers.RandElem;
import fillers.ReverseArr;
import fillers.SortedArr;
import java.util.ArrayList;
import java.util.Iterator;
import output.Output;
import sorters.Collection;

public class Analyze {
    public static void main(String[] args) {
    
        Collection coll = new Collection();
        coll.main();
        
        SortedArr c = new SortedArr();
        ReverseArr d = new ReverseArr();
        RandElem e = new RandElem();
        
        long before;
        long after;
        
        Output result = new Output();
        
        ArrayList<Generate> arrTypes = new ArrayList<>();
        arrTypes.add(c);
        arrTypes.add(d);
        arrTypes.add(e);
        
        for (String key : coll.methods.keySet()){
            
            for (Iterator i = arrTypes.iterator(); i.hasNext();){
                Generate o = (Generate) i.next();
                
                before = System.nanoTime();
                o.generate(10, key);
                after = System.nanoTime() - before;
                
                result.output(o.getClass().getSimpleName(), key, after);
            }
            
        }
      
        RandArr f = new RandArr();
        before = System.nanoTime();
        f.generate(10);
        after = System.nanoTime() - before;
        result.output("RandArr", after);
    }
}