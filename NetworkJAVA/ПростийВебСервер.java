package NetworkJAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//В даній програмі представлено простий багатопотоковий  веб сервер. Отримавши HTTP запит він відправляє
// даний запит в якості відповіді
public class ПростийВебСервер {
    private static boolean e;

    public static void main(String args[]) throws IOException {

    int port = Integer.parseInt(args[0]);//Створення порту по якому буде встановлено зєднаня



   //ServerSocket даний клас  використовується сервером або іншою програмою
        // яка жде чекає запиту на підключення від клієнта.
        //При створенні обєкта ServerSocket створюється порт по якому відбувається прослуховування
        // для звязку з клієнтом використовується метод accept() обєкта ServerSocket.Даний
        // метод блокує поток виконання до тих пір доки клієнт де спробує зєднатись з портом


        ServerSocket ss = new ServerSocket(port);//Створення ServerSocket для прослуховування даного порта

   //Входження в цикл очікування і обробки підключень
    for (int i = 1; i < 10000; i++) {
        //Тут іде очікування на підключення клієнта
        Socket client = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream());
        out.print("HTTP/1.0 200\n");
        out.print("Content-Type:text/plain\n");
        out.print("\n");
       //Зчитування http  запиту клієнта і повернення його
        String line = new String();
        while (line == in.readLine()) {
            if (line.length() == 0) break;
            out.print(line + "/n");
            //Закриваєм обєкт Socked тим самим розривається підключення до клієнта
            out.close();//Закриття потоків
            in.close();
            client.close();//Закриття обєкта Soked і повернення на початок циклу, де буде очікуватись нове підключення
        }

    }

    System.err.println(e);
    System.err.println("Фориат JVA HttpMirror <port>");


}
}

