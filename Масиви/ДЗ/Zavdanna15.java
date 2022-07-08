package Масиви.ДЗ;

//Задача. Дано масив з додатнімі і відємними значеннями.Відсортувати окремо по масивах додатні і відємні значення.
public class Zavdanna15 {
    public static void main(String[] args) {

        int[] i1 = {-7, 12, 5, 3, -18, 13, 33, 100, -32};
        int a = 0;
        int dodIndex = 0;
        int vidIndex =0;

        for (int i = 0; i < i1.length; i++) {
            if (i1[i] >= 0) {
                a++;
            }
        }
        int[] i2 = new int[a];
        int[] i3 = new int[i1.length - a];

        for (int i = 0; i < i1.length; i++) {

            if (i1[i] > 0) {
                i2[dodIndex] = i1[i];
                dodIndex++;
            } else
                i2[vidIndex] = i1[i];
            vidIndex++;
        }

        for (int i = 0; i < i2.length; i++) {
            System.out.println(i2[i]);

        }
        System.out.println("_______________________________");


        for (int i = 0; i < i3.length; i++) {
            System.out.println(i2[i]);
    }}}

//                System.out.println(i2.length);
//                System.out.println(i3.length);












