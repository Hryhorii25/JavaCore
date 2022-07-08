package Масиви.ДЗ;

//Утворити третій масив як попарну суму елементів двох масивів однакової довжини
public class Zavdanna11 {
    public static void main(String[] args) {
        int[] i1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] i2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] i3 = new int[i1.length];
        for (int i = 0; i < i3.length; i++) {
            i3[i]=i1[i]+i2[i];

            System.out.println(i3[i]);
        }
    }
}

