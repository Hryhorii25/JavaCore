package Потоки3СинхронізаціяПотоків;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Synchrovized2 {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
        Object lock1 = new Object();
        Object lock2 = new Object();




    }
}

class Worker{
    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() throws InterruptedException {
        for (int i = 0; i <1000 ; i++) {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        }
        }


    public void addToList2() throws InterruptedException {
        for (int i = 0; i <1000 ; i++) {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        }
    }

public void work() throws InterruptedException {
        addToList1();
        addToList2();
}

    public void main() throws InterruptedException {
        long befor = System.currentTimeMillis();

        Thread thread1 = new Thread();
work();
        long after = System.currentTimeMillis();
        System.out.println("Program took"+(after-befor));

        System.out.println("List1 "+list1.size());
        System.out.println("List2 "+list2.size());
    }
}