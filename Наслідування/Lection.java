package Наслідування;

/**
 * Created by Гріша on 23.06.2017.
 */
public class Lection {
    public static void main(String[] args){
Animal animal = new Animal();
animal.eat();
animal.sleep();
Dog dog = new Dog("ddf",28);
Cat cat =new Cat();
dog.eat();
dog.sleep();
dog.bark();//Виклик методу який буде у класу Dog
dog.eat();// Виклик перегруженого методу на обєкті
dog.showName();
cat.bark();
cat.eat();
cat.showName();

    }

}
