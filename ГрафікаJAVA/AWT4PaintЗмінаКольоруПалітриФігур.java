package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

//Робота з кольорами
public class AWT4PaintЗмінаКольоруПалітриФігур {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponetnt() {
        });
    }

    // Задання коліру елементу
    static class MyComponetnt extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D)g;
            graphics2D.setPaint(Color.blue);
            Ellipse2D ellipse2D = new Ellipse2D.Double(0,0,200,200);
            graphics2D.fill(ellipse2D);


        }
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,500);
        return jFrame;
    }
}
