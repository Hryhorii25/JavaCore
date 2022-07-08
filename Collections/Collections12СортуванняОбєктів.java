package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
//У даній програмі потрібно відсортувати елементи колекції без доступу до класу Persons для цього потрібно створити окремий клас який імплементуватиме Comparator
public class Collections12СортуванняОбєктів {
    public static void main(String[] args) {
        ComperPersons comperPersons =new ComperPersons();//3)Створення обєкта класу який має метод сортування колекції
        Set set = new TreeSet(comperPersons);//4)Передаємо обєкт в даний метод
        set.add(new Persons(5));
        set.add(new Persons(1));
        set.add(new Persons(4));
        set.add(new Persons(3));
        set.add(new Persons(2));

        for (Object o : set) {
            System.out.println(o);
        }
    }
}

//1)Створення класу і імплементування Comparator в цьому класі уже прцюють з обєктами  які потрібно відсортувати
class ComperPersons implements Comparator<Persons>{

    @Override
    public int compare(Persons o1, Persons o2) {//2)Обовязково потрібно оверайдити даний метод і перегрузити його
        return o1.age-o2.age;
    }
}




class Persons {
    int age;

    public Persons(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }






}

