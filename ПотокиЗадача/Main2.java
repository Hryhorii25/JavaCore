package ПотокиЗадача;

//Другий спосіб реалізації потоків
public class Main2 {
    public static void main(String[] args) {
       Runnable myRunnable = new MyRunnable(); //Це клас який дозволяє створювати потоки і працювати з ними
        //thead.setName("Потік один ");//Метод який дозволяє давати імена потокам

        Thread thread = new Thread( myRunnable);
        Thread thread1= new Thread(myRunnable);
       thread.setName("Потік 1");
        thread1.setName("Потік 2");
       thread.start();
       thread1.start();

    }}

