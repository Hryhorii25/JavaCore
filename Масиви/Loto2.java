package Масиви;

public class Loto2 {
    public static void main(String[] args) {
        Integer[] A = new Integer[1000];
        int x = 0;
        


        for (int i = 0; i < 1000; i++) {
            A[i] = (int) Math.random();
        }



        for (int i = 0; i <A.length ; i++) {
            for (int j = 1; j < A.length; j++) {
if (A[i]==A[j]) {x++;
            }

        }
        }
        System.out.printf(String.valueOf(x));
}}
