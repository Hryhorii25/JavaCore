package NetworkJAVA;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Створення простої програми веб Сервера
public class ПрограмаПростогоСервера {public static void main(String[] args) throws IOException {
    ServerSocket s = new ServerSocket(8189);//1)Створення севера  з заданим  портом

    Socket incoming = s.accept();//2)Дана команда повідомляє програмі що вона повинна очікувати зверенення клієнтів


    //3)Піля того як клієнт звязався з даним сервером  метод 2 створює обєкт сокета(incoming) який предствляє встановлене зєднання
    // Днаий обєкт (incoming) тут використовується зля зчитування вхідних і запису вихідних даних
    InputStream inputStream = incoming.getInputStream();
    OutputStream outputStream = incoming.getOutputStream();

    //4)Тут представлена передача текстових даних через сокети тобто вхідний потік текстових
    // даних виводиться на екран а вихідний записується через Scanner, перетворюється в потік і передається сокетом з сервера до клієнта
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream,true);

    out.println("Hello");//5)Надсилання даних

    //6)В даному блоці програма сервер опрацьовує отримні дані і відправляє відповідь
String line = in.nextLine();
out.println("Echo:"+line);



incoming.close();//7)Закриття сокета

}}


//В загальному будь яка програма север працює наступним чином
//1)Отримання і орацювання команди  від прогами клієнта (із вхідного потоку запит на надання якоїсь інформації)
//2)Пошук і вилучення заданої інформації
//3)Передача клієнту найденої інформації через вихідний потік



//Дана вищезаписана програма з повним записом



class EchoServer {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket s = new ServerSocket(8188);

            Socket incoming = s.accept();
            try {
                InputStream inputStream = incoming.getInputStream();
                OutputStream outputStream = incoming.getOutputStream();
                Scanner in = new Scanner(inputStream);
                PrintWriter out = new PrintWriter(outputStream,true);
                out.println("Hello");
                boolean done = false;
                while (!done&& in.hasNextLine()){
                    String line = in.nextLine();
                    out.println("Echo:"+ line);
                    if (line.trim().equals("BYE"))
                        done = true;
                }
            }
        finally {
                incoming.close();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}