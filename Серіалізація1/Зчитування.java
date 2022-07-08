package Серіалізація1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Клас для зчитування обєтів з файлу (Десеріадізація)
public class Зчитування {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try {
           //1)Створення спеціального обєкта класу який може зчитувати потік даних файла
            FileInputStream fl = new FileInputStream("C:\\Users\\Гріша\\Desktop\\Програмування\\JAVA\\Навчальна JAVA\\Dir\\people.txt");
            ObjectInputStream ois = new ObjectInputStream(fl);//2)Створення спеціального обєкта класу який може зчитувати  обєкт з файлу
       Person person2 =(Person)ois.readObject();//3)Викликаємо метод який зчитує дані з обєкту
       Person person3 =(Person)ois.readObject();
       ois.close();
       System.out.println(person2);
       System.out.println(person3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
