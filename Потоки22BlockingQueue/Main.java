package Потоки22BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

//BlockingQueue це окремий клас колеццій призначений для роботи з потоками який дозволяє діставати і ставити  елементи за допомогою потоків. При використанні
// даного елемента не виникає помилок роботи потоків які ставлять і дістають елементи з якогось джерела. У даному випадку елементи поміщаються у
//  колецію і запускаються два потоки один потік ставить елементи в колекцію інший їх дістає або читає якщо запустити дану програму без
// використання BlockingQueue а записти елементи в просту колекцію тоді існує ймовірність того що першим запуститься потік який дістає елементи із колекції і тоді буде помилка
// програми так як елемент ще не існує в колекції він не записаний. BlockingQueue ніби синхронізує роботу потоків так щоб потік який записує
// інформацію викликався завжди першим
//ст 77 Хорстман,Корнел Том 2
public class Main {
    public static void main(String[] args){
        BlockingQueue<String> queue = new PriorityBlockingQueue<>();
        new Thread(){
    @Override

    public void run() {
        try {
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}.start();
new Thread(() -> queue.add("this is string")).start();
    }}
