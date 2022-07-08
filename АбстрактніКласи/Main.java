package АбстрактніКласи;

/**
 * Created by Гріша on 02.07.2017.
 */
public class Main {
public static void main(String[]args){
    Dog dog=new Dog("Rex",2);
    dog.voice();
    Cat cat=new Cat("Tom",1);
    cat.voice();
    PatrolDog patrolDog =new PatrolDog("Spanci",5);
    patrolDog.voice();

}

}
