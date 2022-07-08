package Інтерфейси;

/**
 * Created by Гріша on 23.06.2017.
 */
public class Animal implements Info {
    int id =12;
    public Animal(int id){
        this.id=id;
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }

public void showInfo(){
        System.out.println("Id is "+this.id);
}

    @Override
    public void showAge() {System.out.println(age);

    }
}
