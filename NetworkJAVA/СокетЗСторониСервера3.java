package NetworkJAVA;

//У даній прогарамі показано як в загальному в теперішніх програмах реалзується мережеве зєднання
// з використнням потоків де кожний запит працює в окремім потоці
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Гріша on 12.11.2017.
 */
public class СокетЗСторониСервера3 {
    public static void main(String[] args) throws IOException {
try (ServerSocket serverSocket = new ServerSocket(8098)){
while (true){
    Socket socket = serverSocket.accept();
    new Thread(new Myserver(socket)).start();
}

}


    }}
//Умовно створений клас Сервер для роботи програми
class Myserver implements Runnable {
    Socket socket;
    public Myserver(Socket socket){this.socket=socket;}
    @Override
    public void run() {
        try (Scanner scanner = new Scanner(socket.getInputStream())){
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
            if (scanner.hasNextLine())
                printWriter.println("hellow" + scanner.hasNextLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
