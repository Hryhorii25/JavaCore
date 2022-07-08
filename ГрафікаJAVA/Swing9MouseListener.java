package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


//Тут написана програма яка слідкує за курсором мишки і відображає кординати курсора на у графічному вікні
public class Swing9MouseListener {

    static JFrame jFrame = getFrame();

    public static void main(String[] args) {
        JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoord = e.getX();
                MyComponent.yCoord = e.getY();
                jComponent.repaint();


            }
        });
    }

    static class MyComponent extends JComponent{
        public static int xCoord;
        public static int yCoord;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Coordinates x:" + xCoord + " y:"+ yCoord, 50,50);
        }
    }




static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,300);
        return jFrame;
    }
}
