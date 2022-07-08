package СеріалізаціяЧерезПотік;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Клас для зчитування обєтів з файлу (Десеріадізація)
public class Зчитування {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       //1)Проведення серіалізації обєкта через запис і створення спеціальних обєктів у потоці
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Гріша\\Desktop\\Програмування\\JAVA\\Навчальна JAVA\\Dir\\people.txt"))){
            Person person1 =(Person)ois.readObject();//)Викликаємо метод який записує дані в обєкт
       Person person2 =(Person)ois.readObject();
            System.out.println(person1);
            System.out.println(person2);
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
