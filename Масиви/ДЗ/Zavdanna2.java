package Масиви.ДЗ;

//Порахувати суму елементів масиву.

public class Zavdanna2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] i1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < i1.length; i++) {
            sum += i1[i];
        }
        System.out.println(sum);
    }

}