package String;

/**
 * Created by Гріша on 21.06.2017.
 */
public class Begin {
public static void main(String[] args){
    String x ="hello";
    x=x.toUpperCase();//Виклик методу який змінює малі букви на великі із присоєння результату вмконання строці х
   // System.out.println(x);
String s1 = " Hello ";
String s2 = "my";
String s3 = " freind ";

String old =s1+s2+s3;//Дана операція конкантенації стоків заберає багато памяті і сповільнює програму
//System.out.println(old);
StringBuilder sb =new StringBuilder("Hello ");//Використання StringBuilder для конкантенації є набагато
    sb.append("friend").append(" freind");    // продуктивнішим
    System.out.println(sb.toString());
}
}
