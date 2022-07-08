package Потоки9WaitAndNotify;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotifi wn = new WaitAndNotifi();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });



        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}

class WaitAndNotifi{
    public  void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread started");
            wait();
            System.out.println("Producer thread started");
        }

    }
public void consumer() throws InterruptedException {
        Thread.sleep(5);
    Scanner scanner = new Scanner(System.in);
    synchronized (this){
        System.out.println("waiting for return key pressed");
        scanner.nextLine();
    }

}
}