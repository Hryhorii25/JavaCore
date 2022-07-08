package Масиви.ДЗ;
//Вивести елементи масиву в прямому та зворотньому порядках.
public class Zavdanna1 {
    public static void main(String[] args) {
        int[] i1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < i1.length; i++) {
            System.out.println(i1[i]);
        }
System.out.println("_____________________");


        for (int i = i1.length - 1; i >= 0; i--) {
            System.out.println(i1[i]);

        }
    }
}
