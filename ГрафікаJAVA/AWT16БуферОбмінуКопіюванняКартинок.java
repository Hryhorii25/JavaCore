package ГрафікаJAVA;

import javax.imageio.ImageTranscoder;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.spi.ImageTranscoderSpi;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.IOException;

//В даній програмі показано як поміщати графічні обєкти в буфер обміну
public class AWT16БуферОбмінуКопіюванняКартинок {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
         Image image = new BufferedImage(300,300,BufferedImage.TYPE_INT_ARGB);
         Graphics graphics = image.getGraphics();
         graphics.fillOval(0,0,100,100);
         ImageTtansferable stringSelection = new ImageTtansferable(image);
         clipboard.setContents(stringSelection,null);

         DataFlavor flavor = DataFlavor.stringFlavor;
         if (clipboard.isDataFlavorAvailable(flavor)){
             Image image1 = (Image) clipboard.getData(flavor);
             System.out.println(clipboard.getData(flavor));
         }

    }
}


class ImageTtansferable implements Transferable{
    private Image theImage;

    public ImageTtansferable(Image image) {
        theImage = image;

    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[0];
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return false;
    }

    @Override
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        return null;
    }
}