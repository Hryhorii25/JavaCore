package ПотокиПріорітет;

public class Main2 {
    public static void main(String[] args) {
      MyRunnable myRunnable = new MyRunnable(); //Це клас який дозволяє створювати потоки і працювати з ними
        Thread thread1 = new Thread(myRunnable);
        thread1.setName("1");
        thread1.start();
        Thread thread2 = new Thread(myRunnable);
        thread2.setName("2");
        try {
            thread1.join(100000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
thread2.start();

    }}

//thread1.join(10000); Метод який задає пріорітет виконання потоку на протязі часу введеного часу
//thread1.setPriority(); Метод який задає пріорітетність виконання потоку
