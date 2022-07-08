package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class AWT2AreasЗливанняФігур {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponetnt() {
        });
    }


    static class MyComponetnt extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D)g;
            Area area = new Area(new Rectangle2D.Double(0,0,100,100));
            area.add(new Area(new Ellipse2D.Double(50,50,150,150)));
            graphics2D.fill(area);


        }
    }


    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,1000,1000);
        return jFrame;
    }
}


