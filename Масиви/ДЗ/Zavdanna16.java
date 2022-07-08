package Масиви.ДЗ;

//16. Утворити третій масив з елементів двох масивів однакової довжини,
// які є одночасно непарними. Утворити четвертий масив з індексів цих елементів.
public class Zavdanna16 {
    public static void main(String[] args) {


        int[] i1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] i2 = {11, 2, 5, 4, 15, 6, 7, 8, 9, 10};
        int[] i4 = new int[i1.length];
        int a = 0;
        for (int i = 0; i < i1.length; i++) {
            if (i1[i]%2 >0 & i2[i]%2 >0 )
                a++;
               // i3[i] = i1[i] + i2[i];
        }
        int[] i3 = new int[a*3];
        for (int i = 0; i < i1.length; i++) {
            if (i1[i]%2 >0 & i2[i]%2 >0 )
                i3[i] = i1[i];
            i3[i+1]=i2[i];



            System.out.println(i3[i]);
        }

        System.out.println("__________________________");

        for (int i = 0; i < i1.length; i++) {

            if (i1[i]%2 >0 & i2[i]%2 >0 )
                i4[i]=i;
            else continue;

            System.out.println(i4[i]);}

    }}


