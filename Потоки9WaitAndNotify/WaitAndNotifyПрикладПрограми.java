package Потоки9WaitAndNotify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


//Принцип роботи даної програми наступний(абстрактно) у нас є оператор і є машина  вони мають свої потоки дані потоки перебувають
// тут у двох станах коли він спить і коли його викликають вони чергуються в залежності роботи програми

public class WaitAndNotifyПрикладПрограми {

    static List<String>strings= Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException {

        new Operation().start();
new Maxine().start();


    }
static class Operation extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            synchronized (strings){
                strings.add(scanner.nextLine());
                strings.notify();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
static class Maxine extends Thread{
    @Override
    public void run() {
        while (strings.isEmpty()){
            synchronized (strings){
                try {
                    strings.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(strings.remove(0));
            }
        }
    }
}


}


