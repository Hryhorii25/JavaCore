package RegExРеджекси;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5ГраниціСлів {public static void main(String[] args) {
    Pattern p = Pattern.compile("\\bis\\b");//символ b означає роділювач слів в такому записі "\\bis\\b"  означає що буде іти пошук is перед яким і після якого пробіл
    Matcher m = p.matcher("This island is beautiful");
    while (m.find()) {
        System.out.print(m.start() + "" + m.group() + "");
    }
    System.out.println("");
}}
