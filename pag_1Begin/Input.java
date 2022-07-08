package pag_1Begin;

import java.util.Scanner;

/**
 * Created by Гріша on 23.05.2017.
 */
public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть число");
        double x = s.nextDouble();
        System.out.println("Ви ввели"+ x);
    }
}
