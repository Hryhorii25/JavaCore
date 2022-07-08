package ПотокиЧорновик;

public class Main2 {
    public static void main(String[] args) {

        TestThead testThead = new TestThead();
        testThead.start();

        TestThead2 testThead2 = new TestThead2();
        testThead2.start();
Test test = new Test();

    }
}


class TestThead extends Thread{
    Test test;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {


        }
        super.run();
    }
}

class TestThead2 extends Thread{
    Test test;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {


        }
        super.run();
    }
}


class Test{
    int a;

}