package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//OptionalItems це інструмент відповідає символу ? (опціональний оператор) дозволяє при пошуку вибирати різні значення пошуку
public class RegEx8OptionalItemsЗнакЗапитання {public static void main(String[]args) {
    //Перший спосіб застосування OptionalItems при пошуку слова
    Pattern p = Pattern.compile("colou?r");//строка яка записана перед ? буде опціональною а усе після ? є обовязковим
    Matcher m = p.matcher("color colour");
    while (m.find()) {
        System.out.println(m.start() + "" + m.group() + "");
    }
    System.out.println("");


    //Другий спосіб застосування OptionalItems
    Pattern p1 = Pattern.compile("Nov(ember)?");//при такому записі (..)? усе що в дужках буде опціональним а перед дужками є обовязковим
    Matcher m1 = p1.matcher("color colour");
    while (m1.find()) {
        System.out.println(m1.start() + "" + m1.group() + "");
    }
    System.out.println("");




}}

