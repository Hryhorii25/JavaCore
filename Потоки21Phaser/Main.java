package Потоки21Phaser;

import java.util.concurrent.Phaser;

//Phaser -представим  певну   процедуру  яку  розбивають на деклька фаз(етапів) і кожну фазу, етап виконує певний потік. Суть роботи поляє в тому що
// при використанні Phaser потоки ніби поміщаються у звзаємозвязаний список або цикл  де щоб процедура була завершина потрібно щоб один
// раз виконався кожен з потоків даної процедури. Phaser робить так щоб процедура яка виконувалась в певному  циклі(процедурі) один раз і щоб кожний
// цикл даної процедури точно був виконананий
public class Main {public static void main(String[] args){
    Phaser phaser = new Phaser(2);
new Washer(phaser);
new Washer(phaser);
new Washer(phaser);
}

static  class Washer extends Thread{
    Phaser phaser;

    public Washer(Phaser phaser) {
        this.phaser = phaser;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(getName() + "wasing the car");
            phaser.arriveAndAwaitAdvance();
        }
        }

}
}


