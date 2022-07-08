package GregorianCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ДЗ {public static void main (String[] ards){
    GregorianCalendar g= new GregorianCalendar();
    int today = g.get(Calendar.DAY_OF_WEEK);
    int mount =g.get(Calendar.MONTH);
    g.set(Calendar.DAY_OF_MONTH, 1);//Переность дату на перший день місяця
    int weekday = g.get(Calendar.DAY_OF_WEEK);// Вивід дня тижня

    System.out.println(today);
    System.out.println("ПН ВТ СР ЧТ ПТ СБ НД");
    for (int i =Calendar.MONDAY; i< weekday; i++){
        System.out.print("   ");
    }
    do {
        int day = g.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%2d",day);
        if(day==today){
            System.out.print("*");
        }else {
            System.out.print(" ");
        }
        if (weekday==Calendar.SUNDAY){
            System.out.println();

        }
        g.add(Calendar.DAY_OF_MONTH, 1);
        weekday =g.get(Calendar.DAY_OF_WEEK);
    } while (g.get(Calendar.MONTH) == mount) ;





}
}
//Д/З 1)Вивести 5 місяців впереді назад,2)Вивести місять і дату народження на 10 років вперед
//Дана тема э в Шилді

