package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegEx14LookAround {
    public static void main(String[] args) {

// В дані програмі розглядається механізми пошуку
        Pattern p = Pattern.compile("a(?=k)");//Такий механізм пошуку буде знаходити a настипний символ після якого k
        Pattern p1 = Pattern.compile("a(?!k)");//Такий механізм пошуку буде знаходити a після якого не буде k
        Pattern p2 = Pattern.compile("(?<=a)b");//Такий механізм пошуку буде знаходити перед яким не буде k


        Matcher m = p.matcher("Jack is a boy");
        while (m.find()) {


            System.out.println(m.start() + "" + m.group() + "");
        }
        System.out.println("");
    }}