package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

//
public class AWT1ShapesФігури {
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
        Point2D point2D1 = new Point2D.Double(50,0);
        Point2D point2D2 = new Point2D.Double(100,50);
        Line2D line2D1 = new Line2D.Double(0,0,100,100);
        Line2D line2D2 = new Line2D.Double(0, 0,100,200);
      // graphics2D.draw(line2D1);
      // graphics2D.draw(line2D2);
      //Рисування фігур
        Rectangle2D rectangle2D = new Rectangle2D.Double(100,0,100,50);
       // graphics2D.draw(rectangle2D);

        RoundRectangle2D roundRectangle2D = new RoundRectangle2D.Double(100,200,200,20,20,20);
       // graphics2D.draw(roundRectangle2D);

        QuadCurve2D quadCurve2D = new QuadCurve2D.Double(400,0,425,100,450,0);
        graphics2D.draw(quadCurve2D);


        //Універсальна фігура
       GeneralPath generalPath = new GeneralPath();
       generalPath.moveTo(100,100);
       generalPath.lineTo(200,200);

       graphics2D.draw(generalPath);



       // JFrame.revalidate();
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
