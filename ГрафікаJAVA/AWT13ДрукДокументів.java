package ГрафікаJAVA;

import javax.print.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

//У програмі показано як печатати картинку програмно
public class AWT13ДрукДокументів {
    public static void main(String[] args) throws PrintException, FileNotFoundException {
        DocFlavor flavor = DocFlavor.INPUT_STREAM.PNG;
        PrintService[] services = PrintServiceLookup.lookupPrintServices(flavor,null);
        InputStream inputStream = new FileInputStream("panda.jpg");
        Doc doc = new SimpleDoc(inputStream,flavor,null);
        if (services.length>0){
            DocPrintJob job = services[0].createPrintJob();
            job.print(doc,null);
        }

    }
}
