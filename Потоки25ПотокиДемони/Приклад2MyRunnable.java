package Потоки25ПотокиДемони;
public class Приклад2MyRunnable {
    public static void main(String[] args){
        new TheadDemon();
  Thead thead = new Thead();
  TheadDemon theadDemon = new TheadDemon();
 Thread t = new Thread(thead);
 Thread t1 = new Thread(theadDemon);
 
 t.start();
 t1.start();





    }}

class Thead1 implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<100;i++){
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("Потік "+i);

        }

    }

}

class TheadDemon1 implements Runnable{

    @Override
    public void run() {
        
        for (int i=0; i<100;i++){
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Потік демон "+i);
        }

    }
}
