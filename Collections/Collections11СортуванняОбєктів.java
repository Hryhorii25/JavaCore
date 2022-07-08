package Collections;





import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//ст 495 Г.Шилд

//Якщо у колекціях задіяні прості типи даних такі як int string тоді JAVA знає як їх сортувати по величині або алфавіту але
// якщо у колекцію поміщено якийсь свої обєкти тоді стандартне сортування елементів в колекції працювати не буде
//У даній програмі показано за яким алгоритмом потрібно сортувати елементи колекції якщо елементи являються обєктами власного створненого класу
public class Collections11СортуванняОбєктів {
    public static void main(String[] args) {

        List <Person> people = new ArrayList<>();
        people.add(new Person(5,"Victor"));
        people.add(new Person(1,"Ivan"));
        people.add(new Person(4,"Oleg"));
        people.add(new Person(3,"Frenk"));
        people.add(new Person(2,"Nazar"));


        Collections.sort(people);
        System.out.println(people);


        //Сортування через анонімний клас
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return 0;
            }
        });




        //        for (Object o : set) {        //Цикл виводу відсортованих елементів колекції
//                System.out.println(o);
//        }
    }
}



//Для того щоб можна було відсортувати обєкти власного класу, потрібно щоб власний клас
// implements Comparable і оверайдити метод compareTo в якому те поле обєкта яке повертається
//  методі і є полем по якому буде ввідбуватися сортування

    class Person implements Comparable<Person> {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }


        //Метод в якому реалізована логіка сортування елементів  в данім випадку логіка прописана так що сортування буде відбуватися по
        // полю age по зрозтанню
        @Override
        public int compareTo ( Person person) {

            if (this.age>person.age){
                return 1;
            }else if (this.age<person.age){
                return -1;
            }else
                return 0;
        }



        //Щоб був вивід по індексу потрібно оверайдити даний метод
        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    " name=" + name +
                    '}';
        }





    }


