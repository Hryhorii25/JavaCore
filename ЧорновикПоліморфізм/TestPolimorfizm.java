package ЧорновикПоліморфізм;

public class TestPolimorfizm {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();
        a1.sommetod();

        System.out.println(((B) a1).a);

    }

}




class A{
    int a= 1;


void sommetod(){
    System.out.println("I am A");
};

}




class B extends A{
    int a= 2;



    void sommetod(){System.out.println("I am B");};
}



class C{
    int a= 3;


    void sommetod(){System.out.println("I am C");};
}





class D{
    int a= 4;


    void sommetodD(){System.out.println("I am D");};
}

