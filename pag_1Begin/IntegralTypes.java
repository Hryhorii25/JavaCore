package pag_1Begin;

/**
 * Created by Гріша on 23.05.2017.
 */
public class IntegralTypes {
    public static void main(String[] args) {
        byte b = 126; // Вот тут будет ошибка, т.к. у нас диапазон от -128 до 127!
        short s = 1123;
        int i = 64536;
        long l = 2147483648L; // Постфикс l или L обозначает литералы типа long
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
    }
}
