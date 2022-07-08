package Потоки23ForkJoinFramework;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

//У даній прогарамі представлено способи пришвидшення роботи програми за рахунок розділення певної операції на декілька потоків і розділення
// роботи цих потоків між ядрами процесора
//ForkJoinPool це інструмент який дозволяє певну операцію розділити на декілька потоків, для швидкості виконання програми
public class Main {

    static long numofoperations = 1000000000;

    public static void main(String[] args) {
        System.out.println(new Date());
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.invoke(new  MyFork(0,numofoperations)));
       System.out.println(new Date());
       System.out.println(Runtime.getRuntime().availableProcessors());//Даний метод дозволяє вивести кількість ядер процесорів у компютері
    }


static class MyFork extends RecursiveTask<Long>{
        long from,to;

    public MyFork(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if (to-from<= numofoperations){
            long j =0;
            for(long i = from; i< to; i++){
                j+=i;
            }
return  j;
        }else {
    long middle =(to + from)/2;
    MyFork firstHalf = new MyFork(from, middle);
    firstHalf.fork();
    MyFork secondHalt= new MyFork(middle +1 , to);
    long secondValue = secondHalt.compute();
    return  firstHalf.join()+secondValue;
        }}
}
}
