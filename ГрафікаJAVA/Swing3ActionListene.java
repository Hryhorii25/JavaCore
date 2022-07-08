package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//У даній програмі показано створення та  роботу кнопки поміщеної у графічне вікно
public class Swing3ActionListene {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();

        //Блок коду для створення кнопки у графічному вікні і просиння на кнопці певної логіки
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton=(new JButton("КНОПКА"));
        jPanel.add(jButton);

        //Даний блок коду прописує логіку роботи при нажатті на дану кнопку
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);

            }
        });
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
