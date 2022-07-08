package String;

//
public class СтворенняОбєктівString {
    public static void main(String[] args) {
        String s1 ="Hellow World";//Створення строки
        String s2 ="Hellow World";//Якщо значення двох строк збігаєтьється друге значення не а зберігається а створюєть тільки ссилка
        System.out.println(s1.equals(s2));//Метод equals здійснює порівняня вмісту строк   s1  s2
        String s3 =new String("abc") ;
        String s4 =new String("abc") ;
        System.out.println("s3 eq s4 "+s3.equals(s4));
        System.out.println("s3 == s4 "+(s3==s4));//В даному випадку відбуваєть порівння зсилок (адресів) строк
        System.out.println("s3 == s4 "+(s1==s2));






    }
}

