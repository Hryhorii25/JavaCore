package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Гріша on 02.03.2018.
 */
public class Чорновик2 {
   static JFrame jFrame = getFrame();


   static JPanel jPanel = new JPanel();

    public static void main(String[] args) {

        jFrame.add(jPanel);
JFrame jFrame1 = new JFrame();

//jFrame1.setVisible(true);
//jFrame1.setBounds(jFrame.getBounds());
jFrame.setResizable(false);




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

