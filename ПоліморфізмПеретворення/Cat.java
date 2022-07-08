package ПоліморфізмПеретворення;

/**
 * Created by Гріша on 03.07.2017.
 */
public class Cat extends Animal {
    int age = 5;
    public void setAge(){System.out.println(age);};

    @Override
    public void vois(){System.out.println("May");}

      @Override
    public void eat(){System.out.println("Cat is iting");}}





