package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Гріша on 23.02.2018.
 */
public class AWT6ClipОбрізанняФігур {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponetnt() {
        });
    }


    static class MyComponetnt extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D)g;

            Ellipse2D ellipse2D = new Ellipse2D.Double(0,0,200,200);
            Rectangle2D rectangle2D = new Rectangle(0,0,180,180);
            graphics2D.clip(rectangle2D);//Метод обрізання фігур
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
