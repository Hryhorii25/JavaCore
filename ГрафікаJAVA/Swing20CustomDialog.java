package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Гріша on 21.02.2018.
 */

//Створення власних діалогових вікон
public class Swing20CustomDialog {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog myDialog = new MyDialog();
                myDialog.setVisible(true);
                jPanel.revalidate();
            }
        });

    }

//Створення класу власного діалогового вікна
    static class MyDialog extends JDialog{
        public MyDialog(){
            super(jFrame,"Title",true  );
            add(new TextField(),BorderLayout.NORTH);
            add(new JButton("button"),BorderLayout.SOUTH);
            setBounds(200,200,150,50);
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
