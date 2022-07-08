package ПотокиЧорновик;



public class Main3  {
    public static void main(String[] args) {
        MyThreadA myThreadA = new MyThreadA();
        MyThreadB myThreadB = new MyThreadB();
;
        myThreadA.start();
        myThreadB.start();


    }
}

class MyThreadA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("MytheadB"+ i);

        }

    }
}


class MyThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("MytheadA"+ i);

        }

    }
}


class A{
    int x;
}


// Thread.yield();// Метод будь який потік який виконується в даний час  преводить у стан Runnable(Очікування) являється статичним методом
//myThread.join();// Метод гарантує повне виконання даного потоку і при його виконанні жоден інший потік не буде запускатись
// myThread.join(1000);// Метод гарантує виконання даного потоку на протязі встановленого часу і при його виконанні жоден інший потік не буде запускатись
