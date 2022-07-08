package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дана програма шукає букви у строці і виводить їх порядковий номер
public class RegEx3НабориСимволів {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]");//Задається з якої по яку букву шукати
        Pattern p1 = Pattern.compile("[1-10]");//Задається з якої по яку цифру шукати
        Pattern p2 = Pattern.compile("[avd1]");//Задається перелік символів які шукати
        Matcher m = p.matcher("abchghjghv");
        while (m.find()) {
            System.out.println(m.start() + "" + m.group() + "");
        }
        System.out.println("");


//Набори символів

    Pattern p4 = Pattern.compile("q[^u]");//Даний  символ ^ означає що буде відбуватись пошук усіх сиволів крім введеного [u]
    Pattern p5 = Pattern.compile("\\d");//Буква d при такім записі являє собою спеціальний сиворл який являє собою усі цифри 0-9
        Pattern p6 = Pattern.compile("\\w");//Буква w при такім записі являє собою спеціальний сиворл який являє собою усі букви a-ZA-Z та цифри 0-9
        Pattern p7 = Pattern.compile("\\s");//Буква s при такім записі являє собою спеціальний сиворл який являє собою усі пробіли або табуляції


        Matcher m4 = p.matcher("abchghjghv");
        while(m.find())

    {
        System.out.println(m.start() + "" + m.group() + "");
    }
                System.out.println("");
}}