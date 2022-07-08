package Потоки3СинхронізаціяПотоків;

public class Synchrovized3 {
    private  int counter;
    public static void main(String[] args) throws InterruptedException {
        Synchrovized3 synchrovized= new Synchrovized3();
        synchrovized.doWork();
    }
public  void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++)
                    counter++;

                }
        });

    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i <1000 ; i++) {
                counter++;
            }

        }
    });


    thread1.start();
    thread1.join();//при запуску даного методу потік Main зупиняється (або інші потоки які виконуються в Main) і чекає поки закінчиться поток thread1
    thread2.start();
    thread2.join();

    System.out.println(counter);


    }

}
