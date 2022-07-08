package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Тут буде розглянуто викорисання двох символів * +
// * - символи від нуля до безкінечності
// + - символи від одиниці до безкінечності
public class RegExp9СимволиЗірочкаІПлюс {public static void main(String[]args){


    Pattern p = Pattern.compile("<[A-Za-z][A-Za-z0-9]*");//Приклад запису для знаходження тега в даному випадку * після []
                                                        // вказує на що на щось в даному переліку може бути а чогось може не бути
   // Pattern p1 = Pattern.compile("<>*");
    Matcher m = p.matcher("<h1>");
    while (m.find()){
        System.out.println(m.start()+""+ m.group()+"");
    }
    System.out.println("");
}}
