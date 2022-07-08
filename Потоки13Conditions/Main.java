package Потоки13Conditions;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Condition це метод керування роботи потоками з використанням умов при створенні спеціального обєкта умови .В даній програмі є створено два потоки один віднімає значення
// поля інший додає.І є створена умова при якій дозволено або заблоковано виконання певної операції(потоку).
public class Main {


    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();//Даний блок  коду створює обєкт умови
    static int account =0;



    public static void main(String[] args) throws InterruptedException {
new AccauntVid().start();
new AccauntPlus().start();
    }
static class AccauntPlus extends Thread{
    @Override
    public void run() {
        lock.lock();
account+=10;
condition.signal();
lock.unlock();
    }
}

    static class AccauntVid extends Thread{
        @Override
        public void run() {
            if (account<10){//Задається умова при якій буде задіяно обєкт condition
                try {
                    lock.lock();
                    System.out.println("account="+ account);
                    condition.await();//Виклик спеціального методу очівання
                    System.out.println("account="+ account);
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            account-=10;
System.out.println("account at the end="+account);

        }
    }
}