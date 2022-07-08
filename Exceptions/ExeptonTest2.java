package Exceptions;

import java.io.IOException;
import java.util.Scanner;
//Проста програма показує роботу виключень при вводі з консолі
public class ExeptonTest2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x =Integer.parseInt(scanner.nextLine());
            if (x!=0){
                throw  new IOException();
            }
    }
}}
