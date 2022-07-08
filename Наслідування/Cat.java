package Наслідування;

/**
 * Created by Гріша on 23.06.2017.
 */
public class Cat extends Animal {
    String name = "Tom";
    public void bark (){
        System.out.println("MAY MAY");// Добавляємо даному класу метод
    }
    public void  eat(){                    //Тут відбувається перегрузка методу
        System.out.println("Cat is iting"); // тобто один метод буде по різному реагувати(давати різні результати)
    }                                       // в залежності від класу обєкта  яким він був викликаний

    public void showName(){
        System.out.println(name);

}
}
