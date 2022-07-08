package Exceptions;

/**
 * Created by Гріша on 14.02.2018.
 */
public class ПрикладTryCatch {public static void main(String[] ards) {
int a,b,c;

try {
    b=0;
    a=42/0;
    System.out.println("Операція правильна");
}catch (ArithmeticException e){
    System.out.println("Ділення на нуль");}





}}
