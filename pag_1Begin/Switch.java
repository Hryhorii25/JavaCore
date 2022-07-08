package pag_1Begin;

import java.util.Scanner;

/**
 * Created by Гріша on 24.05.2017.
 */
public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи вік");
        int age = scanner.nextInt();
        switch(age){
            case 0 :
                System.out.println("Ти родився");
                break;
            case 7:
                System.out.println("Ти пішав в школу");
            case 18:
                System.out.println("Ти закінчив школу");
                break;
                default:
                    System.out.println("Жодна з умов не підійшла");



        }

    }
}
