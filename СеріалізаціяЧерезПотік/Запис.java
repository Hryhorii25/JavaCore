package СеріалізаціяЧерезПотік;

import java.io.*;

//Клас для запису у файл обєтів (виконання сереалізації)
public class Запис {public static void main(String[] args) throws IOException {
Person person = new Person(1,"Oleg");
Person person1 = new Person(2,"Bod");

//Щоб здійснити запис обєкта у файл потрібно виконати наступні дії
    try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Гріша\\Desktop\\Програмування\\JAVA\\Навчальна JAVA\\Dir\\people.txt"))) {

        oss.writeObject(person);//3)Викликаємо на створеному обєкті метод який приймає обєкт і записує його в файл
        oss.writeObject(person1);

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
}
