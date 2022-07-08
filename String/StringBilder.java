package String;

//Тут розгдлядається тип StringBuilder він застосовується для зміни строкових даних у строці
//При переініціалізації або контантенції стрінгових обєктів сам обєкт не змінюєть а створюється новий і при частій переініціалізації або
// контантенції забирається багато памяті
public class StringBilder {
    public static void main(String[] args) {
String s ="abc";//Після створення і ініціалізації даногої змінної, текст даної змінної після змін не можна, для цьго використовують тип StringBuilder
String s1="kls";
String s2="vsm";
StringBuilder a= new StringBuilder("abcd") ;
System.out.println(s+s1+s2);//Дана операція забирає багато память таяк для неї потрібне створення обєктів сам обєкт не міняєть
//Методи StringBuilder
        System.out.println(s);
StringBuilder stringBuilder= new StringBuilder();
stringBuilder.append("Hello ");//Даний метод дозволяє проводити конкантенцію строк без створення нових обєктів
stringBuilder.append("frend");
System.out.println(stringBuilder.toString());//Метод виведення тестової строки з обєкту типу StringBuilder
        a.append("Java");//Здійснює конкатенецію строк
        System.out.println(a);

    }
}
