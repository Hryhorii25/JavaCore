package GenericsСтворенняТварини;

public class GenericsAnimal { public static void main (String[] args ) {
    Bodi bodi = new Bodi();
    Head1 head1 = new Head1();
    Head2 head2 = new Head2();
    Head3 head3= new Head3();
    Animal<Head3> animal = new Animal(bodi,head2);
Animal animal3 = new Animal(bodi,head3);
animal.getHead().say3();

}
}

class Animal <T> {
Bodi bodi;
    T head;

    public Animal(Bodi bodi, T head) {
        this.bodi = bodi;
        this.head = head;
    }


    public Bodi getBodi() {
        return bodi;
    }

    public void setBodi(Bodi bodi) {
        this.bodi = bodi;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }
}

class Bodi {}



class Head{
    public  void sayold (){System.out.println("Я є тварина");}
}



class Head1 extends Head {
    public  void say1 (){System.out.println("Гавкає");}
}


class Head2 extends Head  {
  public   void say2 (){System.out.println("Мявкає");}
}


class Head3 extends Head  {
   public void say3 (){System.out.println("Кудакає");}
}