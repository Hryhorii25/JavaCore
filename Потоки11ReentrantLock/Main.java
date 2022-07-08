package Потоки11ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Локінг це один з видів синхронізації потоків якій  в загальному працює як синхронізація але можна більш гнучко застосовувати в коді;
public class Main { public static void main(String[] args) throws InterruptedException {
    Resorse resorse = new Resorse();
    resorse.i=5;
    MyThread myThread =new MyThread();
    MyThread myThread1 =new MyThread();

    myThread.setResorse(resorse);
    myThread1.setResorse(resorse);
    myThread.start();
    myThread1.start();
    myThread.join();
    myThread1.join();
    System.out.println(resorse.i);


}}

class MyThread extends Thread {

    Resorse resorse;

    public void setResorse(Resorse resorse) {//Це є сетер через який вводиться обєкт
        this.resorse = resorse;
    }

    @Override
    public void run() {
        resorse.changeI();
    }}



class Resorse{
    int i;
    Lock lock= new ReentrantLock();//Створення лока


    //Даний метод показує загальне користування локами тут код береться ніби як в блок який починається lock.lock(); і закінчує блок lock.unlock()
    //
    void setLock(){
        lock.lock();
    //Код
        lock.unlock();
    }


    public synchronized void changeI(){

        int i= this.i;
        i++;
        this.i=i;
        synchronized (this){}
    }


}

