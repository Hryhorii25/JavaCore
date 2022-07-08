package ФункціїМетоди;
import java.util.Scanner;

/**
 * Created by Гріша on 07.06.2017.
 */
public class Function3 {
    public static void main(String[] args) {
        func(3, 4);
        redArray();
    }

    public static int[] redArray() {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i<n; i++)
            arr[i] = in.nextInt();
        return arr;
    }
        public static void func ( int a, int b){
            int result = 1;
            for (int i = 0; i < b; i++)
                result *= a;

            System.out.print(result);

        }
    }

//Дана функція вписує значення в масив

