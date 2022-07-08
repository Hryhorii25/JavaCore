package КлонуванняОбєкта;

/**
 * Created by Гріша on 29.07.2017.
 */
public class Myobgect implements Cloneable {//1)Щоб проводити клонування обєктів класу потрібно імплементувати інтерфейс Cloneable
    int i;


    @Override
    protected Myobgect clone() throws CloneNotSupportedException { //2)Оверайд методу клонування це метод класу Obgect
        return (Myobgect) super.clone();//
    }




}
