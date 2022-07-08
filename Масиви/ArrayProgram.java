package Масиви;

import java.util.Scanner;

/**
 * Created by Гріша on 01.06.2017.
 */
public class ArrayProgram {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);{
            System.out.print("Enter numbers of array:");
            n = in.nextInt();
            a = new int[n];
            for (int i=0; i<n;i++){
                System.out.print("Enter a["+ i +"] array = ");
                a[i] = in.nextInt();
            }


        }

    }
}