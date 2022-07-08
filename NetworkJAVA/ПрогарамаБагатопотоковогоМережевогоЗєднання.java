package NetworkJAVA;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ПрогарамаБагатопотоковогоМережевогоЗєднання {
    public static void main(String[] args) throws IOException {

        try
        {
         int i = 1;
         ServerSocket serverSocket = new ServerSocket(8189);
         while (true)
         {
     Socket incoming = serverSocket.accept();
     System.out.println("Spawning"+i);
     Runnable runnable = new Thread((Runnable) incoming, String.valueOf(i));
     Thread thread = new Thread(runnable);
     thread.start();
     i++;
         }
        }
    catch (IOException e)
    {
    e.printStackTrace();
    }}}

    class ThreadedEcoHandler implements Runnable{

        public ThreadedEcoHandler(Socket i, int c)
        {
        incoming = i;
        counter = c;
        }

        @Override
        public void run()
        {
            try
            {
            try
            {

                    InputStream inputStream = incoming.getInputStream();
                    OutputStream outputStream = incoming.getOutputStream();


            Scanner in = new Scanner(inputStream);
                PrintWriter out = new PrintWriter(outputStream,true);
                out.println("Hello");
                boolean done = false;
                while (!done&&in.hasNextLine())
                {
            String line = in.nextLine();
            out.println("Eco"+ line);
            if (line.trim().equals("BLY"))
                done = true;
            }
            }
        finally {
                incoming.close();
            }
            }
            catch (IOException e)
            {e.printStackTrace();}

        }
private  Socket incoming;
        private  int counter;

}
























