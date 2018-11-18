
package sorters;

public class BubbleDown implements Sort{

    @Override
    public void sort(int[] arr) {
        
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1; j++) {
		if (arr[j]>arr[j+1]) {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
		}
            }
        }
        
    }
    
}

//bubblesort сделать с помощью полиморфизма на два класса
//pom.xml - указываются необходимые библиотеки
//создать maven project
//создать один большой проект для всех лаб
//tortoise
