package Конструктори;

/**
 * Created by Гріша on 29.06.2017.
 */
public class Animal extends Object {
   int i;
   String name;

    public Animal(int i, String name) {
        System.out.println("I am animal");
        this.i = i;
        this.name = name;
    }

    public void move(){
        System.out.println("run");
    }
}
