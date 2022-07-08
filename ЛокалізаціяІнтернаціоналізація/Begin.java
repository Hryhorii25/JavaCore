package ЛокалізаціяІнтернаціоналізація;

//Іннтернаціолізакія це зміна мови виводу тексту  у прогрмі відносно того яку мову вибере користувач або від того яка стандартна мова виводу
// на компютері у користувача  це досягається за допомогою використання певних інструментів в JAVA тут буде показано два способи інтернаціолізації

//Перший спосіб через створення файлів політики і банглів
//1)Створється файл назва resurses.properties
//2)В данім файлі вводимо певний текст somevalue = Здоров це мій текст
//3)Створється ще один  файл назва resurses_EN.properties
//4)Створється ще один  файл назва resurses_DE.properties


import Серіалізація3.Color;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Begin {
    public static void main (String[] args ) {
//5)Створюється банглів
        ResourceBundle bundleDefault = ResourceBundle.getBundle("resurses");
        System.out.println(bundleDefault.getString("somevalue"));



        //6)Створення банглів з допомогою локалів
        //ResourceBundle bundleEN = ResourceBundle.getBundle("resource", new Locale("en","US")) ;
        //ResourceBundle bundleDE = ResourceBundle.getBundle("resource",new Locale("de","GR"));



}}

//Другий спосіб через створення  класів з методами які виконують локалізацію
  class  resurse_en extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[0][];
    }}
   //private static final Object[][] contents ={
           //{"readingFile","Atention! the file is read"},
           //{"backgroundColor", java.awt.Color.black},
           //{"defaultPaperSize", new double[]{210,297}}
   //};

    //}
//}




class resurse_de extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[0][];

    }
}


class resurse_fr extends ListResourceBundle{
    @Override
    protected Object[][] getContents() {
        return new Object[0][];
    }}
