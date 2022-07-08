package Поліморфізм2;

/**
 * Created by Гріша on 03.07.2017.
 */
public class Test {
    public static void main(String[]args){


Animal animal= new Animal();
Dog dog=new Dog();
Cat cat =new Cat();
Animal dog1 =new Dog();//Створення обєкта типу Animal і класу Dog дане поле стоворює обєкт Dog в класі Animal
                       //даний обєкт буде мати доступ тільки до методів класу Animal

cat.eat();
Animal animal1 = new Cat();
animal1.animalMetod();



//test(animal);
//test(dog);
//test(cat);
//test(dog1);





    }
public static void test(Animal animal){
        animal.eat();
}



}

