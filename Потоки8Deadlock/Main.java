package Потоки8Deadlock;

//http://www.developersonthe.net/ru/posts/post_id/34-Vzaimnaja-blokirovkadeadlock-v-Java-i-metody-borby-s-nej/

//Deadlock це  коли є декілька потоків і вони пробують працювати з  двома деяких резурсами
// які мають зсилки один на одного. При цьому один потік пробує дістати доступ до першого ресурсу а
// другий до другого при цьому коли потоки заходять в синхронізовані методи вони їх
// заблочують тобто інший потік туди зайти не може тоді як йому потрібно зайти туди щоб провести якусь
// операцію тоді, програма зависає.
public class Main {
    public static void main(String[] args) {


    ResureceA resureceA = new ResureceA();
    ResureceB resureceB = new ResureceB();
    resureceA.resureceB = resureceB;
    resureceB.resureceA = resureceA;
    MyThread1 mythread1 = new MyThread1();
    MyThread2 mythread2 = new MyThread2();
    mythread1.resureceA=resureceA;
    mythread2.resureceB=resureceB;
    mythread1.start();
    mythread2.start();


}
}

class  MyThread1 extends Thread{
    ResureceA resureceA;
    @Override
    public void run() {
        System.out.println(resureceA.getI());
    }
}

class  MyThread2 extends Thread{
    ResureceB resureceB;
    @Override
    public void run() {
        System.out.println(resureceB.getI());
    }
}

class ResureceA{
    ResureceB resureceB;
    public synchronized int getI(){
        return resureceB.returnI();
    }
public synchronized int returnI(){
        return 1;
}

}


class ResureceB{
    public ResureceA resureceA;
    synchronized int getI(){
        return resureceA.returnI();
    }
    public synchronized int returnI(){
        return 1;
    }

}