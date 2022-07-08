package Інтерфейси;

/**
 * Created by Гріша on 23.06.2017.
 */
public class Test {
    public static void main (String[] args ) {
Animal animal1= new Animal(1);
Person person1= new Person("Bob");
person1.showInfo();
animal1.showInfo();
animal1.showAge();
person1.showAge();
System.out.println();
}
}
