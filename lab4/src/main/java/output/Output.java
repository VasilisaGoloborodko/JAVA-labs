
package output;

public class Output {
    
    public void output(String genType, String sortType, long time) {
        System.out.println("Тип генерации: " + genType);
        System.out.println("Тип сортировки: " + sortType);
        System.out.println("Затраченное время: " + time + "\n");
    }
    
    public void output(String genType, long time) {
        System.out.println("Тип генерации: " + genType);
        System.out.println("Затраченное время: " + time);
    }
    
}
