package Чорновик3;

public class Main {
    public static void main (String[] args ) {
      A a = new A();
      B b = new B();




    }

}

  class  A{
   private int age=2;
    private int heig = 3;

      public A() {
      }
    public int getAge() {
          return age;
      }

      public void setAge(int age) {
          this.age = age;
      }

      public int getHeig() {
          return heig;
      }

      public void setHeig(int heig) {
          this.heig = heig;
      }

      void somMetod(){}



    public A(int a, int b) {
        this.age = age;
        this.heig = b;
    }
}

class B extends A {
    String name= "Vasa";
    public B() {
    }

    public B(int a, int b, String name) {
        super(a, b);
        this.name = name;

    }

    @Override
    void somMetod() {
        super.somMetod();
    }
}




