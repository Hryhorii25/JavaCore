package ХорошийКод;



//Singelton(патерн) представляє собою певний клас з якого можна створити тільки один екземпляр каласу
public class BestPractice3Singleton {

    private static  final BestPractice3Singleton singleton = new BestPractice3Singleton();// Створення Singelton

    public BestPractice3Singleton() {}
    //Тепер програмування з використання Singelton не рекоментдоване і рідко застосовується через складність тестування методів даного
    // класу і через багато можливих проблем при роботі з даним методом


    //На даний час заміть використання  Singelton використовують клас  enum
    enum MySingleton{
        INSTANSE;
    }


    public static void main(String[] args) {


    }
}


