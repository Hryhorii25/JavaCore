package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Колекція linkedList має складну будову в середені зберігається не масив а такий собі ланцюг звяємозвязаних обєктів(вузлів) у кожного з даних
// вузлів є певне значення і є зсилки на попередній і наступний обєкт у списку.

//При добавлянні нових елементів у LinkedList  відбуваються наступні дії елемент який приходить добаляються в список даних вузлів
// і щоб задати позицію цього елемента у колекції використовється внутрішня зсилка в елементі яка буде вказувати на наступний елемент в списку
// якщо при цьому відбудеться зміна позиції іншого елемента зсилка в цьому елементі також тільки поміняє своє значення на індекс н наступного елемента
// за рахунок такої внутрішньої релазації LinkedList набагато швидше парацює із добавлянням елемента у початок або  середени списку

//Є два види LinkedList це однозвязаний список і двохзвязаний список в java реалізований тільки двохзвязаний список


public class Collections4LinkedListЗвязанийСписок {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList= new ArrayList<>();

        //Добавляння елементів
       measureTime(linkedList);
        measureTime(arrayList);
    }

    //В данім прикладі показано швидксть роботи Array i Linket колекцій при виконанні різних операцій
    //1)При добавлянні елементів у колекцію в кінець масиву швидше працює Array
    //2)При зчитуванні елментів з колекції набагато швидше працює Array
    //3)При добавлянні і видаленні елементів у колекції на початок або в сиредину масиву швидше працює Linket




    private static void measureTime(List<Integer> list){


        long stat =System.currentTimeMillis();

        for (int i = 0; i < 100000 ; i++) {
            list.add(0,i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end-stat);
    }










    //Метод який визначає швидкість зчитування елементіів з колекцій
//    private static void measureTime(List<Integer> list){
//
//        for (int i = 0; i < 100000 ; i++) {
//            list.add(i);
//        }
//        long stat =System.currentTimeMillis();
//
//        for (int i = 0; i < 100000; i++) {
//list.get(i);
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println(end-stat);
//    }





     //В данім випадку

// Метод визначає швидкість добавляння у кінець масиву (розширення масиву)
// private static void measureTime(List<Integer> list){
//
//        long stat =System.currentTimeMillis();
//
//        for (int i = 0; i < 10000000 ; i++) {
//            list.add(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-stat);
//    }

}
