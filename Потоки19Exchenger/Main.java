package Потоки19Exchenger;

import java.util.concurrent.Exchanger;

//Exchanger використовується для передачі даних між потоками
public class Main {
    public static void main(String[] args) throws InterruptedException {
    Exchanger<String> exchanger = new Exchanger<>();
    new Maic(exchanger);
    new Anket(exchanger);

    }}
 class Maic  extends Thread{
    Exchanger<String>exchanger;


    public Maic(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        start();
    }
     @Override
    public void run() {
        try {
            exchanger.exchange("Hi my name is Mike");
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class Anket extends Thread{
    Exchanger<String>exchanger;

    public Anket(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        start();
    }
    @Override
    public void run() {
        try {
            System.out.println(exchanger.exchange(null));
            String info = exchanger.exchange(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}