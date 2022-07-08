package Чорновик2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Гріша on 06.08.2017.
 */
public class Main {
    static int  i ;
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        new  MyThreadWrite().start();
        new  MyThreadRead().start();
        //System.out.println(i);


    }
    static class MyThreadWrite extends Thread {

        @Override
        public void run() {
            for (int j = 0; j <100 ; j++) {
                i++;
                System.out.println(i);
                try {
                sleep(1000);
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}
    }

    static class MyThreadRead extends Thread {

        @Override
        public  void run() {
            if (i<=10){
                lock.lock();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
lock.unlock();
                System.out.println("Є десять ");

            }}
            }

        }






