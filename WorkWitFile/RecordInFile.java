package WorkWitFile;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by Гріша on 04.08.2017.
 */
public class RecordInFile {
    public static void main(String[] args) throws Exception {
    File file = new File("\\D:\\ProgramingCodi\\JAVA projects\\JavaCore\\src\\WorkWitFile\\TestFile");//1)Створення обєкта класу File через який можна звязуватись з зовнішнім файлом
    PrintWriter pw = new PrintWriter(file);// 2)Обєкт даного класу дозволяє проводити запис тексту у файл
pw.println("Java ");//3)метод запису у файл викликається на обєкті класу PrintWriter у аргумент передається строка яку потрібно записати у файл
pw.println("SQL");
pw.close();

}}
