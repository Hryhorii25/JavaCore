package Масиви.ДЗ;

//Визначити середні арифметичні двох масивів. Утворити третій масив з елементів обидвох масивів,
// що знаходяться в межах між значеннями середніх арифметичних.
public class Zavdanna18 {
    public static void main(String[] args) {
        int sum = 0;
        int ser =0;
        int sum1=0;
        int ser1 =0;
        int[] i1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] i2 = {15, 22, 43, 14, 55, 65, 71, 82, 3, 10};

        for (int i = 0; i < i1.length; i++) {
            sum += i1[i];
            sum1+=i2[i];
            ser = sum/i1.length;
            ser1 = sum1/i2.length;
        }

        System.out.println("Середнє арифметичне масиву 1: " +ser );
        System.out.println("Середнє арифметичне масиву 2: " +ser1 );
        System.out.println("Ініціалізація третього масиву:" );

        int[] i3  = new int[ser1+1];
        for (int i = ser; i <= ser1 ; i++) {
            i3[i]=i;

            System.out.println(i3[i]);
        }

    }

}

