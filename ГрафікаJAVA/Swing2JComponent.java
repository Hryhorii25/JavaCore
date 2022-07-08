package ГрафікаJAVA;



import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

//Рисування обєктів у графічному вікні
public class Swing2JComponent {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }


    //Блок коду який записує текст в графічне віно та рисує фігури
    static class MyComponent extends JComponent{
       @Override
       protected void paintComponent(Graphics g) {
           Font font = new Font("JAVA WINDOWS",Font.BOLD,20);
           Graphics2D graphics2D = (Graphics2D) g;
           graphics2D.drawString("hello world",100,100);


           //Блок коду рисування фігур

           Point2D p1 = new Point2D.Double(70,70);
           Point2D p2 = new Point2D.Double(200,200);

           Line2D line2D = new Line2D.Float(p1,p2);//Даний обєкт являє собою геометричну фігуру лінія констуктор даного обєкта
                                                  // може приймати напраму введені координати так і точки типу(p1,p2)

           Ellipse2D ellipse2D = new Ellipse2D.Double(20,20,60,60);//Даний обєкт являє собою геометричну фігуру еліпс
           Rectangle2D rectangle2D = new Rectangle2D.Double(20,20,60,60);
           graphics2D.draw(line2D);//Даний метод прорисовує прийнятий обєкт в даному випадку лінія
           graphics2D.draw(ellipse2D);
           graphics2D.draw(rectangle2D);
           graphics2D.setPaint(Color.RED);


       }
   }


    //Даний блок коду створює графічне вікно JAVA
    static  JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,300);
        return jFrame;
}
}


//Даний блок коду виводить усі доступні шрифти у системі
//String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//for (String s: fonts){
//    System.out.println(s);
//}
//







