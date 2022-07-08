package NetworkJAVA;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//В даному прикладі описується приклад роботи програми мережевого зєднання реалізованого на дейтаграмах.
//Дана програма працює наступним чином:  програма чекає на прибуття дейтаграми,прийнявши її
// вона виводить на екран вміст діаграми і імя вузла з якаго дейтаграма була відправлена.
// Щоб прийняти дейтаграму потрібно спочатку створити обєкт DatagramSocket який слухає певний порт
// локального вузла. Дане зєднання може приймати пакети,направлені в адрес цьго конкретного порта.
// Потім потрібно створити DatagramSocket.receive який буде очікувати прибуття детаграми на заданий
// порт.Коли це відбудеться тоді дані які містяться в ній перемістяться в заданий буфер і метод receive
// завершиться.Потім програма поветається в початок циклу і знову чекає


public class DeitagramForExemple {
public static final String usage="Формат: java UDReceive<port>";
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(8232);
        byte[] buffer = new byte[2048];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        for (;;){
            datagramSocket.receive(packet);
            String msg = new String(buffer,0,packet.getLength());
            System.out.println(packet.getAddress().getHostName()+msg);
            packet.setLength(buffer.length);


        }
    }

}
