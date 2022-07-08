package WorkWitFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//ЗчитуванняМасиву з присвоєнням
public class Зчитування1 {
    public static void main(String[] args) throws Exception,FileNotFoundException {
        //Даний запис застосовується тому що  в різних операційних системах по різному прописується шлях до файлу тому використовують
        //метод separator яки визначає як прописати шлях до  файла відносно системи у якій була запущена програма
        //String separator = File.separator;
        // String pach= separator+"C:"+ separator + "Users"+separator + "Гріша" + separator + "Desktop" + separator + "Test.txt";
        //File file = new File(pach);



        File file = new File("C:\\Users\\Гріша\\Desktop\\Програмування\\JAVA\\Навчальна JAVA\\Dir\\test.txt");//1)Створюєм абстрактний обєкт File file і в його параметри
// вписуєм шлях до потрібного файлу
        Scanner scanner = new Scanner(file);//2)Створюєм обєкт сканер який читає дані (потік) і даний обєкт буде приймати file
String line = scanner.nextLine();
String[] words= line.split(" ");//Метод split тут задається символ розділювач який буде ділитити строку на масив
System.out.println(Arrays.toString(words));

        scanner.close();
    }}

