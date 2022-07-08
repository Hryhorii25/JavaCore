package Рекурсія;
//Рекурсія це виклик методу у тому самому методі
public class Test {
    public static void main(String[] args) {

    somMetod(0);
    }
//Приклад використання рекурсії для реалізації простого циклу
        private static void somMetod (int n){
            System.out.println(n);
            if (n==5)
                return;
            somMetod(n+1);

}}
