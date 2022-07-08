package Collections;




import java.util.*;


//Queue(черга) різновид колекцій
public class Collections13QueueDequeueStack {
    public static void main (String[] args ) {
//Даний інтерфейс являє собою чергу він працює по принципу черги, буває двохнаправлена(
        // 1)Перший прийшов перший пішов 2)Перший приходиш останній ідеш()черга



        //Queue бувають двох типів імплементації Queue

        Queue queueLinked = new LinkedList();//Даний тип працює як черга перший прийшав перший підеш

        Queue priorityQueue  = new PriorityQueue();//Даний тип явлає собою відсортовану чергу при добавленні елементів відбувається автоматичне сортування
                                                  // при добавленні елементів вони будуть добавлятись з однієї сторони а забиратись з іншої

        Queue<String> blocingQueue = new LinkedList<>();//Даний (блокуча черга) Queue використовується у роботі з потоками


        //Stack<String>stringStack = new StringStack();//Останній прийшав перший ідеш при добавленні елементів вони будуть добавлятись і забиратись з однієї сторони

        //Методи
        priorityQueue.add("1");//Метод який добавляє новий елемент в обєкт Queue
        priorityQueue.offer("2");//Метод який добавляє новий елемент в обєкт Queue
        priorityQueue.add("3");
        priorityQueue.add("4");
        priorityQueue.offer("7");//Метод схожий до add  який добавляє новий елемент в обєкт Queue
        priorityQueue.remove();//Видаляє перший елемент з колекції
        priorityQueue.peek();//Метод який дістає елемент з даної колекції(метод get)
        priorityQueue.poll();//Метод який дістає елемент з даної колекції і видаляє його

        for (int i = 0; i < priorityQueue.size(); i++) {  //Використання циклу для виводу елементів колеції
            System.out.println(priorityQueue.peek());
        }


//Deque це двохнапрвлена черга можна отримувати доступ як до першого так і до останнього елемета колекції він
// може працювати як стандартна черга переший прийшов перший пішав або як стек останній прийшав перший вийшов
        Deque<String> arrayDeque = new ArrayDeque<>();
        Deque<String> lincedDeque = new LinkedList<>();

        //методи Deque Шилд 467ст
        //методи Deque які добавляють нові елементи
        lincedDeque.addFirst("g");
        lincedDeque.add("1");
        lincedDeque.offer("2");
        lincedDeque.offerFirst("3");
        lincedDeque.offerLast("4");
        lincedDeque.push("5");
        lincedDeque.peek();//Дістає елемент але не видаляє його з колекції

        //методи Deque які видаляють елементи з колекції
        lincedDeque.remove();
        lincedDeque.removeFirst();
        lincedDeque.removeLast();
        lincedDeque.pollLast();
        lincedDeque.pollFirst();

    }}

