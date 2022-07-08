package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * Created by Гріша on 21.02.2018.
 */
public class ШаблонВікнаSwing {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {

       jFrame.add(jPanel);



    }



    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-250,600,600);
        return jFrame;
    }}

