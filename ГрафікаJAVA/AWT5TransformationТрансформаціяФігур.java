package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Гріша on 23.02.2018.
 */
public class AWT5TransformationТрансформаціяФігур {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponetnt() {
        });
    }

    // Трансформація елемента
    static class MyComponetnt extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D)g;
            Rectangle2D rectangle2D = new Rectangle2D.Double(0,0,100,100);


          //Методи тарансформації фігур
           // graphics2D.scale(2,2);
            //graphics2D.translate(50,50);
            //graphics2D.shear(0.1,0.2);
            graphics2D.rotate(45);

            graphics2D.draw(rectangle2D);

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
