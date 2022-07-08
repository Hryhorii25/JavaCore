package ПотокиЧорновик;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Гріша on 05.11.2017.
 */
public class Main1 {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();//Створення
    static int account =0;

    public static void main(String[] args) throws InterruptedException {
Potic1 potic1 = new Potic1();
Potic2 potic2 = new Potic2();
potic1.start();
potic2.start();


    }

  static   class Potic1 extends Thread{
        @Override
        public  void run() {
            try {
                sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             {
account+=10;
                condition.signal();




            }
            ;

        }


    }



  static class Potic2 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <100 ; i++) {
                account-=10;
                if (account<10){
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Потік 2 "+i);

            }

        }}}



















