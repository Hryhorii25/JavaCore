package Потоки18CountDownLatch;

import java.util.concurrent.CountDownLatch;

//В даній  програмі розлядається робота CountDownLatch в загальному це працює наступним чином в CountDownLatch поміщаються потоки
// кількість даних поків можна задавати.CountDownLatch працює так як зворотній лічильник коли усі  поміщені у ньго потоки сигналізують
// про своє завершення він обнуляється і відкриває результати роботи даних потоків він не буде виводити(поветати дані в програму)
// результати роботи кожного з потоків доки не закінчать роботу усі потоки або можливі добавлення якигось умов.
// Можна гнучко використовувати  CountDownLatch в парі з методами ябо умовами
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

    new worc(countDownLatch);
    new worc(countDownLatch);
    new worc (countDownLatch);
    countDownLatch.await();
    System.out.println("old jobs done");

}
}
class worc extends Thread{
    CountDownLatch countDownLatch;

    public worc(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
   start();
    }

    @Override
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    System.out.println("I am dan forc");
        countDownLatch.countDown();
    }
}