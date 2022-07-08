package Інтерфейс2;

/**
 * Created by Гріша on 23.06.2017.
 */
public class Test {
    public static void main (String[] args ) {
Info info1 = new Animal(1);
Info info2 =new Person("Bob");
//info1.showInfo();
//info2.showInfo();
outputinfo(info1);
outputinfo(info2);


    }
public static void outputinfo(Info info ){
        info.showInfo();
}

}
