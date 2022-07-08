package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

//У дані програмі показані способи створення заставок із загрузкою перед тим як вводити код потрібно зайти
// у налаштування і у вікні VM options записати -splash назву картинки
public class AWT18ЗаставкаSplashScreen  {
    public static void main(String[] args) throws InterruptedException {

        //1)Перший спосіб
        SplashScreen splashScreen = SplashScreen.getSplashScreen();
        Rectangle bounds = splashScreen .getBounds();
        Graphics2D graphics2D = splashScreen.createGraphics();
        graphics2D.setColor(Color.blue);
        for (int i=0; i<100;i++){
            graphics2D.fillRect(0,0,bounds.width*i/100,20);
            splashScreen.update();
            Thread.sleep(100);
    //


        }
}}
