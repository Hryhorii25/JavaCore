package Інтерфейси;

/**
 * Created by Гріша on 23.06.2017.
 */
public class Person implements Info {
    public String name;
    //int age =17;
    public Person(String name){
        this.name=name;}
    /*public void sayHellow(){
        System.out.println("Hello");
    }*/

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void showInfo() {
        System.out.println("Name this "+ this.name);
    }

    @Override
    public void showAge() {System.out.println(age);

    }
}
