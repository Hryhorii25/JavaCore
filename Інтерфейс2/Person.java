package Інтерфейс2;

/**
 * Created by Гріша on 23.06.2017.
 */
public class Person implements Info {
    public String name;
    public Person(String name){
        this.name=name;}
    public void sayHellow(){
        System.out.println("Hello");
    }

    public void showInfo() {
        System.out.println("Name this"+ this.name);
    }

    @Override
    public void showAge() {

    }

    public void sleep(){
        System.out.println("Person is sleeping");
    }

}
