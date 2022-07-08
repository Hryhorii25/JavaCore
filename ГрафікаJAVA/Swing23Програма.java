package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

/**
 * Created by Гріша on 26.02.2018.
 */
public class Swing23Програма {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();

        //Блок коду для створення кнопки у графічному вікні і просиння на кнопці певної логіки
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton1=(new JButton("ТАК"));
        JButton jButton2=(new JButton("НІ"));
        JButton jButton3=(new JButton("НЕ ВИЗНАЧЕНО"));


        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);

        //Даний блок коду прописує логіку роботи при нажатті на дану кнопку
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("Відповідь так");
                jPanel.setBackground(Color.GREEN);

            }
        });


        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Відповідь ні");
                jPanel.setBackground(Color.RED);

            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Відповідь не визначено");
                jPanel.setBackground(Color.BLUE);
            }
        });




//Даний метод спрощений метод логіки кнопки
// jButton.addActionListener(EventHandler.create(ActionListener.class,jFrame,"title","source.text"));


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


