package NetworkJAVA;

//Проксі сервер працює як представник реального сервера.Коли клієнт підключається до проксі сервера
// даний сервер перенаправляє його запити в адрес реального сервера а потім поветає клієнту відповіді
// від сервера. Для клієнтів проксі серервер виглядає як справжній сервер. Для справжнього сервера проксі виглядає
// як клієнт. Проксі сервер використовується через декілька причин по перше це безпека. Проксі сервер виступає як
// прокладка між клієнтом і справжнім сервером.


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//В дані програмі показоно реалізацію простого проксі сервера він поєднує в собі можливості і якості клієнта
// і сервера одночасно
 public  class ПроксіСервер
{public static void main(String[] args) {//Даний метод аналізує аргументи і передає їх методу runServer
    try {
        //перевірка чила аргументів
        if (args.length !=3)
            throw new IllegalArgumentException("Неправильне число аргументів");


        String host = args[0];
        int remoteport = Integer.parseInt(args[1]);
        int localport = Integer.parseInt(args[2]);
       //Друк стартового екрану
        System.out.println("Запуск проксі для" + host +
                remoteport + "на порту " + localport);
        //Запуск севера
        runSrver(host,remoteport,localport);


    } catch (Exception e) {
        System.err.println(e);
        System.err.println("Формат java SimpleProxyServer" + "<host><remoteport> <localport>");
    }
}
public static void runSrver(String host, int remoteport, int localport)
    throws IOException{
    ServerSocket ss = new ServerSocket(localport);
    final  byte[] request = new byte[1024];
    byte[] reply = new byte[4096];
    while (true) {
        Socket client = null, server = null;
        try {
            client = ss.accept();
            final InputStream from_client = client.getInputStream();
            final OutputStream to_client = client.getOutputStream();
            try {
                server = new Socket(host, remoteport);} catch (IOException e) {
                PrintWriter out = new PrintWriter(to_client);
                out.print("Проксі сервер не зміг підєднатись з" + host + ":" + remoteport +
                        ":\n" + e + ":\n");
                out.flush();
                client.close();
                continue;
            }
            final InputStream from_server = server.getInputStream();
            final OutputStream to_server = server.getOutputStream();
            Thread t = new Thread() {
                public void run() {
                    int bytes_read;
                    try {
                        while ((bytes_read = from_client.read(request)) != -1) {
                            to_server.write(request);
                            to_server.flush();

                    }
                }

                    catch (IOException e) {}

                    try {to_server.close();} catch (IOException e) {}



                    }
                };
                    t.start();
int bytes_read;
try {
    while ((bytes_read = from_server.read(reply)) != -1) {
                        to_client.write(request,0, bytes_read);
                        to_client.flush();

                    }

            }
        catch (IOException e) {}
        to_client.close();
    }
                catch(IOException e){System.err.println(e);}
                finally{//Закриваєм зєднання

    try{
if(server!=null) server.close();
if(client!=null) server.close();
        }
    catch(IOException e) {}
    }
}
}
}



