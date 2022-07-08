package Потоки27ПулПотоковThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);//Даний запис і є пул потоків число це кількість потоків

        //Даний блок коду означає що двом потокам executorService дається пять задач
        for (int i = 0; i <5 ; i++) {

            //В обєкт даного класу передається обєкт класа який реалізує інтерфейс Runnable тобтообєкт який може прцювати в потоках
            executorService.submit(new Work(i));
            executorService.shutdownNow();//Метод який запускає виконання задач
            System.out.println("All tasks submitted");
            executorService.awaitTermination(1,TimeUnit.DAYS);//даний метод встановлю граничний час за який потоки повинні встигнути виконати задачі

        }

    }
}

class Work implements Runnable{
    private  int id;
    public Work(int id){
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worc " + id + " is completed");
    }
}