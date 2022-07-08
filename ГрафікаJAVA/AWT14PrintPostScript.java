package ГрафікаJAVA;

import javax.print.*;
import java.io.*;

//Приклад програми для створення печатного файлу який можна передавати по мережі інтернет або на інший комютере і розпечатати його
public class AWT14PrintPostScript {
    public static void main(String[] args) throws FileNotFoundException, PrintException {
        DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
        String mimeType = "application/postscript";
        StreamPrintServiceFactory[] factories = StreamPrintServiceFactory.lookupStreamPrintServiceFactories(flavor, mimeType);
        OutputStream outputStream = new FileOutputStream("PostService.odd");
        StreamPrintService streamPrintService = factories[0].getPrintService(outputStream);

        InputStream inputStream = new FileInputStream("panda.jpg");
        DocPrintJob job = streamPrintService.createPrintJob();
        Doc doc = new SimpleDoc(inputStream,DocFlavor.INPUT_STREAM.JPEG,null);
        job.print(doc,null);
    }
}
