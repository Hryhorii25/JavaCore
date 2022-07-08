package Generics;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=LF8ETKQQEXg
// https://www.youtube.com/watch?v=iQIR2Zgb93k
// https://www.youtube.com/watch?v=5gU2wrQnbJs

//Використання дженеріків:
// 1)Для зберігання інформації
// 2)Використання дженеріків дозволяє використовувати дані з різними типами без зміни їхньго опису
// 3)З їх допомогою можна обявляти класи інтерфейси методи де тип даних вказаний у вигляді параметра

public class Generics1 {
    public static void main (String[] ards) {
        //Застосування джинеріків у колекція
        List<String> name = new ArrayList<>();//Даний запис означає створення дженеріка :Колекція типу List яка приймає тип тільки String назва list
        List<Integer> age = new ArrayList<>();//Дана колекція може приймати тільки Integer
        name.add("Stepan");
        name.add("Vasil");
        age.add(20);
        age.add(27);

    Cell<String> stringCell = new Cell<String>("olsd");//Створення дженерік обєкта
        stringCell.setT("Hellow");//Поміщення даних в дженерік обєкт
    }
}

class Cell<T>{//Створення класу з джинерік типом де <T> означає що в класі буде змінна дженерік типу тобто уніресальна змінна
    T t;

    <T> Cell(T t){};// Створення конструктора обєкта із дженеріком

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}


