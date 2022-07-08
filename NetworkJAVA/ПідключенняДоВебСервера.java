package NetworkJAVA;

import java.io.*;
import java.net.*;
import java.net.URL;

/**
 * Created by Гріша on 18.11.2017.
 */
public class ПідключенняДоВебСервера {
    public static void main(String[] args) throws IOException {
        try {
            if ((args.length != 1) && (args.length!=2))
                throw new IllegalArgumentException("Неравильне число аргументів");
            OutputStream to_file;
           if (args.length==2) to_file = new FileOutputStream(args[1]);
           else to_file = System.out;



        URL url = new URL(args[0]);
            String protocol = url.getProtocol();
            String host = url.getHost();
       int port = url.getPort();



        String filename = url.getFile();
        Socket socket = new Socket(url.getHost(),url.getPort());
        InputStream from_server = socket.getInputStream();
        PrintWriter to_server = new PrintWriter(socket.getOutputStream());
        to_server.print("GET" + filename);
        to_server.flush();
        byte[] buffer = new byte[4096];
        int bytes_read;
        while ((bytes_read = from_server.read(buffer)) != -1) ;
        to_file.write(buffer, 0, bytes_read);
        socket.close();
                to_file.close();
    }
    catch (Exception e){
        System.err.println(e);
        System.err.println("Формат");

        }
    }
}
