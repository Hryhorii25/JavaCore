package WorkWitFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Гріша on 03.08.2017.
 */
public class RO2 {
    public static void main(String[] args) throws Exception {

        File file = new File("test.txt");//Створення абстрактного  файлу який буде існувати тільки в JDC
        if (!file.exists()){
            file.createNewFile();}

        file.exists();//Метод який перевіряє чи існує насправді файл
        FileWriter fileWriter = new FileWriter(file) ;
        fileWriter.write("rop");
        fileWriter.write("toor");
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[20];
         fileReader.read(chars);
        System.out.println(chars);



    }
}


