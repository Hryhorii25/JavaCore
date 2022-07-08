package АнонімніКласи;

/**
 * Created by Гріша on 09.07.2017.
 */
public class MyClass2 {
   public MyClass class1 = new MyClass() {
@Override
        public void method() {System.out.println("anonimm"+" myClass");


        }
    };
public void someMethod(){
    class1.method();
}

}
