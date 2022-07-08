package Масиви.ДЗ;

//Визначити середнє арифметичне елементів масиву та кількість елементів, що є більшими за середнє арифметичне.
public class Zavdanna10 {
    public static void main(String[] args) {
        int sum = 0;
        int k = 0;
        int r = 0;
        int ser =0;
        int[] i1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < i1.length; i++) {
            sum += i1[i];
            k++;
             ser = sum/k;
        }
        for (int i = 0; i < i1.length; i++){
            if (i1[i]>ser){
                r++;
            }

        }

        System.out.println("Сума елементів масива " +sum);
        System.out.println( "Кількість елементів масива "+ k);
        System.out.println("Середнє арифметичне " +ser );
        System.out.println("Kількість елементів, що є більшими за середнє арифметичне " +  r);


    }

}

