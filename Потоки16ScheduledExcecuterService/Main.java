package Потоки16ScheduledExcecuterService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Програма як "шедулити" потоки керувати часом їхньго виконання задавати певний розклад виконання потоків
public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new MyTherad(),3, TimeUnit.SECONDS);//Даний метод керує часом створення і запуску потоку
    }


static class MyTherad extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            try {
                MyTherad.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1");
        }

    }
}

}
