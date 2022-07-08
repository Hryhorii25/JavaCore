package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//В даній програмі показано роботи Unicode при роботі з regex
public class RegExp11Unicode {public static void main(String[]args){
System.out.println("\u0068");
    Pattern p = Pattern.compile("\\u0068");//пошук символу по unicode
    Matcher m = p.matcher("h");
    while (m.find()){
        System.out.println(m.start()+""+ m.group()+"");
    }
    System.out.println("");
}}
