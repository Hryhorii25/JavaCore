package Масиви.ДЗ;

//В масиві поміняти місцями максимум та мінімум.
public class Zavdanna13 {
    public static void main(String[] args) {
        int[] i1 = {102, 55, 12, 4, 34, 99, 6, 8, 9, 10,3};
        int indexMax = 0, indexMin = 0;
        int max = i1[0];
        int min = i1[0];
        for (int i = 0; i < i1.length; i++) {
            if (max < i1[i]) {
                max = i1[i];
                indexMax = i;
            } else if (min > i1[i]) {
                min = i1[i];
                indexMin = i;
            }
        }
        i1[indexMin] = max;
        i1[indexMax] = min;

        for (int i = 0; i < i1.length; i++) {

            System.out.print(i1[i]+ " ");
        }
        System.out.println("");
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
}
