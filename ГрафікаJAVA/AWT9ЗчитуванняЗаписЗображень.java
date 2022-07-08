package ГрафікаJAVA;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

//В загальному дана програма показує роботу з графічними файлами або як перетворити якусь картинку
// у такий файл з яким можна працювати програмно, і як файл назад перетворити у картинку
public class AWT9ЗчитуванняЗаписЗображень {
    public static void main(String[] args) throws IOException {
        File file = new File("smile.jpg");//Зчитування картинки

        //BufferedImage це є головний клас для роботи із зображенням
        BufferedImage image1 = ImageIO.read(file);

//Даний цикл виводить список форматів зображення який підтримує JAVA
        String[] etension = ImageIO.getReaderFileSuffixes();
        for (String str: etension){
            System.out.println(str);

            //
        }
        //Даний блок коду представляє собою шаблон зчитування зображення через певний фільтр який перевіряє чи відповідає зображення пітримуваному формату
        ImageReader reader = null;
        Iterator<ImageReader> iterator =ImageIO.getImageReadersByFormatName("jpg");
        if (iterator.hasNext()) reader = iterator.next();
        InputStream inputStream = new FileInputStream(new File("smile.jpg"));
        ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
        ImageInputStream imageInputStream1 = ImageIO.createImageInputStream(new File("smile.jpg"));
        reader.setInput(imageInputStream,true);
        BufferedImage image2 = reader.read(reader.getNumImages(true));

        //На виході даного блоку отримуєм BufferedImage image2  тобто файл з яким можна працювати  програмно

        //


        //Робота з іконками
        int count = reader.getNumThumbnails(0);
        BufferedImage image3 = reader.readThumbnail(0,count);
        System.out.println(reader.getHeight(0));
        reader.getWidth(0);
        //


        //Блок коду який записує назад у зображення
        ImageWriter writer = null;
        Iterator <ImageWriter> iterator1 = ImageIO.getImageWritersByFormatName("jpg");
        if (iterator1.hasNext()) writer = iterator1.next();
        ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(new File("smile.jpg"));
        writer.setOutput(imageOutputStream);


    }
}
