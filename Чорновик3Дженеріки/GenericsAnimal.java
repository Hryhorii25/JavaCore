package Чорновик3Дженеріки;

/**
 * Created by Гріша on 10.09.2017.
 */


public class GenericsAnimal { public static void main (String[] args ) {
    Bodi bodi = new Bodi();
    Head1 head1 = new Head1();
    Head2 head2 = new Head2();
    Head3 head3= new Head3();
    Animal animal = new Animal(bodi,head1);



}
}

class Animal <T> {
Bodi bodi;
    T head;

    public Animal(Bodi bodi, T head) {
        this.bodi = bodi;
        this.head = head;
    }
}
class Bodi {
}



class Head1 {
    void say (){System.out.println("Гавкає");}
}


class Head2 {
    void say (){System.out.println("Мявкає");}
}


class Head3 {
    void say (){System.out.println("Кудакає");}
}