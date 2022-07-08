package Серіалізація3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Dog implements Serializable {
private  int age;
private transient   Color color;

public  Dog (Color color, int age){
    this.color=color;
    this.age=age;
}
private  void writeObject(ObjectOutputStream os){
    try {
        os.defaultWriteObject();
        os.writeObject(color.getName());
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private  void readObject (ObjectInputStream os){
    try {
        os.defaultReadObject();
        color =new Color((String)
                os.readObject());
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}

public  Color getColor(){return color;
}
public  int getAge(){return age;}
}
