package ГрафікаJAVA;

import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;

//Фільтер  в даній програмі представляє собою набір трансформацій зображення через готові методи тобто міняти зображення картинки
public class AWT11ImageFilterФільтерЗображень {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("smile.jpg");
        BufferedImage image = ImageIO.read(file);
    BufferedImage imageFiltered = new BufferedImage(image.getWidth(),image.getHeight(),image.getType());
        AffineTransform affineTransform = AffineTransform.getRotateInstance(45,image.getWidth()/2, image.getHeight()/2);
        BufferedImageOp op = new AffineTransformOp(affineTransform,AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        op.filter(image,imageFiltered);

        ImageIO.write(imageFiltered,"jpg", new File("smile.jpg"));
        Thread.sleep(10000);

    }
}