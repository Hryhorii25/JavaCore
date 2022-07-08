package Codewars;

import java.util.Scanner;

public class Test1Kata8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.println(num);
        System.out.println(even_or_odd(num));
    }


    public static String even_or_odd(int number) {
        if (number% 2 == 0)
            return "Парне";
        else return "Непарне";
    }




}


