package Масиви;

/**
 * Created by Гріша on 24.05.2017.
 */
public class Arrays2 {
    public static void main(String[] args){
        int number = 10;//[10]
        int[]numbers = new int[5];// numbers [масив] тип даних
        System.out.println(numbers[0]);  // 01234
        for (int i=0;i<numbers.length;i++){   //Присвоєння значень масиву через цикл
            numbers[i] = i*10;
        }
        for(int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
           int[] numbers1 = {1,2,3};
        for (int i = 0; i<numbers1.length;i++){ //Присвоєння значень масиву
            System.out.println(numbers1[i]);
        }
    }
}
