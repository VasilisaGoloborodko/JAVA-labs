
package analyzer;

import fillers.GenerateArr.GenerateInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import org.reflections.Reflections;
import sorters.Sort;

public class Analyze{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        try{
            Class<?> cls = Class.forName("fillers.GenerateArr");
            Object obj = cls.newInstance();
            Method[] methodsGen = cls.getDeclaredMethods();
        
            Class cls1 = Class.forName("sorters.Sort");
            Reflections reflections = new Reflections();
            Set<Class<? extends Sort>> subClasses = reflections.getSubTypesOf(cls1);
        
            for (Method methodGen : methodsGen) {
                if (methodGen.isAnnotationPresent(GenerateInfo.class)){
                    System.out.println("Тип генерации:"+methodGen+"\n");
                    for (Class<? extends Sort> sortClass : subClasses){
                        
                        methodGen.setAccessible(true);
                        long before = System.nanoTime();
                        int[] arr = (int[]) methodGen.invoke(obj, 10, sortClass);
                        System.out.println("Тип сортировки:"+sortClass+"\n" + Arrays.toString(arr));
                        long after = System.nanoTime() - before;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Exception: " + e);
        }
        
    }

}