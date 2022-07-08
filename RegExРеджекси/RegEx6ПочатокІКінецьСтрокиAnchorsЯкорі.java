package RegExРеджекси;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx6ПочатокІКінецьСтрокиAnchorsЯкорі {public static void main(String[] args) {
    Pattern p = Pattern.compile("^a");//Початок строки
    Pattern p1 = Pattern.compile("c$");//Кінець строки
    Pattern p2 = Pattern.compile("b$");
    Pattern p3 = Pattern.compile("^a");

    Matcher m = p1.matcher("This island is beautiful");

    while (m.find()) {
        System.out.print(m.start() + "" + m.group() + "");
    }
    System.out.println("");
}}

