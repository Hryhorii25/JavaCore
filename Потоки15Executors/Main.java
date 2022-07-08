package Потоки15Executors;

import ПотокиЗадача.MyRunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Екзекютори контроль кількості потоків використовуються для роботи з пулом потоків
public class Main {
    public static void main(String[] args) {
        Executor executor;
        ExecutorService executorService= Executors.newSingleThreadExecutor();//Екзекютор для роботи з одним потоком
        ExecutorService executorService1=Executors.newFixedThreadPool(10);//Екзекютор яким можна задавати кількість потоків
        ExecutorService executorService2= Executors.newFixedThreadPool(2);//Екзекютор створення тимчасових потоків
        executorService.submit(new MyRunnable());


    }
class MyRunable implements Runnable{
    @Override
    public void run() {

    }

   class MyCallable implements Callable<String>{
        @Override
        public String call() throws Exception {
            return "2";
        }
    }


    }
}
