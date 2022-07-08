package ЛокалізаціяІнтернаціоналізація;

//import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

//Локаль(Locale) це один з інструментів який дозволяє встановити локалізацію тобто відображення мови і інформації
// відносно мови і країни користувача
public class ЛокальLocale { public static void main (String[] args ) {
    //Є деклька способів створення локалів
    Locale locale = new Locale("en","US");
    Locale locale2 = Locale.getDefault();
    Locale locale3 = new Locale("de","GR");
    System.out.println(Locale.getDefault());



    System.out.println(NumberFormat.getCurrencyInstance(locale).format(1000));
    System.out.println(NumberFormat.getCurrencyInstance(locale2).format(1000));
    System.out.println(NumberFormat.getCurrencyInstance(locale3).format(1000));

    System.out.println(DateFormat.getDateInstance(DateFormat.FULL,locale).format(new Date()));
    System.out.println(DateFormat.getDateInstance(DateFormat.FULL,locale2).format(new Date()));
    System.out.println(DateFormat.getDateInstance(DateFormat.FULL,locale3).format(new Date()));

}}
