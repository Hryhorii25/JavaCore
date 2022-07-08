package Масиви;

/**
 * Created by Гріша on 06.06.2017.
 */
public class ForEach {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[]strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пака";
        strings[2] = "Джава";

        for(int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
System.out.println();
    for(String string:strings){
System.out.println(string);
    }
     int[] numbers1 = {1,2,3};//створення масиву з готовими даними
   int sum = 0;
   for(int x:numbers1){
       sum = sum+x;
   }
   System.out.println();
        System.out.println(sum);
        int value = 0;
        String s;
    }

}
