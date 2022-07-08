package pag_1Begin;

import java.util.Scanner;

/**
 * Created by Гріша on 01.06.2017.
 */
public class If3 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int a;
        System.out.println("Ввести число");
        a= num.nextInt();
        if (a==10) {
            System.out.println("Так вірно 10" );
        } else {
            System.out.println("Не вірно " );
        }
    }
}

