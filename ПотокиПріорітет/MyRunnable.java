package ПотокиПріорітет;

//Другий спосіб реалізації потоків
public class MyRunnable implements Runnable {

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
}
