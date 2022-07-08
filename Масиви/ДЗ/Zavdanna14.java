package Масиви.ДЗ;

//В масиві усунути максимум та мінімум.
public class Zavdanna14 {
    public static void main(String[] args) {

        int[] i1 = new int[]{222, 23, 30, 45, 54, 63, 7, 8, 9, 1};
        int max = i1[0];
        int min = i1[0];
        int indexPlus = 0;
        int indexVid = 1;

        for (int i = 0; i < i1.length; i++) {
            System.out.print(i1[i] + " ");

            if (max < i1[i]) {
                max = i1[i];
                indexPlus=i;
            }
            if (min > i1[i]) {
                min = i1[i];
                indexVid=i;
            }

        }
        System.out.println("  ");
        i1[indexPlus]=0;
        i1[indexVid]=0;
        for (int i = 0; i < i1.length; i++) {
         System.out.print(i1[i] + " ");
        }
}
}








