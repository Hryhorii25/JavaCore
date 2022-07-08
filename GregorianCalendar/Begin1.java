package GregorianCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Гріша on 29.06.2017.
 */
public class Begin1 {
    public static void main(String[] ards) {
        GregorianCalendar g= new GregorianCalendar();
        int today = g.get(Calendar.DAY_OF_WEEK);
        int mount =g.get(Calendar.DAY_OF_MONTH);
        int mount2 =g.get(Calendar.DAY_OF_YEAR);
        g.set(Calendar.DAY_OF_MONTH, 1);



        System.out.println(today);
        System.out.println(mount);
        System.out.println(mount2);

    }





}

