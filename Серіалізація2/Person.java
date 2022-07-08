package Серіалізація2;

import java.io.Serializable;

//Сереалізація це запис обєкта(стану обєкта) в файл
public class Person implements Serializable {//Для сереалізації обєктів класу потрібно імплементувати Serializable він дозволяє це робити
    private int id;
    private String name;
    private transient String famel;//Якщо поле з ссилочним типом  позначене transient то серелізуватися воно не буде
    private  transient int age;//Якщо поле з простим типом  позначене transient то серелізуватися воно буде неініцілізоване

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

public String toString(){return id+" "+name;
    }



}
