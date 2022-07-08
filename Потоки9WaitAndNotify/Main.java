package Потоки9WaitAndNotify;

//Методи wait() і notify() є в будь якого обєкта в Java вони потрібні для синхронізації потоків

//В загальному це програма при взаємодії декількох потоків щоб потоки повідомляли  один одному що вони закінчили роботу (така собі синхронізація)
//Дана програма реалізована на трьох ключових методах:
//wait();даний метод зупиняє діючий потік і знімає блокінг з обєкта  до тих пір поки не зайде інший метод  і невикличе notify();
//notify() відновлює роботу потока який визвав wait на тім самім обєкті
//notifyAll відновлює роботу усіх потоків які викликали wait() на тім самім обєкті одному з потоків дається доступ
public class Main {
    public static void main(String[] args) throws InterruptedException {
ThreadB threadB = new ThreadB();
threadB.start();
synchronized (threadB){
    threadB.wait();// даний метод зупиняє діючий потік і знімає блокінг з обєкта  до тих пір поки не зайде інший метод  і невикличе notify();
}
    System.out.println(threadB.total);
}

static class ThreadB extends Thread{//Створюєм перший клас роботи потоку
    int total;
    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                total+=i;
                try {
                    sleep(5000);
                     } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        notify();//повідомляє про закінчення роботи потока
        }
    }
}
}
