package NetworkJAVA;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//В даній програмі написана проста северна програма яка може працювати на стороні сервера,вона працює наступним чином: Cтворення
// обєкта через який можна працювати з по мережі з клієнтською програмою,потім переводиться дана програма в стан очікування поки до
// неї хтось подасть запит
public class СокетЗСторониСервера1 {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8081);//1)Створення обєкта класу через який можна звязуватись з програмою на стороні клієнта
        Socket socket = serverSocket.accept();//2)  Виклик методу який запускає сервену програму
        Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter writer  = new PrintWriter(socket.getOutputStream(),true);
        //InputStream inputStream =socket.getInputStream();
        //OutputStream outputStream  = socket.getOutputStream();

        while (scanner.hasNextLine()){
           String str = scanner.nextLine();{
               System.out.println(scanner);
           if (str.equals("exit")){
               break;
           }
           }

        }

    }}
