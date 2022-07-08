package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Приклади роботи з RegEx
public class RegExp15Приклади {public static void main(String[]args){
    //приклад1
    Pattern p = Pattern.compile("ab");
    Matcher m = p.matcher("abaaaba");
    while (m.find()){
        System.out.println(m.start()+""+ m.group()+"");
    }
    System.out.println("");

    //приклад2
    Pattern p1 = Pattern.compile("aba");
    Matcher m1 = p1.matcher("abababa");
    while (m1.find()){
        System.out.println(m1.start()+""+ m1.group()+"");
    }
    System.out.println("");


    //приклад3 Знаходження цифр у строці
    Pattern p2 = Pattern.compile("\\d+");
    Matcher m2 = p2.matcher("a12c3e456f");
    while (m2.find()){
        System.out.println(m2.start()+""+ m2.group()+"");
    }
    System.out.println("");

    //приклад4 Знаходження усіх символів які не є пробілами
    Pattern p3 = Pattern.compile("\\w");
    Matcher m3 = p3.matcher("a1 2c3 e45 6f");
    while (m3.find()){
        System.out.println(m3.start()+""+ m3.group()+"");
    }
    System.out.println("");



    //приклад5
    Pattern p4 = Pattern.compile("proj1([^,])*");
    Matcher m4 = p4.matcher("proj3.txt,proj1sched.pdf,proj1");
    while (m4.find()){
        System.out.println(m4.start()+""+ m4.group()+"");
    }
    System.out.println("");


    //приклад6
    Pattern p5 = Pattern.compile("\\d\\d\\d([-\\s])?\\d\\d\\d\\d");
    Matcher m5 = p5.matcher("123 4567");
    while (m5.find()){
        System.out.println(m5.start()+""+ m5.group()+"");
    }
    System.out.println("");








}}
