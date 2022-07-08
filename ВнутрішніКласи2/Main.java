package ВнутрішніКласи2;

/**
 * Created by Гріша on 09.07.2017.
 */

public class Main {
    public static void main(String[] args) {
    MyOuter myOuter = new MyOuter("Lord");
    System.out.println(myOuter);
       // MyOuter.MyInner = myOuter.new MyInner();
    System.out.println();
  //  MyOuter.MyInner inner2 = new  MyOuter("").MyInner;
   // System.out.println("inner2:" + inner2);
        //MyOuter.MyInner inner = new MyOuter("Outer").new MyInner();
        MyOuter.MyInner inner = new MyOuter.MyInner();
        System.out.println("inn:" +inner);

    }
}