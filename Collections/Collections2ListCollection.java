
package Collections;
import java.util.ArrayList;
import java.util.*;

public class Collections2ListCollection {
    public static void main (String[] args ) {
//Даний інтерфейс List(список) розширює Collection, максимально схожий до масивів усі елементи беруться по значенню робота з елементами іде по індексу як у масивах
// Ітерфейс List містить в собі наступні типи колекцій (види List): 1)ArrayList 2)LinkedList 3)Vector 4)Stack 5)synclist


//Основні типи даної колекції

        List arrayList = new ArrayList();//ArrayList це колекція яка являє собою динамічний масив обєктів працює на основі індексів елементів так як масив це начастіше використовуваний
                                          // список який підходить для більшості задач

        List linkedList = new LinkedList();//Це двохнаправлений список який може добавляти інформацію в початок і кінець списку
                                          // зберігає іформацію у нодах він використовується для черг він імплементує інтерфейс Queue
                                         //кожен раз добавляючи елемент в список зберігаться зсилка на елемент який був перший або останній в списку відповідно
                                         // до того коли був добавлений новий елемент
                                         //Нод(Node) являє собою статичний внутрішній клас який зберігає інформацію про теперішній попередній і наступний елемент у списку

        List stac = new Stack();//Це реалізація стеку в інтефейсі List  останній приходить перший іде має синхронізовані методи (робота з потоками)

        List vector = new Vector();//Це той саммий ArrayList тільки в ньому методи синхронізовані(робота з потоками)

        List synclist = Collections.synchronizedList(new ArrayList<>());//Робота з потоками інформація поміщається в синхронізовані блоки



        List<Integer> list1 = new ArrayList();//Найчастіший спосіб створення колекції ArryList

        //Головні методи ArrayList//Шилд 461,464
        arrayList.add(1);//Метод який добавляє новий елемент в ArrayList
        arrayList.add(2, "7");//Метод який добавляє значення  в ArrayList по індеку
        arrayList.remove(2);//Видаляє елмент по його індексу
        arrayList.size();//Виводить кількість елеметів в ArrayList
        arrayList.get(1);//вивід елемента ArrayList по індексу
//System.out.println(list.get(0));//Вівід елемета List по індексу
        arrayList.isEmpty();//Поветає true якщо колекціє немає елементів
        arrayList.contains(arrayList);//Це є метод порівняння двох обєктів поветає true якщо набір має елемент еквівалентний тому що в дужках
arrayList.subList(1,2);//Даний метод дає змогу працювати з діапазоном елементів колекції

        for (int i = 0; i < arrayList.size(); i++) {  //Використання циклу для виводу елементів List
            System.out.println(arrayList.get(i));
        }

        Collections.sort(arrayList);//Метод який сортує колекцію (1,2,3;A,B,C)


        //КОРИСНІ ШТУКИ В LIST

        //1)Робота ітераторів в List

        //Даний приклад показує що використовуючи новий цикл for через ітератор не можна щось міняти в колекції(добавляти видаляти)
        //а тільки проходтись по елементам і відображати їх
        List <String> arrayList1 = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        for (String s: arrayList1){System.out.println(s);
        arrayList1.add("D");
        }

        // Якщо портібно замінти видалити добавити елементи в колекції потрібно використовувати стандартний for() з i++
        for (int i = 0; i < arrayList1.size() ; i++) {
            System.out.println(arrayList1.get(i));
            arrayList1.remove(i);
            
        }


        //2)Сортування(sort) list

        //Тут показано простий метод сортування колекції із стандартнми типами даних тут усе просто ящо це String тоді сортування іде по алфавіту якщо int то по велечені чисел
        for (String s: arrayList1){System.out.println(s);}
            Collections.sort(arrayList1);
            for (String s: arrayList1){System.out.println(s);

                //У випадках коли потрібно провести сортування колекції яка приймає не стандартний клас елементів тобто не стандартних типів даних
                // а колекція з елементів власно створеного класу тоді даний клас повинен імплементити Comparebol  оверайдити в ньому метод і там
                // потрібно вказувати по якому значенню(полю) обєктів повинно відбуватись сортування у колекції тоді можна буде викорастити метод
                // Collections.sort до даної колекції


                //3)Перетворення linkedList в arrayList
                String[] strings= new String[arrayList.size()];
                strings = (String[]) arrayList.toArray(strings);



                 //4)list equals
                //Тут показано що буде якщо порівнювати list колекції методом equals
                System.out.println(arrayList.equals(synclist));//Даний метод можна використовувати для порівння колекцій


    }

}}







