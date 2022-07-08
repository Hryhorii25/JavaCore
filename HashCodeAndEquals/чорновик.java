package HashCodeAndEquals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class чорновик {
    public static void main(String[] args) {
        String x = "aqwerty";
        String y = "aqwerty";
        A a1 = new A();
        A a2 = new A(20);


        Set<A> set = new HashSet<>();
        set.add(a1);
        set.add(a2);



//        System.out.println(x.hashCode());
//        System.out.println(y.hashCode());
//        System.out.println(x.equals(y));


        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1.equals(y));


        System.out.println(set.size());



    }
}


class A{
    int x =10;
    String a ="qwerty";

    public A() {
    }

    public A(int x) {
        this.x = x;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return x == a.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}