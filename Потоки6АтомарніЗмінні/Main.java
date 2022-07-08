package Потоки6АтомарніЗмінні;

//Атомарні змінні потрібні для точності обчислень при роботі багатьох потоків на одному значенні
//https://www.ibm.com/developerworks/ru/library/j-5things15/index.html
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  static int i;
   Integer I;
static AtomicInteger atomicInteger = new AtomicInteger(0);//Введення атомарної змінної
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10000; j++) {
            new MyThead().start();

        }
Thread.sleep(2000);
        System.out.println(atomicInteger.get());
    }

static class MyThead extends Thread{
    @Override
    public void run() {
        atomicInteger.incrementAndGet();// Метод інрементаціх і++ь
        super.run();
    }
}
}























