package Collections;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

//Дана програма демонструє використання черги з Queue пріорітетами
public class QueuePrioritiProgram {
    public static void main (String[] args ) {
        PriorityQueue<GregorianCalendar> pd = new PriorityQueue<GregorianCalendar>();
        pd.add(new GregorianCalendar(1906, Calendar.DECEMBER,9));
        pd.add(new GregorianCalendar(1815,Calendar.DECEMBER, 10));
        pd.add(new GregorianCalendar(1903,Calendar.DECEMBER, 3));
        pd.add(new GregorianCalendar(1910,Calendar.JUNE, 22));

    System.out.println("Iterating over elements...");
    for (GregorianCalendar date: pd){
    System.out.println(date.get(Calendar.YEAR));
    System.out.println("Removig elements...");}
    while (!pd.isEmpty()){
        System.out.println(pd.remove().get(Calendar.YEAR));
    }
    }

}


