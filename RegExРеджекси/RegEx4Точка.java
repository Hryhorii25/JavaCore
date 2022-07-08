package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// В даній програмі буде розглядатись символ точка "." даний сивол означає практично будь який символ
public class RegEx4Точка {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d\\d.\\d\\d.\\d\\d");
        Matcher m = p.matcher("02/12/03");
        while (m.find()) {
            System.out.println(m.start() + "" + m.group() + "");
        }
        System.out.println("");


        //Прилад використання точки для пошуку
        Pattern p1 = Pattern.compile("\".*\"");
        Matcher m1 = p.matcher("Put a \"string\" between double quotes");
        while (m1.find()) {
            System.out.println(m1.start() + "" + m1.group() + "");
        }
        System.out.println("");


    }}
