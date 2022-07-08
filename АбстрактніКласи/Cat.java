package АбстрактніКласи;

/**
 * Created by Гріша on 02.07.2017.
 */
public class Cat extends Animal {
    public Cat(String name,int age){
        super(name,age);
    }


    @Override
    public void voice() {
        System.out.println("мяу-мяу");
    }
   }
