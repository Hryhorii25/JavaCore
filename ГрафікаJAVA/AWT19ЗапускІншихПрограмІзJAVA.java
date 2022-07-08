package ГрафікаJAVA;

import java.awt.*;
import java.io.File;
import java.io.IOException;

//Програма показує як відкривати різні програми через JAVA
public class AWT19ЗапускІншихПрограмІзJAVA {
    public static void main(String[] args) throws IOException {
        if (Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            for (Desktop.Action action: Desktop.Action.values()){
                System.out.println(action);
            }
        if (desktop.isSupported(Desktop.Action.OPEN)){
                desktop.open(new File("smile.jpg"));
        }
        }

    }
}
