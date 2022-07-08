package WorkWitFile;

import java.io.*;

//Тут розглядається створення текстового файлу  запис у нього строки і зчитування даної строки із файла
public class RecordOutput {
    public static void main(String[] args) throws Exception {

        File file = new File("\\D:\\ProgramingCodi\\JAVA projects\\JavaCore\\src\\WorkWitFile\\TestFile1");//Створення абстрактного  файлу який буде існувати тільки в JDC
        //file.createNewFile();

    file.exists();//Метод який перевіряє чи існує насправді файл
        FileWriter fileWriter = new FileWriter(file) ;//Створення обєкта класу який дозволяє записувати дані у файл даний метод приймає виществорений file
        fileWriter.write("rop");//Викликається на обєкті метод яким можна вписуввати дані в файл
      fileWriter.write("toor");
        FileReader fileReader = new FileReader(file);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);//Створення обєкта класу який дозволяє записувати дані у файл даний метод приймає виществорений file
        bufferedWriter.write("stroca");
        bufferedWriter.write("stroca2");
        bufferedWriter.flush();////Даний метод для закінчення роботи з файлом і збереження даних
        bufferedWriter.close();//Даний метод для закінчення роботи з файлом і збереження даних
BufferedReader bufferedReader = new BufferedReader(fileReader);
while (bufferedReader.ready()){System.out.println(bufferedReader.readLine());}

    }
}
