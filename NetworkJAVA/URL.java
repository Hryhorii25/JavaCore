package NetworkJAVA;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class URL {public static void main(String[] args) throws IOException {

    InputStream inputStream = null;
    OutputStream outputStream = null;
    try {
        if ((args.length!=1)&&(args.length!=2))
            throw new IllegalArgumentException("Неправильне число аргументів");

        java.net.URL url = new java.net.URL(args[0]);
        inputStream = url.openStream();
        if (args.length==2){
            outputStream = new FileOutputStream(args[1]);

    }else outputStream = System.out;
byte[] buffer = new byte[4096];
int bytes_read;
while ((bytes_read=inputStream.read(buffer))!=-1);
outputStream.write(buffer,0,bytes_read);
    }
catch (Exception e){
    System.err.println(e);
    System.err.println("Формат: java GetURL<URL>");
    }
finally {
    try {
        inputStream.close(); outputStream.close();
    } catch (Exception e){}

    }

    }

}




