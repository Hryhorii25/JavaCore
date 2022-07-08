package WorkWitFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//ЗчитуванняМасиву даних із текстового файлу який є створений на жосткім диску
public class Зчитування {
    public static void main(String[] args) throws Exception,FileNotFoundException {
        //Даний запис застосовується тому що  в різних операційних системах по різному прописується шлях до файлу тому використовують
        //метод separator яки визначає як прописати шлях до  файла відносно системи у якій була запущена програма
        //String separator = File.separator;
       // String pach= separator+"C:"+ separator + "Users"+separator + "Гріша" + separator + "Desktop" + separator + "Test.txt";
        //File file = new File(pach);



        File file = new File("C:\\Users\\Гріша\\Desktop\\Програмування\\JAVA\\Навчальна JAVA\\Dir\\test.txt");//1)Створюєм абстрактний обєкт File file і в його параметри
// вписуєм шлях до потрібного файлу
        //Якщо файл знаходться в кореневій папці IDEA то повний шлях до файлу прописувати не потрібно
        File file1 = new File("test2.txt");

        Scanner  scanner = new Scanner(file);//2)Створюєм обєкт сканер який читає дані (потік) і даний обєкт буде приймати file

        //3)Метод який за домомогою цикла виводть текст із файлу
        while (scanner.hasNextLine()){
    System.out.println(scanner.nextLine());
}

scanner.close();
    }}
