package ГрафікаJAVA;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

//Тут показано як поміщати і виводити строки з буферу обміну
public class AWT15РоботаЗБуферомОбмінуОсновиКопіюванняРядка {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException {
        //Даний блок поміщає введений текст в буфер обміну
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection("bl");
        clipboard.setContents(stringSelection,null);

        //
//Даний блок виводить текст в буфер обміну
        DataFlavor flavor = DataFlavor.stringFlavor;
        clipboard.getData(flavor);
        if (clipboard.isDataFlavorAvailable(flavor)){
            System.out.println(clipboard.getData(flavor));
        }
    }
}
