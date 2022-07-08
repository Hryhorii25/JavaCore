package Поліморфізм;

/**
 * Created by Гріша on 29.06.2017.
 */
public class Main {
    public static void main (String[] args ) {

    Bird bird5= new Bird();
    Animal animal = new Animal();
    Animal animal1= new Bird();
    animal.move();
    bird5.abs();
    animal.move();
    bird5.abs();
        ((Bird)animal1).abs();

    }


}
class Bird extends Animal {

    @Override
    public boolean equals(Object obj){
        return this.i==((Bird)obj).i;
    }
    public void abs(){System.out.println("ABS");}
}



class Animal extends Object {
    int i;
    public void move(){
        System.out.println("run");
    }
}
class Fish extends Animal {
}

