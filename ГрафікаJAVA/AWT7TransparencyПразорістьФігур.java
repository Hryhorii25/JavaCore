package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Гріша on 23.02.2018.
 */
public class AWT7TransparencyПразорістьФігур {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponetnt() {
        });
    }


    static class MyComponetnt extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D)g;

            Rectangle2D rectangle2D1 = new Rectangle(50,50,100,100);
            Color color1 = new Color(0f,0f,0f);
            graphics2D.setColor(color1);
graphics2D.fill(rectangle2D1);

            Rectangle2D rectangle2D2 = new Rectangle(150,50,100,100);
            Color color2 = new Color(0f,0f,0f,0.5f);//Параметер а в даному конструкторі задає прозорість обєкта
            graphics2D.setComposite(AlphaComposite.Clear);//Різвні прозорості можна задавати також методом
            graphics2D.setColor(color2);
            graphics2D.fill(rectangle2D2);

            Rectangle2D rectangle2D3 = new Rectangle(250,50,100,100);
            Color color3 = new Color(0f,0f,0f,0.1f);
            graphics2D.setColor(color3);
            graphics2D.fill(rectangle2D3);




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
