package NetworkJAVA;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;


//Тут показаний приклад створення простої програми для забежпечення звязку в мережі інтернет через обєкт класу Socket.
// Socket це абстрактне поняття, яке дозволяє здійснювати операції обміну даними через мережу.
// Конструктору сокета передається адрес віддаленого сервера і номер порта.
public class СокетЗСторониКлієнта1 {public static void main(String[] args) throws IOException {
   try (
       Socket socket = new Socket()) {
           ;//1)Створення обєкта класу через який можна конектитись до інтернету
           // Даний обєкт володіє методами для роботи в інтернеті

    socket.connect(InetSocketAddress.createUnresolved("localhost",8081),2000);//2)Виклик методу у конструкторі якого
           // через метод можна задати імя хоста з яким звязуватись і порт через який це робити

           Scanner scanner = new Scanner(socket.getInputStream());//3) Даний обєкт буде приймати дані з хоста з яким буде звязуватись програма
     while(scanner.hasNextLine()) {
               System.out.println(scanner.nextLine());
           }
       }
   }
}
