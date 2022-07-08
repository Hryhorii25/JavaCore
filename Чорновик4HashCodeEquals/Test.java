package Чорновик4HashCodeEquals;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        A a = new A(1);
        A a1 = new A(1);



        System.out.println(  a.hashCode());
        System.out.println(  a1.hashCode());
        System.out.println(  a.equals(a1));



    }
}


class A{
    int x =5;
    public A(int x){
        this.x= x;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return x == a.x;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x);
    }
}

