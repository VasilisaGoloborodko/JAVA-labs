
package analyzer;

import fillers.GenerateArr.GenerateInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.reflections.Reflections;
import sorters.Sort;

public class Analyze{
    public static void main(String[] args){
        try {
            analyse();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Analyze.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void analyse() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        try{
            Method[] methodsGen = getMethods("fillers.GenerateArr");
            Object obj = Class.forName("fillers.GenerateArr");
            Set<Class<? extends Sort>> subClasses = getSubClasses("sorters.Sort");
            for (Method methodGen : methodsGen) {
                if (methodGen.isAnnotationPresent(GenerateInfo.class)){
                    System.out.println("Тип генерации:"+methodGen+"\n");
                    for (Class<? extends Sort> sortClass : subClasses){
                        Set<Class<? extends Sort>> subSubCls = getSubClasses(sortClass.getName());
                        if (subSubCls.isEmpty()){
                            methodGen.setAccessible(true);
                            long before = System.nanoTime();
                            int[] arr = (int[]) methodGen.invoke(obj, 10, sortClass);
                            long after = System.nanoTime() - before;
                            System.out.println("Тип сортировки:"+sortClass+"\n" + Arrays.toString(arr));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Exception: " + e);
        }
    }
    
    private static Method[] getMethods(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        Class<?> cls = Class.forName(className);
        Method[] methods = cls.getDeclaredMethods();
        return methods;
    }
    
    private static Set<Class<? extends Sort>> getSubClasses(String className) throws ClassNotFoundException{
        Class cls = Class.forName(className);
        Reflections reflections = new Reflections();
        Set<Class<? extends Sort>> subClasses = reflections.getSubTypesOf(cls);
        return subClasses;
    }

}