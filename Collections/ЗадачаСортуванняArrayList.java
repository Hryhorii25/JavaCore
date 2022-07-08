package Collections;

//import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Гріша on 26.09.2017.
 */
//Задача по сортуванню ArrayList
//В даній задачі розглядається сортування обєктів якогось класу по значенню певного  поля обєкта
public class ЗадачаСортуванняArrayList {
    public static void main (String[] args ) {
        List<Student> arrayList = new ArrayList();
        arrayList.add(new Student(1));//Створення обєкта зразу усередені колекції
        arrayList.add(new Student(3));
        arrayList.add(new Student(2));
for (Student student: arrayList){
    System.out.println(student.id);
}

Collections.sort(arrayList);
    }

}

//Щоб можна було застосувати сортування в колекції до обєктів даного класу потрібно обовязково щоб даний клас імплементував
// інтерфейс Comparable і потрібно оверайдити метод compareTo
class Student implements Comparable{

    int id;
    String name;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public int compareTo( Object o) {//Даний метод поветає те поле по якому потрібно сортувати обєкти return id в даному випадку по id
        return id;
    }
}


