package Чорновик;

public class Main {
    public static void main (String[] args ) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
    animal.setAge(10);

        System.out.println(animal.getAge());
        System.out.println(animal1.getAge());
    }
}

class Animal {
    int age;
   String name;
   int rahunoc;
    public Animal(){}

    public int getAge() {
        return this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;

    }

    void saySound(){System.out.println("");}
}






class Dog extends Animal  {
    Cat cat1;
    int a=10;
    int b =5;
    int c;



    void dogMetod(){System.out.println(); }
    public void setResorse(int c) {
        this.c=this.b+this.c ;
    }

}

class Cat  {
    int a=10;
    int b =5;
    int c;
    void saySound(){System.out.println("I am Cat");}
    void catMetod(){System.out.println(); }

}







