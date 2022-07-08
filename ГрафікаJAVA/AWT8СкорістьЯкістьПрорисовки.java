package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

//В даній проаграмі покані методи задання таких параметрів як швидкість і якість прорисовки обєктів
public class AWT8СкорістьЯкістьПрорисовки {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponetnt() {
        });
    }

    static class MyComponetnt extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D)g;
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//Даний блок коду відповідає за швидкість і якість
            Ellipse2D ellipse2D = new Ellipse2D.Double(50,50,100,100);

            Ellipse2D ellipse2D1 = new Ellipse2D.Double(150,50,100,100);
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);

            graphics2D.draw(ellipse2D);
            graphics2D.draw(ellipse2D1);



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
