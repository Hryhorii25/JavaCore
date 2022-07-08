package Масиви.ДЗ;

//Виконати циклічний зсув матриці на k1 позицій вправо та на k1 догори.
public class Zavdanna21 {
    public static void main(String[] args) {
        int[][] i1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int size = i1.length;

        for (int[]a:i1) {

            for (int j:a ) {

                System.out.print(j+" ");

            }
            System.out.println();
        }



        for (int i=0;i<i1.length;i++) {
            int temp = i1[0][size - 1];
            for (int j = size - 1; j > 0; j--) {
                i1[j] = i1[j];

            }
            i1[0][0] = temp;
            i1[0][temp-1]=1;




    }




    System.out.println("______________");

    for (int[]a:i1) {

                for (int j:a ) {

                    System.out.print(j+" ");

                }
                System.out.println();
            }
               // System.out.println(i1.length);

        ///for(int a=0;a<i1.length;a++);{  i2[5]= a;   }









    }}











/*for (int[]a:i1) {

                for (int j:a ) {

                    System.out.print(j+" ");

                }
                System.out.println();
            }
                System.out.println(i1.length);*/


//int[] i2 = {15, 22, 43, 14, 55, 65, 71, 82, 3, 10};

