package Потоки1СтворенняПотоків;

/**
 * Created by Гріша on 05.11.2017.
 */
public class Thead2ПрикладРоботиПотоків {public static void main(String[] args) throws InterruptedException {
Potic potic = new Potic();
Potic1 potic1 = new Potic1();
potic.start();
potic1.start();


//potic.join();
}}

class Potic extends Thread{

     @Override
     public void run() {
         for (int i = 0; i <100 ; i++) {
             try {
                 sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println(i+"Потік 1");
         }
     }
 }

class Potic1 extends Thread{
    int a;
    int b;

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"потік 2");

    }
}}