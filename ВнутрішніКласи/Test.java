package ВнутрішніКласи;

/**
 * Created by Гріша on 08.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar();
        electrocar.start();

        //Тут відбувається створення обєкта вкладеного статичного класу.Створити обєкт типу Electrocar
        // підтипу Battery назвою battery
        Electrocar.Battery battery = new Electrocar.Battery();





    electrocar.vkladClas();//Виклик методу який ствоює вкладеий клас




    }
}