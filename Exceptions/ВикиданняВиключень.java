package Exceptions;

import ExceptionsMy.VlasniExceptions;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Гріша on 17.08.2017.
 */
public class ВикиданняВиключень {
    public static void main (String[] ards) throws IOException, VlasniExceptions {
        Scanner scanner = new Scanner(System.in);
        while (true){
          int x= Integer.parseInt(scanner.nextLine());
            if (x!=0) {
               // throw new IOException();//Сторення  Exceptiona
                //throw new  VlasniExceptions();//Викидання власного Exception
            }
//Дана програма працює наступним чином сворється сканер в який записуємо тест і поміщаємо його у цикл
// якщо немає нічого введеного тоді виводться створена у блоці if() Exception помилка


    }}}
