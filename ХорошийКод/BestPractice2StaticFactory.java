package ХорошийКод;

//В даній програмі показано застосування статичних конструкторів і методів в програмі
public class BestPractice2StaticFactory {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.getMinivenCar("red",4);
        Car.getSportCar();




    }
}

//В даній програмі представлено абстракктно клас Машини і в данім класі може бути багато конструкторів тобто можна створити безліч типів машин
//проблема в тім що при великій кількості конструкторів можна легко заппутатись який обєкт створюєш через те що констуктори безіменні і коли
// іде створення обєкта викликається тільки констуктор Car і для усіх типів машин він буде однойменним.

class Car {
    String color;
    int dors;

    public Car() {
    }

    public Car(String color, int dors) {
        this.color = color;
        this.dors = dors;
    }

    //Даний метод є фактично гетером  створений для того щоб він був типу як конструктор обєкта в методі записані параметри обєкта який він приймає

    public static Car getSportCar() {
        return new Car("red", 2);

    }

    public Car getMinivenCar(String color,int dors) {
         this.color = color;
        this.dors = dors;
        return new Car();


    }
}