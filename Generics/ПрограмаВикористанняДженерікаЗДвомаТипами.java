package Generics;


public class ПрограмаВикористанняДженерікаЗДвомаТипами {
}
class TwoGen<T,V> {
    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes() {
        System.out.println("Тип Т:" + ob1.getClass().getName());
        System.out.println("Тип V:" + ob2.getClass().getName());
    }


    T getOb1() {
        return ob1;
    }

    ;

    V getOb2() {
        return ob2;
    }

}
class SimpGen{
    public static void main( String args[] ){
TwoGen<Integer,String> twoGen = new TwoGen(88,"Дженерік");
twoGen.showTypes();
int v = twoGen.getOb1();
System.out.println(v);
String str = twoGen.getOb2();
System.out.println(str);

    }}



















































