package Масиви.ДЗ;

//Утворити третій масив як конкатенацію двох масивів різної довжини.
public class Zavdanna12 {
    public static void main(String[] args) {
        int[] i1 = {10, 22, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] i2 = {1, 2, 3, 4, 5};
        int[] i3 = new int[i1.length+i2.length];
        for (int i = 0; i < i3.length; i++) {
            if (i1.length>i){
                i3[i]= i1[i];
            } else {
                i3[i]=i2[i-i1.length];

            }
        }

        for (int i = 0; i<i3.length;i++){
            System.out.print(i3[i]);
        }
    }
    }
















