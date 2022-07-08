package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Collections14Queue {
    public static void main(String[] args) {
        Person1 person = new Person1(1);
        Person1 person2 = new Person1(2);
        Person1 person3 = new Person1(3);
        Person1 person4 = new Person1(4);


        //В даному випадку представлена реалізація Queue через LinkedList являє собою стандартну чергу перший прийшав перший пішов
        Queue <Person1> people = new LinkedList<>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person);

        for (Person1 person1:people){
            System.out.println(person);
        }

        Queue <Person> people1 = new ArrayBlockingQueue<Person>(10);

    }
}

class Person1{
    private  int id;

    public Person1(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}