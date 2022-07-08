package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// В даній програмі буде розглядатись символ Pipeline |  і як він працює в RegEx
public class RegEx7Pipeline {public static void main(String[] args) {
    //Програма приклад роботи символа Pipeline |
    Pattern p = Pattern.compile("cat|dog");//Даний сивол працює як логічне або він шукає або це або то
    Matcher m = p.matcher("I like my dog!");
    while (m.find()) {
        System.out.print(m.start() + "" + m.group() + " ");
    }
    System.out.println("");
}}
