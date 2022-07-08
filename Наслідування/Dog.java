package Наслідування;

/**
 * Created by Гріша on 23.06.2017.
 */
public class Dog extends Animal {//Дане поле означає що клас Dog унаслідує
                                 // поля і методи класу Animal, клас Dog стане
                                // нащадком класу Animal
String name= "Spanci";

    public Dog(String name, int age) {
    }

    public void bark (){
    System.out.println("HAV HAV");// Добавляємо даному класу метод
}
public void  eat(){                    //Тут відбувається перегрузка методу
    System.out.println("Dog is iting"); // тобто один метод буде по різному реагувати(давати різні результати)
}                                       // в залежності від класу обєкта в якому він був викликаний

    public void showName() {

    }
}
