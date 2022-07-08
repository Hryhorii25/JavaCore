package Generics;

import java.util.ArrayList;
import java.util.List;
//Тут розглядається робота  дженериків при наслідуванні
public class GenericsWildcards {
    public static void main(String[] ards) {
        List<Animal> listofAnimal = new ArrayList<>();//1)Сворення колекції типу arrayList в якій будуть поміщатись обєкти класу Animal
        listofAnimal.add(new Animal(1));//2)Добавляємо елементи в дану колекцію
        listofAnimal.add(new Animal(2));
    test(listofAnimal);//5)Викликаємо метод test на колекції даний метод виводить поле id в усіх обєктах даної колекції

    List<Dog>listofDogs = new ArrayList<>();//6)Сворення колекції типу arrayList в якій будуть поміщатись обєкти класу Dog
        listofDogs.add(new Dog(10));
        listofDogs.add(new Dog(20));
        test1(listofDogs);//8)//5)Викликаємо метод test1 на колекції даний метод виводить поле id в усіх обєктах даної колекції


        List<Cat>listofCat = new ArrayList<>();
        listofCat.add(new Cat(45));
        listofCat.add(new Cat(38));
    test1(listofCat);

    }

    private static void test(List<Animal> list) {//3)Статичний метод який приймає колекцію з обєктами класа Animal  даний метод виводить якесь поле
        for (Animal animal : list) {
            System.out.println(animal);

        }}


    private static void test1(List<? extends Animal> list) {//7)Статичний метод який приймає колекцію з обєктами будь якого класу List<?>
        for (Animal animal : list) {                       // які наслідують Animal  замість внесення класу  у колекції ставиться знак запитання

            System.out.println(animal);

        }


    }


}


//4)Створюєм клас у данім класі створюється поле і конструктор
class Animal{

    private int id;
    public Animal(int id){
        this.id = id;
    }
    public String toString(){     //У данім класі обовязково потрібно перевантажувати метод toString(колекції)
        return String.valueOf(id);
    }

}
















class Dog extends Animal{

    public Dog(int id) {
        super(id);
    }
}














class Cat extends Animal{

    public Cat(int id) {
        super(id);
    }
}
