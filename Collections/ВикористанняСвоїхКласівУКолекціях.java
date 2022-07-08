package Collections;

//Простий приклад використання колекцій із власним класом

import java.util.LinkedList;

public class ВикористанняСвоїхКласівУКолекціях {
    public static void main(String[] args) {

        LinkedList<Adress> m1 = new LinkedList<Adress>();//У даному випадку у колеції використувуються обєкти власного класу
        m1.add(new Adress("J.W.West","West said","Sprinfild","Texas","21212") );//Створення обєкта власного укласу у  колекції
        m1.add(new Adress("J.W.Barac","Linc Osst 367","Cenvod","Florida","22231212") );
        for (Adress adress:m1)
            System.out.print(adress);







    }
    //Власний клас який використовується у колекції
    static class Adress{
        private String name;
        private String street;
        private String city;
        private String state;
        private String code;

    public Adress(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }




    }

}
