package Масиви.ДЗ;

//Згенерувати числа Фібоначчі.
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, …
public class Zavdanna19 {
    public static void main(String[] args) {
        int[] i1 = new int[10];
        int b = 1;
        int a =1;
        int c=0;
        int d=0;

        for (int i = 0; i < i1.length; i++) {


            c=a+b;
          a=b;
          b=c;
          i1[i]=c;

            System.out.println(i1[i]);
        }

    }
}