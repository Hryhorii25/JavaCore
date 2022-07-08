package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

//Swing це бібліотека призначена для створення і роботи з графічних(десктопних) програми JAVA
public class Swing1 {
    public static void main(String[] args) {

        //Даний блок коду створює графічне вікно JAVA
        JFrame jFrame = new JFrame(){}; //створення анонімного класу
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,500);//Задає розмір вікна
    jFrame.setLocation(500,300);//Задає позицію відкривання вікна
        jFrame.setTitle("JAVA windows");//Задає назву вікна
        //jFrame.setIconImage(); Задає іконку вікна

        //

//Блок коду який дозволяє визначити параметри екрану на якому виконується програма
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
    }
}
