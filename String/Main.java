package String;

/**
 * Created by Гріша on 18.06.2017.
 */
public class Main {
    public static void main(String[] args) {
String s1 ="Hellow World";//Створення строки
String s2 ="Hellow World";//Якщо значення двох строк збігаєтьється друге значення не а зберігається а створюєть тільки ссилка
String s3 =new String("abc") ;//

System.out.println(s1);
System.out.println(s2);



        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.getBytes());
        System.out.println(s1.getBytes());






    }
}