package Поліморфізм2;

/**
 * Created by Гріша on 03.07.2017.
 */
public class Cat extends Animal {
    int age = 5;
    public void setAge(){System.out.println(age);};
    public  void catMetod(){System.out.println("I em cat");};

    @Override
    public void eat() {
       System.out.println("Cat is iting");
    }
//  public void eat(){System.out.println("Cat is iting");}}



    }

