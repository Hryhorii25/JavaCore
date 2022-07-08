package Потоки17Semofors;

import java.util.concurrent.Semaphore;

//Семафори це клас який дозволяє в багатопоточній програмі працювати з декількома багатопоточними ресурсами.
// Працює по типу ресторану у якому є столики деякі з них вільні інші заняті коли приходить відвідувач він сідає за
// столик або чекає в залежності чи є вільні столи. В програмі це працює наступним чином у нас декілька ресурсів і декілька
// потоків які виконуються в програмі ці потоки займають ресурси і працюють з ними якщо усі ресурси заняті потоками інші потоки
// в програму зайти не зможуть поки не звільниться якись з ресурсів таким чином можна обмежити кількість потоків яві будуть працювати з ресурсом

//У даній програмі ніби створюється два крісла з столиком тобто одночасно за одним ресурсом можуть працювати два потоки
public class Main {public static void main(String[] args) {
Semaphore table = new Semaphore(2);//Даний обєкт приймайнає на вхід кількість дозволів(крісел) які можна видати на користування ресусом потокам

Person person1 = new Person();
Person person2 = new Person();
Person person3 = new Person();
Person person4 = new Person();
Person person5 = new Person();
Person person6 = new Person();
person1.table = table;
person2.table = table;
person3.table = table;
person4.table = table;
person5.table = table;
person6.table = table;
person1.start();
    person2.start();
    person3.start();
    person4.start();
    person5.start();
    person6.start();

}

static class Person extends Thread {
    Semaphore table;

    @Override
    public void run() {
        System.out.println("weating for table");
        try {
            table.acquire();//семафор видає потоку один свій дозвіл на роботу з ресурсом
            System.out.println(this.getName()+"eat at the table");
            sleep(1000);
            System.out.println(this.getName()+"release table");
            table.release();//Потік звільняє ресурс (крісло звільняється)
            table.availablePermits();//Даний метод повертає кількість дозволів які залишились у семафора на користування ресурсом
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}
