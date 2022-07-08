package СереалізаціяМасивОбєктів;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

//Клас для зчитування обєтів з файлу (Десеріадізація)
public class ЗчитуванняМасиву {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try {

//1)Створення обєкта для зчитування даних з зовнішнього файлу
            FileInputStream fl = new FileInputStream("C:\\Users\\Гріша\\Desktop\\Програмування\\JAVA\\Навчальна JAVA\\Dir\\pipils.txt");

            ObjectInputStream ois = new ObjectInputStream(fl);//2)Створення спеціального обєкта класу який може зчитувати  обєкт з файлу

       int personsCount=ois.readInt();//3)Дана змінна вираховує кількість обєків через метод який повертає кількість
            Person[] people = new Person[personsCount];//4)Створюється погрожній масив обєктів з задаю довжиною
       for (int i=0;i<personsCount;i++){               //5)Цикл проходиться по порожньму масиву і присвоює йому значення з зовнішньго файлу
           people[i]=(Person)ois.readObject();

       }
       System.out.println(Arrays.toString(people));
       ois.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
