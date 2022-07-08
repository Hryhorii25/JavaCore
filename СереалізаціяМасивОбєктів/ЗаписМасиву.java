package СереалізаціяМасивОбєктів;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Тут виконується серіалізація масиву обєків (запис масиву обєктів у файл)
public class ЗаписМасиву {public static void main(String[] args) throws IOException {

Person [] pipils = {new Person (5,"Ivan"),new Person (1,"Vasil"),new Person (1,"Kola"),new Person (1,"Igor"),};

    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Гріша\\Desktop\\Програмування\\JAVA\\Навчальна JAVA\\Dir\\pipils.txt");//1)Створення спеціального обєкта класу який може записувати потік даних у файл
        ObjectOutputStream oss = new ObjectOutputStream(fos);//2)Створення спеціального обєкта класу який може записувати обєкт у файл

        oss.writeInt(pipils.length);//2)Метод в якому задаэться довжина масиву(кількість обєктів у масиві)
        for (Person person :pipils){//3)Цикл який проходиться по масиву обєктів записуючи їх у файл
            oss.writeObject(person);
        }
        oss.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
}
