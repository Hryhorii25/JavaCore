package Наслідування;

//Створюєм клас Animal з певними параметрами і методами які будуть унаслідуватися іншими підкласами цього класу
public class Animal {
String name;
final int  age =1;
    public Animal(){}
    public  void eat(){
    System.out.println("I am eating");
}
public void sleep(){
    System.out.println("I am sliping");
}
}
