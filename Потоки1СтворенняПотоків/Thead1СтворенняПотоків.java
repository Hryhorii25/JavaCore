package Потоки1СтворенняПотоків;

//https://habrahabr.ru/post/164487/
//Багатопотокова програма дві або більше частини які можуть виконуватися одночасно, кожна частина такої програми називається
// потоком(thread), і кожний потік має знає окркмий шлях виконання. В загальному багатопотоковість це здатність програми виконувати
// делька процесів (задач) одночасно
//Шилд ст 256 методи крування потоками класа Thead

public class Thead1СтворенняПотоків {
    public static void main(String[] args) {

        //3)
        MyThread myThread = new MyThread();//Створення обєкту яикй дозволяє працювати з потоками (створення потоку)
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread.start();// Метод який запускає потік. При виклику даного методу запускається метод run класу MyThread
        myThread1.start();
        myThread2.start();

        //myThread.run();//Виклик методу run, просто буде відбуватись реалізація методу без створення поку





        //4)Створення потоку(створення обєкта) із обєкта класу який імплементує Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();//Запуск потоку фактично запуск методу run у обєкта даного класу
       //new  MyThread().start(); // інший скорочеий спосіб створення обєкту і одразу виклик методу


       // myThread.setName("Потік один ");//Метод який дозволяє давати імена потокам








    }
}

//1)Перший спосіб реалізації потоків через наслідування класу Thread.
//Коли даний клас наслідує клас Thread тоді обєктам даного класу стають доступні методи роботи з потоками оновний метод run()
    class MyThread extends Thread {

    public MyThread() {

    }

    @Override


    public void run() {             //Та логіка (код) яка в середені даного методу run() і є фактично потоком
        for (int i =0;i<10;i++) {
            System.out.println("running name" + Thread.currentThread().getName());
        }}


}
//2)Другий спосіб реалізації потоків через імплеметацію інтерфейсу
//Коли даний клас імплементить даний інтерфйс тоді обєктам даного класу стають доступні методи роботи з потоками
class MyRunnable implements Runnable {


    @Override
    public void run() {
        for (int i=0; i<100;i++){
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" i "+i+"theread name:"+Thread.currentThread().getName());
        }

    }


    //3)Третій спсіб реалізації потоків через анонімний клаc
    Thread thread3 = new Thread(new Runnable() {


        @Override
        public void run() {

        }
    });



}












//Runnable r = new MyRunnable();
//Thread t = new Thread(r);
//t.start();

