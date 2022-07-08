package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * Created by Гріша on 23.02.2018.
 */
public class AWT3StrokeЗмінаТовщиниСтилюЛіній {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponetnt() {
        });
    }

    //Рисування ліній
    static class MyComponetnt extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D)g;
Line2D line2D = new Line2D.Double(0,0,100,100);

graphics2D.setStroke(new BasicStroke(5f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER));//Метод який задає товщину ліній
            graphics2D.draw(line2D);


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
