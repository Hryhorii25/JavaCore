package ПерегрузкаМетодів;

/**
 * Created by Гріша on 29.06.2017.
 */
public class Main {
    public static void main (String[] args ) {

    Dog dog = new Dog();
    Animal animal = new Animal();

    Animal animal1 = new Animal() {
        public void eat() {
            System.out.println("Othher animal is eting");//Перегрузка методу на окремому обєкті
        }
    };

    animal.move();
    dog.mov();
}}
