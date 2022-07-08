package Потоки25ПотокиДемони;
// Потоки демони це потоки які працють доки працює хоч один потік не демон  в програмі.Використовуються вони в основному для обслуговування
// фонових процесів у програмах
// setDaemon() и isDaemon() методи виклику даних потоків


//Дана програма показує роботу потока демона і простого потоку коли простий потік закінчує свою роботу в даному випадку закінчує
// цикл тоді потік демон також завершає свою роботу незалежно від того чи закінчив він свій цикл
public class Приклад {
    public static void main(String[] args){
        new TheadDemon();
  Thead thead = new Thead();
  TheadDemon theadDemon = new TheadDemon();
  thead.start();
  theadDemon.start();

    }}

class Thead extends Thread {

    @Override
    public void run() {
        for (int i=0; i<10;i++){
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("Потік "+i);

        }

    }

}

class TheadDemon extends Thread{

    public TheadDemon() {

        setDaemon(true);//Через конструктор обєкта робимо потік демоном викликаючи певний метод в конструкторі
    }

    @Override
    public void run() {


        for (int i=0; i<100;i++){
            if (i==25){setDaemon(true);} // змінювати статус потоку можна із використанням логіки
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Потік демон "+i);
        }

    }
}







