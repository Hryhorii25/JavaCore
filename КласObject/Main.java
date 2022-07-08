package КласObject;

/**
 * Created by Гріша on 25.07.2017.
 */
public class Main {
    public static void main (String[] args ) {
Human human = new Human("A");//Створюємо обєкт класу Human
Human human1 = new Human("A");
System.out.println(human);// Викикаєм метод виводу на консоль виводиться клас обєкта і комірка адрес памяті в якій знаходиться даний обєкт
 System.out.println(human1.toString());//Виклик даного методу є тим самим що і запис вище тільки на іншім обєкті
System.out.println(human.equals(human1));//Порівнює поля усередині обєктів
System.out.println(human==human1);//Порівнює адреса комірок паматі обєктів
System.out.println(human.hashCode());
System.out.println(human1.hashCode());





    }}
