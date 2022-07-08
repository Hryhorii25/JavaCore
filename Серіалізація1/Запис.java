package Серіалізація1;

import java.io.*;

//Клас для запису у файл обєтів (виконання сереалізації)
public class Запис {public static void main(String[] args) throws IOException {
Person person = new Person(1,"Oleg");
Person person1 = new Person(2,"Bod");

//Щоб здійснити запис обєкта у файл потрібно виконати наступні дії
    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Гріша\\Desktop\\Програмування\\JAVA\\Навчальна JAVA\\Dir\\people.txt");//1)Створення спеціального обєкта класу який може записувати потік даних у файл
        ObjectOutputStream oss = new ObjectOutputStream(fos) {//2)Створення спеціального обєкта класу який може записувати обєкт у файл
        };
        oss.writeObject(person);//3)Викликаємо на створеному обєкті метод який приймає обєкт і записує його в файл
        oss.writeObject(person1);
        oss.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
}
