package ГрафікаJAVA;



import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

//В дані програмі показано як можна працювати програмно із зображенням
public class AWT10РоботаІзЗображеннями {
    public static void main(String[] args) throws IOException {
        File file = new File("smile.jpg");

        BufferedImage image = ImageIO.read(file);//1)Робота із зображенням іде через цей ключовий клас який приймає обєкт зображення
        WritableRaster raster = image.getRaster();//2)Друге перетворення це отримання raster із image за допомою raster можна керувати пікселями на зображенні

       //Тепер саме зображення перетворене у піксельне представляє собою інтовий масив і за допогою цикла по нім можна пройтися
        // міняючи пікселі тим самим міняючи зображення
        for (int i = 0; i < raster.getWidth();i++){
            int[]pixel = raster.getPixel(i,0,new int[4]);

            //Кожен піксель в зображенню задається трьома пармерами ці параметри являють собою градацію черевоного зеленого і
            // синього кольрів парамтри градації задаються від 1 до 255
            pixel[0]=0; //чевоний
            pixel[1]=0;//зелений
            pixel[2]=0;//синій
            //

            raster.setPixel(i,0,pixel);
        }
image.setData(raster);
        ImageIO.write(image ,"jpg",new File("smile.jpg"));


//Дані методи представляють собою введення і виведення пікселів зразу усьгого зображення
        raster.getPixels(0,0, image.getHeight(),image.getWidth(),new int[4*image.getHeight()*image.getWidth()]);
        raster.setPixels(0,0, image.getHeight(),image.getWidth(),new int[4*image.getHeight()*image.getWidth()]);

//


//Іще один спосіб щитування елементів через метод  getDataElements
        Object data = raster.getDataElements(0,0,null);
        ColorModel colorModel = image.getColorModel();
        Color color = new Color(colorModel.getRGB(data),true);
        raster.setDataElements(0,0,data);

        image.setData(raster);
        ImageIO.write(image,"jpg", new File("smile.jpg"));




    }
}
