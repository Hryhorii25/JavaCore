package Collections;

import java.util.*;

//SetColection це колекція  унікальних елеметів в дану колекцію неможна помістити два одинакових елементи і вивести їх
public class Collections8SetCollection {
    public static void main (String[] args ) {
//Різновиди даної колекції
        Set hashSet = new HashSet();//неупорядкований зберігає виводть  дані у випадковому порядку не допускає доблювання елементів для зберігання даних викорисовує хеш таблицю

        Set linkedHashSet = new LinkedHashSet();//упорядкований по тому як ці елементи були введені

        Set treeSet = new TreeSet();//відсортована,для зберігання елементів колекції викорстовується дерево в даній колекції можна
                                   // задати метод сортування

        EnumSet enumSet = new EnumSet();//Це є окремий різновид колекції який реалізує інтерфейс Set.Створюється колекція
                                        // яка призначена для використання з ключами типу Enum




//Усі різновиди hashSet колекції працюють на основі maps

        hashSet.add("1");//Метод який добавляє новий елемент в Set
        hashSet.add("1");
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        hashSet.add("6");
        for (Object o: hashSet){
            System.out.println(o);
        }

        //TreeSet являється аналогічним класом HashSet за виключення того що TreeSet являється сортованим набором даних()Sorted collection)
        //За замовчуванням стрінгові дані в даній колекції при виводі пересортовуються в алфавітному порядку


        //Метод який показує чи є значення у даній колекції(Якщо потрібно визначити чи є певний елемент у колекції то колекція hashSet або інші Set колекції
        // саме швидше працює при виконанні даної задачі відносно інших видів колекцій в яких також є метод contains )
        System.out.println(hashSet.contains("3"));



    }}

    class EnumSet<E extends Enum<E>>{
    EnumSet enumSet = new EnumSet();//Це є окремий різновид колекції який реалізує інтерфейс Set.Створюється колекція яка призначена для використання
    //з ключами типу Enum
        //Методи Г.Шилд ст 480

}