package ЗадачіЗФілософіяJAVA;

import java.util.Random;

//Написати програму яка моделю кидок монетки ст 106 Зд 7
public class Задача1 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        boolean randomBool = randomGenerator.nextBoolean();
        if (randomBool == true) {
        System.out.println("Орел");
    }else
        System.out.println("Решка");

    }

}






