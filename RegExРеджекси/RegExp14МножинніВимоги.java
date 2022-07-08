package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExp14МножинніВимоги {public static void main(String[]args){

    Pattern p = Pattern.compile("(?=\\b\\w{6}\\b)\\w*cat\\w*");//У даному записі задані множинні вимоги при пошуку
    //Розяснення множинного реджекса
    //("(?=\\b\\w{6}\\b)\\w*cat\\w*")
//1)b\\w{6}\\b)- знайти слово з шести букв
//2)\\|bw*cat\\w*" - знайти слово cat

    Matcher m = p.matcher("Jack is a boy");
    while (m.find()){
        System.out.println(m.start()+""+ m.group()+"");
    }
    System.out.println("");

//Приклад
    Pattern p1 = Pattern.compile("\\b(?=\\w{6,12}\\b)\\w{0,9}(cat|dog|mouse)\\w*");
    Matcher m1 = p.matcher("Jack is a boy");
    while (m.find()){
        System.out.println(m1.start()+""+ m1.group()+"");
    }
    System.out.println("");


}}
