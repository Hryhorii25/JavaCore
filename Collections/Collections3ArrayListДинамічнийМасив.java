package Collections;

import java.util.ArrayList;
import java.util.List;

//Array List реалізований через внутрішній масив
public class Collections3ArrayListДинамічнийМасив {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

for (int i =0; i<100; i++){ //Простий цикл для запису в ArrayList
    arrayList.add(i);
}
System.out.println(arrayList);

System.out.println(arrayList.get(0));//Вивід з колекції по індексу
System.out.println(arrayList.get(99));

System.out.println(arrayList.size());//Вивід довжини масиву


        //Способи проходження по колекції ArrayList

        //1)Циклом for
        for (int i = 0; i <  arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));

        }

        //2)Циклом fori
        for (Integer x:arrayList){
            System.out.println(x);
}

//3)Використання лямда функції

         arrayList.forEach(System.out::println);

//Метод remove(видалення елемента) даний метод являється не  ефективним для роботи з даною колекцією. Якщо даним методом видаляти елемент
// з кіця колекції він є єфективним але якщо робити видалення із середени або початку даний метод забирає багато ресурсів за рахунок того
// що при видаленні з колекції елементу колекція повинна перебудовуватись точніше та частина яка розташована від видаленого елемента і
// до кінця колекції.Чим ближче від початку колекції відбудеться видалення тим більшу чатину колекції потрібно перебудовувати.
// Перебудова колекції це видалення елементу за вказаним індексом і зсув іншик елементів по індексах
        arrayList.remove(5);//Видаляє з колекції елемент з заданим індексом
    }
}


//DEFAULT CAPASUTI 10
//Розмір внутрішньго масиву даної колеції