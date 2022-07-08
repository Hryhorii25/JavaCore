package АбстрактніКласи;

/**
 * Created by Гріша on 02.07.2017.
 */
 class Dog extends Animal {

    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    public void voice() {
        System.out.println("гав-гав");
    }
}
