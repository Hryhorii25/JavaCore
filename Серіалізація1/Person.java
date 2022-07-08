package Серіалізація1;

import java.io.Serializable;

//Сереалізація це запис обєкта(стану обєкта) в файл
public class Person implements Serializable {//Для сереалізації обєктів класу потрібно імплементувати Serializable він дозволяє це робити
    private int id;
    private String name;


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
