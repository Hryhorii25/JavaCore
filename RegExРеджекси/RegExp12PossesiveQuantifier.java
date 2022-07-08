package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//В даному прикладі показано роботу  інстрентів пошуку
public class RegExp12PossesiveQuantifier {
    public static void main(String[]args){

        Pattern p = Pattern.compile("a++");
        Matcher m = p.matcher("Jack is a boy");
        while (m.find()){
            System.out.println(m.start()+""+ m.group()+"");
        }
        System.out.println("");









}}
