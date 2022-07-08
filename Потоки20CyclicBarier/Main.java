package Потоки20CyclicBarier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//CyclicBarier (циклічний барєр)-в загальному це такий собі цикл який запускає роботу програми за умови що виконається певна кількість
// потоків кількість потоків можна задавати
public class Main {
    public static void main(String[] args){
CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new Run());
new Sporsmen(cyclicBarrier);
new Sporsmen(cyclicBarrier);
new Sporsmen(cyclicBarrier);


    }

static class Run extends Thread{
        CyclicBarrier barrier;

    @Override
    public void run() {
       System.out.println("Run is begun");
    }
}

static class Sporsmen extends Thread{
        CyclicBarrier barrier;

    public Sporsmen(CyclicBarrier barrier) {
        this.barrier = barrier;
        //start();
    }

    @Override
    public void run() {
        try {
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
}
