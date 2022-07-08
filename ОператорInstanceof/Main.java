package ОператорInstanceof;
//Оператор instanceof призначений для перевірки належності обєкта до класу.Чи належить обєкт цьому класу повертає boolean(trye,fals)
public class Main {
    public static void main (String[] args ) {

    Animal animal = new Animal();
Animal animal1 = new Cat();
Animal animal2 = new Dog();
Cat cat = new Cat();
Dog dog = new Dog();
//Викликаєм опрератор instanceof яки робить перевірку чи належить обєкт animal класу Animal
if (animal instanceof Animal ){
   System.out.println("animal is instanceof Animal");
}else System.out.println("animal not instanceof Animal");

        if (animal1 instanceof Cat ){
            System.out.println("animal1 is instanceof Сat");
        }else System.out.println("animal1 not instanceof Cat");

        if (animal2 instanceof Dog ){
            System.out.println("animal2 is instanceof Dog");
        }else System.out.println("animal2 not instanceof Dog");

        //Також даним оператором можна перевірити чи клас даного обєкта імплементує певний інтерфейс

        if (cat instanceof Zrazok ){
            System.out.println("cat implement Zrazok");
        }else System.out.println("cat not implement Zrazok");



        if (dog instanceof Zrazok ){
            System.out.println("dog implement Zrazok");
        }else System.out.println("dog not implement Zrazok");



    }}
