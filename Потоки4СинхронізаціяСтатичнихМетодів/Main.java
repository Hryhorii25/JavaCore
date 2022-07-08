
//Різниця між синхронізацією статичних і не статичних методів полягає в тому що вони мають окремі ключі блокування тобто при одночасній
// роботі синхронізованих статичного і не статичного методів над одним обєктом вони будуть виконуватись оночасно тому одночасно їх запускати на
// одному обєкті не бажано
package Потоки4СинхронізаціяСтатичнихМетодів;

public class Main { public static void main(String[] args) throws InterruptedException {
    Resorse resorse = new Resorse();
    resorse.i=5;
    MyThread myThread =new MyThread();
MyThread myThread1 =new MyThread();


myThread.start();
myThread1.start();
myThread.join();
    myThread1.join();
    System.out.println(Resorse.i);


}}

class MyThread extends Thread {
    Resorse resorse;
    public void setResorse(Resorse resorse) {//Це є сетер через який вводиться обєкт
        this.resorse = resorse;
    }

    @Override
    public void run() {
        Resorse.changeStaticI();
    }}
class Resorse{
    static int i;
    public synchronized static void changeStaticI(){

        i++;
        Resorse.i=i;

    }
}