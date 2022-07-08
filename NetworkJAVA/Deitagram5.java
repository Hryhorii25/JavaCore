package NetworkJAVA;

import java.net.*;

//Шилд ст 631  Дейтаграми це порції інформації передаваємі між машинами.JAVA реалізує дейтаграми
// за допомогою двох класів DatagramPacket-контейнер даних і DatagramSocked - механізм
// призначений для ослуговування DatagramPacket

//В даному прикладі реалізується проста мережева взаємодія клієнт і сервер реалізована за
// допомогою дейтаграм.В даній програмі повідомлення набираються у вікні на сервері і передаються
// по мережі на сторону клієнта де і відображаються
public class Deitagram5 {}
class WriteServer{
    public static int serverPort = 998;
    public static int clientPort = 999;
    public static  int buffer_size = 1024;
    public static DatagramSocket ds;
    public static byte buffer[] = new  byte[buffer_size];
    public static  void TheServer() throws Exception{
        int pos=0;
        while (true){
            int c = System.in.read();
            switch (c){
                case -1:
                    System.out.println("Сервер завершив роботу");
                    return;
                case 'r':
                    break;
                case 'n':
                    ds.send(new DatagramPacket(buffer,pos,InetAddress.getLocalHost(),clientPort));
            pos=0;
            break;
            default:
                buffer[pos++]=(byte)c;
            }}}

            public static  void TheClient() throws Exception{
        while (true){
            DatagramPacket p = new DatagramPacket(buffer,buffer.length);
            ds.receive(p);
            System.out.println(new String(p.getData(),0,p.getLength()));
            }
            }
    public static void main(String args[]) throws Exception{
        if (args.length==1) {
            ds = new DatagramSocket(serverPort);
            TheServer();
        }else {
            ds = new DatagramSocket(clientPort);
            TheClient();
        }
    }

}


