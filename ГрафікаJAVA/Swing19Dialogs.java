package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// У даній програмі показано як створювати діалогові вікна або вспливаючі вікна
public class Swing19Dialogs {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args)
    {
        jFrame.add(jPanel);

        //Створення модального діалогового вікна при виводі даноного вікна інші компоненти програми будуть не доступні поки не закрити його
        JButton jButton = new JButton("show dialog");
    jPanel.add(jButton);
        jPanel.revalidate();

    jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           //Вивід різних видів даного діалогового вікна

            // JOptionPane.showMessageDialog(jPanel,"this is my dialog");

            //JOptionPane.showConfirmDialog(jPanel,"some message");

//JOptionPane.showOptionDialog(jPanel,"message","title",0,0,null, new Object[]{"one","two","three"},"two");

            JOptionPane.showInputDialog(jPanel,"some messege");
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
