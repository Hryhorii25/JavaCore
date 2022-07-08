package Потоки12TryLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Принцип роботи даної програми один потік виконує певну роботу, другий потік прийшов і буде запитувати чи можна працювати чи вільний
// ресурс поки ні буде виводитись чекати в даній програмі застосовується  lock.tryLock()) це є як елемент логіки(trye or fals) який перевіряє чи даний обєкт ще залочений
public class Main {
  static   Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
new Thread().start();
new Thread2().start();


    }

static class Thread1 extends Thread{
    @Override
    public void run() {
        lock.lock();
        System.out.println(getName()+"Start working");
        try {
            sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    System.out.println(getName()+"Stop worcing");
        lock.unlock();
        System.out.println("Lock ist relesaited");
    }
}

    static class Thread2 extends Thread{
        @Override
        public void run() {
            super.run();
            System.out.println(getName()+"begin worcing");
            while (true){
            if (lock.tryLock()) {// Викорисання lock.tryLock з певною логікою програми
                System.out.println(getName()+"worcing");
            break;
            }else {System.out.println(getName()+"weating");

            }
        }
    }}}





